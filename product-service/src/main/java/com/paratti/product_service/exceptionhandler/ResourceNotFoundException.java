package com.paratti.product_service.exceptionhandler;

public class ResourceNotFoundException extends RuntimeException{
		public ResourceNotFoundException(String message) {
			super(message);
		}
	}

