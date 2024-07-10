package com.boa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.boa.service.CustomerService;
import com.boa.service.CustomerServiceImpl;


@Configuration
public class CustomerConfig {
	@Bean(name= "customerBean")
public  CustomerService customerServiceImpl() {
		return new CustomerServiceImpl();
	}
	
	
}
