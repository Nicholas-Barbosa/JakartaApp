package com.jakartaapp.dto;

import com.jakartaapp.model.User;

public class UserFormPost implements ModelConverter<User>{

	private String email;
	private String password;
	private String phone;

	private AddressDTO address;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setAddress(AddressDTO address) {
		this.address = address;
	}

	public AddressDTO getAddress() {
		return address;
	}

	@Override
	public  User toModel() {
		return new User(email, password, phone, address.toModel());
	}
}
