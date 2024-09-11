package com.userApi.UserService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.productApi.Enities.ProductEntity;
import com.userApi.UserEntity.Product;
import com.userApi.UserEntity.UserEntity;
import com.userApi.UserRepository.UserRepository;

import jakarta.ws.rs.HttpMethod;

@Service
public class UserService {
	
	@Autowired
	UserRepository userrepository;
	@Autowired
	RestTemplate resttemplate;

	public List<UserEntity> getAllUser() {
		
		return userrepository.findAll();
	}

	public UserEntity getUserById(int userId) {
		UserEntity user= userrepository.findById(userId).get();
		//http://localhost:8082/product/user/102
		
		ArrayList<Product> userofproduct =resttemplate.getForObject("http://PRODUCTAPI/product/user/"+user.getUserId(), ArrayList.class);
		
		user.setProduct(userofproduct);
		
		return user;
	}

	public UserEntity createUser(UserEntity userentity) {
		
		return userrepository.save(userentity);
	}

	public UserEntity updateUser(UserEntity userentity) {

		return userrepository.save(userentity);
	}

	public void  deleteUser(int userId) {
		userrepository.deleteById(userId);
	}

	public List<UserEntity> getAllUsersWithProducts() {
	    List<UserEntity> users = userrepository.findAll();
	    
	    for (UserEntity user : users) {
	    	
	        // Fetch products for the user
	    	//http://PRODUCTAPI/product/user/" + user.getUserId()
	        ArrayList<Product> userProducts = resttemplate.getForObject("http://PRODUCTAPI/product/user/"+user.getUserId(), ArrayList.class);
	        user.setProduct(userProducts);
	    }
	    
	    return users;
	}

	
	
}
