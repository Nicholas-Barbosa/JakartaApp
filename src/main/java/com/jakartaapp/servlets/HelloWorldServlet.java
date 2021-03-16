package com.jakartaapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jakartaapp.ejbs.HelloEjb;

@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final Logger log = LoggerFactory.getLogger(HelloWorldServlet.class);

	@EJB
	private HelloEjb helloEjb;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(helloEjb.sayHello());

		PrintWriter writer = resp.getWriter();
		writer.println("<h1>" + helloEjb.sayHello() + "</h1>");
	}

	@Override
	public void init() throws ServletException {
		log.info("Init servlet " + this.getServletName());
		super.init();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		log.info("service() servlet " + this.getServletName());
		super.service(req, resp);
	}

	@Override
	public void destroy() {
		log.info("destroy() servlet " + this.getServletName());
		super.destroy();
	}
}
