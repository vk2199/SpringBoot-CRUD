package com.productApi.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productApi.Enities.ProductEntity;
import com.productApi.ProductRepository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productrepository;

	public List<ProductEntity> getAllProduct() {
		List<ProductEntity>productList=new ArrayList<ProductEntity>();
		productrepository.findAll().forEach(productList1 -> productList.add(productList1));
		return productList;
	}

	public ProductEntity getProductById(int ProductId) {
		return productrepository.findById(ProductId).get();
	}

	public ProductEntity createProduct(ProductEntity productentity) {
		
		return productrepository.save(productentity);
		
		
	}

	public void deleteProduct(int productId) {
		productrepository.deleteById(productId);
	}

	public ProductEntity updateProduct(ProductEntity productentity) {
		return productrepository.save(productentity);
		
	}
	
	

	public List<ProductEntity>getProductByUserId(int userId){
		return productrepository.findByUserId(userId);
	}

	
}
