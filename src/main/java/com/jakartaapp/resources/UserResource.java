package com.jakartaapp.resources;

import java.net.URI;
import java.util.Set;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.jakartaapp.dto.UserFormPost;
import com.jakartaapp.model.User;
import com.jakartaapp.service.UserCrudService;

@Path("user")
@Produces(value = MediaType.APPLICATION_JSON)
@Consumes(value = MediaType.APPLICATION_JSON)
public class UserResource {

	@Inject
	private UserCrudService userCrudService;

	@POST
	public Response processUser(UserFormPost user) {
		userCrudService.save(user.toModel());
		return Response.status(Status.CREATED).build();
	}

	@GET
	public Set<User> showUsers() {
		return userCrudService.findAll();
	}
}
