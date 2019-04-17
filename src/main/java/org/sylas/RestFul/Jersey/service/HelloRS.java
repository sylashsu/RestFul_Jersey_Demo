package org.sylas.RestFul.Jersey.service;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author sylashsu
 * @PATH Resource的位置
 * @GET, @POST, @PUT, @DELETE  所處理的Http Method。
 * @Consumes   所處理的Mime Type。對應到Http Request Header的Content-Type
 * @Produces   可產生的Mime Type。對應到Http Request Header的Accept
 * @PathParam  把變數對應到@Path中所定義的參數@QueryParam把變數對應到URI中的QueryString所定義的參數
 * @FormParam  把變數對應到Form中所定義的參數
 * @HeaderParam    把變數對應到某個Header的變數
 * @Context    將Container的Context注射(inject)到POJO當中
 */
@Path("/hello")
public class HelloRS {
   
    /* */
    @Context HttpServletRequest request;
    @Context HttpServletResponse response;
    @Context ServletContext context;
    
//    @GET
//    public String sayHelloWorld() {
//        return "Hello world";
//    }

    // @GET
    // // @Path("/{name}") //default:"[^/]+?"
    // @Path("/{name: [a-zA-Z][a-zA-Z0-9]*}") // regular expression
    // public String sayHello(@PathParam("name") String name) {
    // return "Hello, " + name;
    // }

    @GET
    @Path("/{name}")
    public String sayHello(@PathParam("name") String name, @QueryParam("count") @DefaultValue("1") int count) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < count; i++) {
            sb.append("Hello, " + name + "</br>");
        }
        return sb.toString();
    }

    @GET
    @Path("/html")
    @Produces({ "text/html", "text/plain" })
    public String sayHtmlHello() {
        return "<h1>hello</h1>";
    }

    @POST
    @Consumes("text/plain")
    @Path("/echo")
    public String sayHelloEcho(String message) {
        return "Hello, " + message;
    }
    
    @GET
    @Path("/rep")
    public Response sayHelloWorld_2() {
        return Response
        .ok("Hello world")
        .type(MediaType.TEXT_PLAIN)
        .build();
    }
    
    @GET
    @Path("/notfound")
    public Response sayNotFound() {
        return Response
        .status(404)
        .type(MediaType.TEXT_PLAIN)
        .entity("resource not found").build();
    }
    
    /*
     test command
     curl -X POST -H "Content-Type: text/plain"  -d "this is from post data"  http://localhost:8080/JerseyExample/rest/hello/echo 
    */
    
}
