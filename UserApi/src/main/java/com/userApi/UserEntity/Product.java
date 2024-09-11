package com.userApi.UserEntity;



public class Product {


	private int userId;
	private int productId;
	private String productName;
	private String productdesciption;
	private int productPrice;
	
	public Product() {
		
	}
	public Product(int userId, int productId, String productName, String productdesciption, int productPrice) {
		super();
		this.userId = userId;
		this.productId = productId;
		this.productName = productName;
		this.productdesciption = productdesciption;
		this.productPrice = productPrice;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductdesciption() {
		return productdesciption;
	}
	public void setProductdesciption(String productdesciption) {
		this.productdesciption = productdesciption;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	
	
}
