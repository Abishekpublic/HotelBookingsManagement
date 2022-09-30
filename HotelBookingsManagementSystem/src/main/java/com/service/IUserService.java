package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.User;
import com.repository.UserRepository;

@Service
public class IUserService {
	
	@Autowired
	UserRepository userRepository;
	
	public User addUser(User user) {
		return userRepository.save(user);
	}
	
	public User updateUser(User user) {
		int id=user.getUserId();
		User u1=userRepository.findById(id).orElseThrow();
		u1.setUserName(user.getUserName());
		u1.setEmail(user.getEmail());
		u1.setAddress(user.getAddress());
		u1.setPassword(user.getPassword());
		u1.setRole(user.getRole());
		u1.setMobile(user.getMobile());
		
		return userRepository.save(u1);
		
	}
	
	public String removeUser(int userId) {
		userRepository.deleteById(userId);
		return "User removed successfully";
	}
	
	public List<User> showAllUsers(){
		return userRepository.findAll();
	}
	
	public User showUser(int userId){
		return userRepository.findById(userId).orElseThrow();
	}
}
