package com.jakartaapp.ejbs;

import javax.ejb.Stateless;

@Stateless
public class HelloEjb {

	public String sayHello() {
		return "Hello";
	}
}
