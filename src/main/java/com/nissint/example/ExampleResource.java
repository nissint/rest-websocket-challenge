package com.nissint.example;

import java.util.logging.Logger;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("setname")
public class ExampleResource {

	private static Logger logger = Logger.getLogger( ExampleResource.class.getName() );
	
	@POST
	@Produces( MediaType.TEXT_PLAIN )
	public String setName( String name ) {
		logger.warning( "Got name from POST: " + name );
		ExampleEndpoint.sendMessage( name );
		return name + " was sent to the websocket\n";
	}
}
