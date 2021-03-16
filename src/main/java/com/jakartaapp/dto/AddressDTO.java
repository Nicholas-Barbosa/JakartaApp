package com.jakartaapp.dto;

import com.jakartaapp.model.Address;

public class AddressDTO implements ModelConverter<Address>{

	private  String country;
	private  String zipCode;
	private  String street;
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	
	@Override
	public Address toModel() {
		return new Address(country, zipCode, street);
	}
	
}
