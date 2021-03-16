package com.jakartaapp.dto;

import java.time.LocalDate;

public class HelloDTO {

	private String message;
	
	private LocalDate accessedAt;
	
	
	
	public HelloDTO(String message) {
		super();
		this.message = message;
		this.accessedAt = LocalDate.now();
	}

	public String getMessage() {
		return message;
	}
	public LocalDate getAccessedAt() {
		return accessedAt;
	}
}
