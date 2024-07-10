package com.boa.service;

import java.util.Optional;

import com.boa.model.CustomerModel;

public interface CustomerService {

	void createCustomer(CustomerModel customer);
	Optional<CustomerModel> getCustomerById(int customerId);
	Optional<CustomerModel>getCustomerByName(String customerName);
	Optional<CustomerModel>getCustomerbyAddress(String customerAddress);
	
	void updateCustomer(CustomerModel customer);
	void deleteCustomer(int customerId);
	void listAllCustomers();
	
	
}
