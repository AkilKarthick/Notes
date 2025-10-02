package com.paratti.product_service.service.impl;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paratti.product_service.exceptionhandler.ResourceNotFoundException;
import com.paratti.product_service.model.Product;
import com.paratti.product_service.repository.ProductRepository;
import com.paratti.product_service.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	private static final Logger logger = (Logger) LoggerFactory.getLogger(ProductServiceImpl.class);
	
	
	//field injection
	@Autowired
	private ProductRepository productRepository;
	
	//constructor injection
//	@Autowired
//	public ProductServiceImpl(ProductRepository productRepository) {
//		this.productRepository=productRepository;
//	}
	
	@Override
	public List<Product> getAllProducts() {	
		
		return productRepository.findAll();
	}

	@Override
	public Product getProductById(Long Id) {
		
		logger.info("fetchng by id " + Id);
		return productRepository.findById(Id)
			.orElseThrow(()-> 
			new ResourceNotFoundException("product not found with id" + Id));
	}

	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public void deleteProduct(Long id) {
		productRepository.deleteById(id);
		
	}

	
}
