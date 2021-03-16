package com.jakartaapp.model;

public class User {

	private final String email;
	private final String password;
	private final String phone;

	private final Address address;

	public User(String email, String password, String phone, Address address) {
		super();
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getPhone() {
		return phone;
	}

	public Address getAddress() {
		return address;
	}

}
