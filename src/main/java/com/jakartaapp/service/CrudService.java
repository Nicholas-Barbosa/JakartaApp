package com.jakartaapp.service;

import java.util.Set;

public interface CrudService<T> {

	T save(T t);

	T findByUsername(String username);

	void delete(T t);
	
	Set<T>findAll();
}
