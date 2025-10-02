package com.paratti.customer_service.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paratti.customer_service.model.Customer;
import com.paratti.customer_service.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}
	
	public Customer getCustomerById(Long customerId) {
		return customerRepository.findById(customerId).orElse(null);

		/*
		 * public Optional<Customer> getCustomerById(Long customerId) {
		   return customerRepository.findById(customerId);
		 */
	}
	
	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer);
	}
	
	public Customer updateCustomer(Long id, Customer customerDetails) {
		Customer customer = getCustomerById(id);
		customer.setFirstName(customerDetails.getFirstName());
		customer.setLastName(customerDetails.getLastName());
        customer.setEmail(customerDetails.getEmail());
        customer.setAddress(customerDetails.getAddress());
        customer.setPhoneNumber(customerDetails.getPhoneNumber());
        return customerRepository.save(customer);
	}
	public void deleteCustomer(Long id) {
        Customer customer = getCustomerById(id);
        customerRepository.delete(customer);
    }
}
