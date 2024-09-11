package com.productApi.ProductController;

import java.util.List;
import java.util.Optional;

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

import com.productApi.Enities.ProductEntity;
import com.productApi.ProductService.ProductService;

@RestController
@RequestMapping("/product")
@CrossOrigin()
public class ProductController {

	@Autowired
	public ProductService productservice;
	
	@GetMapping("/")
	public String productList(){
		
		return "<h1>Product List API</h1>";
	}
	
	@GetMapping("/allproduct")
	public List<ProductEntity> getAllProduct() {
		return productservice.getAllProduct();
	}
	@GetMapping("/{productId}")
	public ProductEntity getProductById(@PathVariable int productId ) {
		return productservice.getProductById(productId);
	}
	
	@PostMapping("/create")
	public ProductEntity createProduct(@RequestBody ProductEntity productEntity) {
		return productservice.createProduct(productEntity);
	}
	
	@DeleteMapping("/delete/{ProductId}")
	public void deleteproduct(@PathVariable int ProductId) {
		productservice.deleteProduct(ProductId);
	}
	@PutMapping("/update")
	public ProductEntity updateProduct(@RequestBody ProductEntity productentity) {
		
		return productservice.updateProduct(productentity);
	}
	
	@GetMapping("/user/{userId}")
	public List<ProductEntity>getProductByUserId(@PathVariable int userId){
		return productservice.getProductByUserId(userId);
	}
	
}
