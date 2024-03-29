package com.tracen.dvdrental.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tracen.dvdrental.entity.Customer;
import com.tracen.dvdrental.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;

	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	public Customer getCustomer(Long customerId) {
		return customerRepository.findById(customerId).orElse(null);
	}

	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}
	
	

}
