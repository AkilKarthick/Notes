package com.paratti.product_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paratti.product_service.model.Product;
import com.paratti.product_service.service.ProductService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	
	@Autowired
	private ProductService productService;
	
	//get all products
	@GetMapping()
	public List<Product> getAllProducts(){
		return productService.getAllProducts();
	}

	//get product by id
	@GetMapping("/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable Long id){
		Product product= productService.getProductById(id);
		if(product == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(product);
	}
	
	//create new product
	@PostMapping
	public Product createProduct(@Valid @RequestBody Product product) {
		return productService.saveProduct(product);
	}
	
	// Update existing product
	@PutMapping("/{id}")
	public ResponseEntity<Product> updateProduct(@PathVariable Long id, @Valid @RequestBody Product productDetails){
		Product product = productService.getProductById(id);
		if(product == null) {
			return ResponseEntity.notFound().build();
		}else
			product.setName(productDetails.getName());
			product.setDescription(productDetails.getDescription());
	        product.setPrice(productDetails.getPrice());
	        product.setQuantityInStock(productDetails.getQuantityInStock());
        
        Product updatedProduct =productService.saveProduct(product);
        return ResponseEntity.ok(updatedProduct);			
	}
	
	//delete a product
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteProduct(@PathVariable long id){
		productService.deleteProduct(id);
		return ResponseEntity.ok().build();
	}
	
}
