package com.user.service;

import java.util.List;

import com.user.domain.User;

public interface UserService {
	
	public List<User> getAllUsers();
	
	public User getUser(Long userid);
	
	public User saveOrUpdate(User user);
	
	public Long deleteUser(Long userid);

}
