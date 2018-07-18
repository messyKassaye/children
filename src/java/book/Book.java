/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.servlet.ServletContainer;

/**
 *
 * @author meseret
 */
@Path("/book")
public class Book {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hello(){
        String response="hello";
        return response;
    }
    
}
