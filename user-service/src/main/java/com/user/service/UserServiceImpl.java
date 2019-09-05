package com.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.UserRepository;
import com.user.domain.User;
import com.user.util.UserNotFoundException;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

	@Override
	public User getUser(Long userid) {
		return userRepo.findById(userid).orElseThrow(() -> new UserNotFoundException("Requested user details not found"));
	}

	@Override
	public User saveOrUpdate(User user) {
		return userRepo.save(user);
	}

	@Override
	public Long deleteUser(Long userid) {
		userRepo.deleteById(userid);
		return userid;
	}

	
}
