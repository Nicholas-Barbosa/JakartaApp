package com.jakartaapp.resources;

import java.net.URI;

import javax.ejb.EJB;
import javax.servlet.ServletContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.jakartaapp.dto.HelloDTO;
import com.jakartaapp.dto.HelloForm;
import com.jakartaapp.ejbs.HelloEjb;

@Path("/hello")
public class HelloResource {

	@EJB
	private HelloEjb helloEjb;

	@Context
	private ServletContext httpServletRequest;

	@GET
	public Response hello() {
		return Response.ok(helloEjb.sayHello()).build();
	}

	@GET
	@Path("dto")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response helloDto(@HeaderParam(value = "name") String headerValue) {
		// throw new WebApplicationException("fodeu", 404);
		return Response.ok(new HelloDTO(helloEjb.sayHello() + " " + headerValue)).build();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createDto(HelloForm hello) {
		System.out.println("hello " + hello);
		return Response.created(URI.create("")).build();
	}
}
