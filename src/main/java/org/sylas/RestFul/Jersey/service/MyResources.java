package org.sylas.RestFul.Jersey.service;

import javax.ws.rs.BeanParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("myresources")
public class MyResources {

    @POST
    @Path("{id}")
    public String post(@BeanParam MyBean myBean){
        return "Hello, " + myBean.getResponse(); 
    }
}