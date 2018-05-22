package com.softvision.service;

import com.softvision.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
