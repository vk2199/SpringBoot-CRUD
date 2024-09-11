package com.userApi.UserEntity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="user")
public class UserEntity {
	
	@Id
	private int userId;
	
	@Column
	private String userName;
	
	@Transient
	List<Product>Product=new ArrayList<>();
	
	public UserEntity() {
		
	}
	public UserEntity(int userId, String userName, List<Product> userProduct) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.Product = userProduct;
	}

	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public List<Product> getProduct() {
		return Product;
	}


	public void setProduct(List<Product> userProduct) {
		this.Product = userProduct;
	}


	
	

}
