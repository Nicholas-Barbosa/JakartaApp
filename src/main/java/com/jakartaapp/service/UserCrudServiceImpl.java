package com.jakartaapp.service;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import javax.inject.Named;

import com.jakartaapp.model.User;

@Named
public class UserCrudServiceImpl implements UserCrudService {

	private static final Map<String, User> map = new ConcurrentHashMap<>();

	@Override
	public User save(User t) {
		// TODO Auto-generated method stub
		return map.put(t.getEmail(), t);
	}

	@Override
	public User findByUsername(String username) {
		// TODO Auto-generated method stub
		return map.get(username);
	}

	@Override
	public void delete(User t) {
		map.remove(t.getEmail());

	}

	@Override
	public Set<User> findAll() {
		// TODO Auto-generated method stub
		return map.values().stream().collect(Collectors.toSet());
	}

}
