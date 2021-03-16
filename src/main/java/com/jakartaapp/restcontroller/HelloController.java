package com.jakartaapp.restcontroller;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.jakartaapp.dto.HelloDTO;
import com.jakartaapp.ejbs.HelloEjb;

@Path("/hello")
public class HelloController {

	@EJB
	private HelloEjb helloEjb;

	@GET
	public Response hello() {
		return Response.ok(helloEjb.sayHello()).build();
	}

	@GET
	@Path("dto")
	@Produces(MediaType.APPLICATION_JSON)
	public Response helloDto() {
		return Response.ok(new HelloDTO(helloEjb.sayHello())).build();
	}
}
