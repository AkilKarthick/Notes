package com.paratti.product_service;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.junit.jupiter.api.Test;

import com.paratti.product_service.model.Product;
import com.paratti.product_service.repository.ProductRepository;
import com.paratti.product_service.service.ProductService;

public class ProductServiceTest {

	@Mock // Mock out the repository dependency
	private ProductRepository productRepository;
	
	@InjectMocks // Inject mocks into the service under test
	private ProductService productService;
	/*
@ExtendWith(MockitoExtension.class): Enables Mockito support.

@Mock: Creates a mock instance of ProductRepository.

@InjectMocks: Injects mocked dependencies into ProductService instance.

when(...).thenReturn(...): Mocks method behavior.

assertNotNull, assertEquals, assertThrows: Used to assert expected outcomes.

verify(...): Verifies interactions with mock.
	 */
	
	
//	@Test
//	public void testGetProductByIdwhenproductexists() {
//		
//		// Arrange: prepare test data
//        Product product = new Product();
//        product.setProductId(1L);
//        product.setName("Testing Product");
	
//	// Mock repository behavior to return the product
//    when(productRepository.findById(1L)).thenReturn(Optional.of(product));
//
//    // Act: call service method
//    Product foundProduct = productService.getProductById(1L);
//        
//     // Act: call service method
//        Product foundProduct = productService.getProductById(1L);
//     // Assert: verify the returned product
//        assertNotNull(foundProduct);
//        assertEquals("Testing Product", foundProduct.getName());
//
//        // Verify the repository method was called once only
//        verify(productRepository, times(1)).findById(1L);
//    }
}
