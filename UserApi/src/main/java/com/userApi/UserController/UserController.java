package com.userApi.UserController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.userApi.UserEntity.UserEntity;
import com.userApi.UserService.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
	
	@Autowired
	UserService userservice;
	@GetMapping("/")
	public String userList() {
		return "<h1>User List API</h1>";
		
	}
	@GetMapping()
	public List<UserEntity> getAllUser(){
		
		List<UserEntity> user=userservice.getAllUser();
		return user;
		
	}
	@GetMapping("/allUserProduct")
	public List<UserEntity> getAllUsersWithProducts() {
		return userservice.getAllUsersWithProducts();
	}
	@GetMapping("/{userId}")
	public UserEntity getUserById(@PathVariable int userId){
		
		return userservice.getUserById(userId);
		
	}
	@PostMapping("/createUser")
	public UserEntity createUser(@RequestBody UserEntity userentity) {
		return userservice.createUser(userentity);
	}
	
	@PutMapping("/updateUser")
	public UserEntity updateUser(@RequestBody UserEntity userentity){
		return userservice.updateUser(userentity);
	}
	@DeleteMapping("/delete/{userId}")
	public void deleteuser(@PathVariable int userId) {
		userservice.deleteUser(userId);
	}
	
	
}
