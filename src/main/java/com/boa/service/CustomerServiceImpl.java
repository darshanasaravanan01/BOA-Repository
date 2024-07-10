package com.boa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.boa.model.CustomerModel;

public class CustomerServiceImpl implements CustomerService{
	private List<CustomerModel> customers = new ArrayList<>();

	@Override
	public void createCustomer(CustomerModel customer) {
	customers.add(customer);
		
	}

	@Override
	public Optional<CustomerModel> getCustomerById(int customerId) {
		// TODO Auto-generated method stub
		return customers.stream().filter(c->c.getCustomerID()== customerId).findFirst();
	}
	@Override
	public Optional<CustomerModel> getCustomerByName(String customerName) {
		// TODO Auto-generated method stub
		 return customers.stream().filter(c->c.getCustomerName() == customerName).findFirst();
	}

	@Override
	public Optional<CustomerModel> getCustomerbyAddress(String customerAddress) {
		// TODO Auto-generated method stub
		return customers.stream().filter(c->c.getCustomerAddress()== customerAddress).findFirst();
	}

	@Override
	public void updateCustomer(CustomerModel customer) {
		getCustomerById(customer.getCustomerID()).ifPresent(c->{c.setCustomerName(customer.getCustomerName());
		});
	}
    
	
	@Override
	public void deleteCustomer(int customerId) {
		customers.removeIf(c->c.getCustomerID()==customerId);
		
	}
	
	@Override
	public void listAllCustomers()
	{
		customers.forEach(System.out::println);
	}


	

}
