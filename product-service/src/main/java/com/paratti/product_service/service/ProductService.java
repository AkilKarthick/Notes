package com.paratti.product_service.service;

import java.util.List;

import com.paratti.product_service.model.Product;

public interface ProductService {

	List<Product>getAllProducts();
	Product getProductById(Long Id);
	Product saveProduct(Product product);
	void deleteProduct(Long id);
	
}
