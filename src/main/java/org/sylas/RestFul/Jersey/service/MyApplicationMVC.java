package org.sylas.RestFul.Jersey.service;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.mvc.jsp.JspMvcFeature;
 

public class MyApplicationMVC extends ResourceConfig{
    public MyApplicationMVC(){
        packages("org.sylas.RestFul.Jersey.controller");
        //Jersery MVC
        register(JspMvcFeature.class);
        property(JspMvcFeature.TEMPLATES_BASE_PATH, "/WEB-INF/jsp");
    }
}