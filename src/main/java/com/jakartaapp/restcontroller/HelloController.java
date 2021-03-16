package com.jakartaapp.restcontroller;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.jakartaapp.ejbs.HelloEjb;

@Path("/hello")
public class HelloController {

	@EJB
	private final HelloEjb helloEjb;

	public HelloController(HelloEjb helloEjb) {
		super();
		this.helloEjb = helloEjb;
	}

	@GET
	public Response hello() {
		return Response.ok(helloEjb.sayHello()).build();
	}
}
