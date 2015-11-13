package com.nissint.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("example")
public class ExampleResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getCities() {
		
		return "Stuff\n";
	}
}
