package com.dhakad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dhakad.entity.Customer;
import com.dhakad.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping("customer")
	public List<Customer> getAllCustomer(){
		List<Customer> customer=customerService.getAllCustomer();
		return customer;
	}
	
	@GetMapping("customer/{id}")
	public Customer getById(@PathVariable("id") int id) {
		return customerService.getCustomerById(id);
	}
	
	@PostMapping("customer")
	public Customer addNewCustomer(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
		return customer;
	}
	@PutMapping("customer/{id}")
	public Customer updateCustomer(@RequestBody Customer customer,@PathVariable("id") int id) {
		return customerService.updateCustomer(customer, id);
	}
	@DeleteMapping("customer/{id}")
	public int removeById(@PathVariable("id") int id) {
		customerService.removeById(id);
		return id;
	}
	
}
