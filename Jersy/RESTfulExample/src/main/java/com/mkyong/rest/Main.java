package com.mkyong.rest;

import java.io.IOException;
import java.net.URI;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class Main {

	public static void main(String[] args) throws IOException {
		  final URI BASE_URI = URI.create("http://localhost:8080/base/");
		 final HttpServer server = GrizzlyHttpServerFactory.createHttpServer(BASE_URI, create(), false);
		 server.start();

	}

	private static ResourceConfig create() {
        final ResourceConfig resourceConfig = new ResourceConfig(HelloWorldService.class);

        return resourceConfig;
    }

}
