package org.sylas.RestFul.Jersey.service;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.mvc.jsp.JspMvcFeature;
 
@ApplicationPath("rest")
public class MyApplication extends ResourceConfig{
    public MyApplication(){
        packages("rg.sylas.RestFul.Jersey.service");
    }
}