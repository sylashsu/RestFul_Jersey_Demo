package org.sylas.RestFul.Jersey.service;

import javax.ws.rs.FormParam;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.PathParam;

public class MyBean {
    @FormParam("myData")
    private String data;
  
    @HeaderParam("myHeader")
    private String header;
  
    @PathParam("id")
    public void setResourceId(String id) {
        System.out.println("setResourceId = "+id);
        data = "Data:" + id +", response from Mybean ";
        header = "Header:" + id + "\n";
    }
    
    public String getResponse(){
        return header + data;   
    }
}
