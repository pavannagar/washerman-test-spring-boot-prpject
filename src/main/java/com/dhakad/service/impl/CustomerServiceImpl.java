package com.dhakad.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhakad.entity.Customer;
import com.dhakad.repository.CustomerRepo;
import com.dhakad.service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepo customerRepo;
	
	public Customer addCustomer(Customer customer) {
		customerRepo.save(customer);
		return customer;
	}

	@Override
	public void removeById(int id) {
		customerRepo.deleteById(id);
		
	}

	@Override
	public List<Customer> getAllCustomer() {
		List<Customer> customer=(List<Customer>) customerRepo.findAll();
		return customer;
	}

	@Override
	public Customer getCustomerById(int id) {
		Customer customer=customerRepo.findById(id).get();
		return customer;
	}

	@Override
	public Customer updateCustomer(Customer customer, int id) {
		if(customer.getCustomerId()==customerRepo.findById(id).get().getCustomerId()) {
			customerRepo.save(customer);
		}
		return customer;
		
	}
	
	
}
