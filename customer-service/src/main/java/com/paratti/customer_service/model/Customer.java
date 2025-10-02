package com.paratti.customer_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long customerId;
	
	@NotBlank(message="First name is mandatory")
	private String firstName;
	
	@NotBlank(message="Last name is mandatory")
	private String lastName;
	
	@Email(message = "Email should be valid")
	private String email;
	
	@NotBlank(message = "Address is mandatory")
	private String address;
	
	@Size(min = 10, max = 15, message = "Phone number should be valid")
	private String phoneNumber;

	public Customer() {}
	
	public Customer(@NotBlank(message = "First name is mandatory") String firstName,
			@NotBlank(message = "Last name is mandatory") String lastName,
			@Email(message = "Email should be valid") String email,
			@NotBlank(message = "Address is mandatory") String address,
			@Size(min = 10, max = 15, message = "Phone number should be valid") String phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", address=" + address + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
}
