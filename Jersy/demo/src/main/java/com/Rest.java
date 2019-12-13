package com;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author Janus Friis Nielsen (jfn at fagidiot.dk)
 */
@Path("api")
public class Rest {
    public static final String CLICHED_MESSAGE = "Hello World!";

    @GET
    public String getHello() {
        return CLICHED_MESSAGE;
    }

}
