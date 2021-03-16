package com.jakartaapp.dto;

import java.time.LocalDate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.jakartaapp.adapter.LocalDateAdapter;

@XmlRootElement(name = "hello")
@XmlAccessorType(XmlAccessType.FIELD)
public class HelloDTO {

	@XmlElement(name = "message")
	private String message;
	@XmlElement(name = "accessedAt", required = true)
	@XmlJavaTypeAdapter(LocalDateAdapter.class)
	private LocalDate accessedAt;

	public HelloDTO() {
		// TODO Auto-generated constructor stub
	}

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
