Product Service
===============
This microservice manages product-related operations in a microservices architecture.

Overview
========
Provides CRUD operations for product entities.
Secure APIs with Spring Security Basic Authentication for early development.
Supports product creation, retrieval, update, and deletion.
Validates product fields (e.g., name, description, price, stock quantity).
Implements error handling with global exception handler.
Logs important actions using SLF4J and Logback.
Unit and integration tested for reliability and correctness.


Key Functionalities
====================
Create Product: Add new products with required validations.
Get Product: Retrieve product details by ID.
Update Product: Modify existing product information.
Delete Product: Remove a product by ID.
Field Validation: Ensure product data quality.
Security: Basic Auth to protect endpoints during initial development.
Logging: Track system behavior and errors.
Exception Handling: Graceful error messages for clients.
Testing: Unit and integration tests included.


Technologies
============
Spring Boot
Spring Data JPA
Spring Security (Basic Auth)
SLF4J / Logback for logging
JUnit, Mockito for testing


Future Improvements
===================
Migrate to JWT authentication with a dedicated Authentication service.
Add API Gateway for centralized request routing and security.
Integrate with User and Order services for a complete e-commerce system.
Add more detailed audit logging and monitoring.
Enhance validation and error responses.