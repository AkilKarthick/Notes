package com.paratti.customer_service.dto;

public class ProductDTO {
	
	private Long productId;
    private String name;
    private Double price;

    // Constructors
    public ProductDTO() {}

    public ProductDTO(Long productId, String name, Double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getters and setters
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
