package com.productApi.ProductRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productApi.Enities.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity,Integer>{

	List<ProductEntity> findByUserId(int userId);

}
