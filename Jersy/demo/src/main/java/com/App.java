package com;

import org.glassfish.grizzly.http.server.HttpServer;

import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.io.IOException;
import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This is the example entry point, where Jersey application for the example
 * gets populated and published using the Grizzly 2 HTTP container.
 *
 * @author Janus Friis Nielsen (jfn at fagidiot.dk)
 */
public class App {

    private static final URI BASE_URI = URI.create("http://localhost:8082/base/");
    /**
     * "Hello World" root resource path.
     */
    public static final String ROOT_PATH = "helloworld";

    /**
     * Main application entry point.
     *
     * @param args application arguments.
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
      
            System.out.println("\"Hello World\" Jersey Example App");

            final HttpServer server = GrizzlyHttpServerFactory.createHttpServer(BASE_URI, create(), false);
         
            server.start();

            System.out.println(
                    String.format("Application started.%n"
                                    + "Try out %s%s%n"
                                    + "Stop the application using CTRL+C",
                            BASE_URI, ROOT_PATH));

            
       

    }

    /**
     * Create example application resource configuration.
     *
     * @return initialized resource configuration of the example application.
     */
    public static ResourceConfig create() {
        final ResourceConfig resourceConfig = new ResourceConfig(Rest.class);

        return resourceConfig;
    }
}
