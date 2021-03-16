package com.jakartaapp.model;

public class Address {

	private final String country;
	private final String zipCode;
	private final String street;

	public Address(String country, String zipCode, String street) {
		super();
		this.country = country;
		this.zipCode = zipCode;
		this.street = street;
	}

	public String getCountry() {
		return country;
	}

	public String getZipCode() {
		return zipCode;
	}

	public String getStreet() {
		return street;
	}

}
