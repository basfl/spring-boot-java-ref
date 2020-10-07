package com.demo;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.velocity.VelocityContext;

import yahoofinance.YahooFinance;
import yahoofinance.quotes.fx.FxQuote;
import yahoofinance.quotes.fx.FxSymbols;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.URLClassLoader;

import org.glassfish.grizzly.http.server.HttpServer;

import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * Hello world!
 *
 */
public class App 
{
	 private static final URI BASE_URI = URI.create("http://localhost:8082/base/");
	    /**
	     * "Hello World" root resource path.
	     */
	    public static final String ROOT_PATH = "helloworld";
	final static Logger logger = Logger.getLogger(App.class);
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        logger.info("hiiii");
        VelocityContext context = new VelocityContext();
        context.put("author", "Elliot A.");
        context.put("address", "217 E Broadway");
        context.put("phone", "555-1337");
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        FxQuote usdeur = YahooFinance.getFx(FxSymbols.USDEUR);
        FxQuote usdgbp = YahooFinance.getFx("USDGBP=X");
        System.out.println(usdeur);
        System.out.println(usdgbp);

        URL[] urls = ((URLClassLoader)cl).getURLs();

        for(URL url: urls){
        	System.out.println(url.getFile());
        }
        
      
    }
}
