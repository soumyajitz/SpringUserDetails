package com.jit.app.ws.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.jit.app.ws.shared.dto.UserDto;

public interface UserService extends UserDetailsService {
	UserDto CreateUser(UserDto user);
	UserDto getUser(String email);
	UserDto getUserByUserId(String id);
}
