package com.jakartaapp.providers;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.ext.Provider;

@Provider
@PreMatching
public class LogginFilter implements ContainerRequestFilter, ContainerResponseFilter {

	/*
	 * ClientRequestFilter -> executada como parte da request pipeline, antes da
	 * request ser entregue a rede.
	 * 
	 * ContainerRequestFiler -> executado ao receber uma request do client.
	 * 
	 * ClientRepsonseFilter -> Executado ao receber uma response do server.
	 * 
	 * ContianerResponseFilter -> executada como parte da response pipeline, antes
	 * da response ser entregue a rede.
	 * 
	 * 
	 */
	@Override
	public void filter(ContainerRequestContext requestContext) throws IOException {
		System.out.println("ContainerRequestFilter");
		//requestContext.setMethod("POST");

	}

	@Override
	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext)
			throws IOException {
		System.out.println("Container response filter");

	}

}
