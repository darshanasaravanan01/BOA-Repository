package com.boa.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.boa.config.AppConfig;
import com.boa.config.CentralizedConfig;
import com.boa.model.CustomerModel;
import com.boa.service.CustomerService;
import com.boa.service.CustomerServiceImpl;
import com.boa.service.HelloWorld;

@SpringBootApplication
public class BoaSpringCoreDemoApplication {

	public static void main(String[] args) {
		// We need configure the Application Conrtext here for look up the App file 
		 // spring XML and others
		//SpringApplication.run(CoreSpringBoaApplication.class, args);
		//System.out.println("my first Spring 5 App Up with setup");
		
		// look using the Application Context bean look up 
		
		ApplicationContext context=SpringApplication.run(CentralizedConfig.class);
		
        // look up to bean classs 
       
		 HelloWorld lookup=(HelloWorld) context.getBean("helloBean");
		 
		 
      
		 System.out.println(lookup.printDetails("BOA Training"));
		 System.out.println("--------------->");
		 
		 CustomerService customerService = (CustomerService) context.getBean("customerBean");
		 CustomerModel customer1 = new CustomerModel(1, "Rama","Delhi");
			CustomerModel customer2 = new CustomerModel(2, "Radhika","Chennai" );
			
			
	 
			customerService.createCustomer(customer1);
			customerService.createCustomer(customer2);
			System.out.println("AllCustomer :");
			customerService.listAllCustomers();
		 
			
			
			customerService.deleteCustomer(2);
			System.out.println("\n All Customers after deletion:");
			customerService.listAllCustomers();
	}
}
