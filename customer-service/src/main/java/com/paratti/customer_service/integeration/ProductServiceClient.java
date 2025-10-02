package com.paratti.customer_service.integeration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.paratti.customer_service.dto.ProductDTO;

@Component
public class ProductServiceClient {

	@Autowired
    private RestTemplate restTemplate;
	
//	public ProductDTO getProductById(Long productId) {
//        String url = "http://localhost:9000/api/products/" + productId;
//        return restTemplate.getForObject(url, ProductDTO.class);
//    }
	public ProductDTO getProductById(Long productId) {
        String url = "http://localhost:9000/api/products/" + productId;

        HttpHeaders headers = new HttpHeaders();
        // Add basic auth header - use actual username/password configured in product service
        headers.setBasicAuth("adminakil", "123");

        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<ProductDTO> response = 
            restTemplate.exchange(url, HttpMethod.GET, entity, ProductDTO.class);

        return response.getBody();
    }
}
