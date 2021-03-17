package com.jakartaapp.providers;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;
import javax.ws.rs.ext.Provider;

@Provider
public class Provider1 {

	public Provider1() {
		System.out.println("Provider1 constructor no args!");
	}


}
