package org.neu.ying.cloudservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Ying on 1/31/18.
 */

@Path("students")
public class StudentResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN) // define the type of response
    public String getStudent() {
        return "Hello Word";
    }

}
