package com.paratti.product_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long productId;
	
	@NotBlank(message ="name is mandatory")
	private String name;
	
	@NotBlank(message = "Description is mandatory")
	private String description;
	
	@Min(value=0, message ="Price should be positive")
	private double price;
	
	@Min(value= 0, message ="Quantity should be positive or zero")
	private int quantityInStock;
	
	public Product() {}  //default const

	public Product(String name, String description, double price, int quantityInStock) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantityInStock = quantityInStock;
	}
	
	
	//getter & setter below

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantityInStock() {
		return quantityInStock;
	}

	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", description=" + description + ", price="
				+ price + ", quantityInStock=" + quantityInStock + "]";
	}

	
	
	
	
	
}
