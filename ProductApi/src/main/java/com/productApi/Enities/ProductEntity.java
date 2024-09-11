package com.productApi.Enities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="product")
public class ProductEntity {
	
	@Id
	private int productId;

	private String productName;
	private String productdesciption;
	private int productPrice;
	private int userId;
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public ProductEntity(int productId, int userId, String productName, String productdesciption, int productPrice) {
		super();
		this.productId = productId;
		this.userId = userId;
		this.productName = productName;
		this.productdesciption = productdesciption;
		this.productPrice = productPrice;
	}
	
	
	public ProductEntity() {
		
	}

	public ProductEntity(int productId, String productName, String productdesciption, int productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productdesciption = productdesciption;
		this.productPrice = productPrice;
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
