package com.dhakad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhakad.entity.Customer;
import com.dhakad.repository.CustomerRepo;

@Service
public interface CustomerService {

	public Customer addCustomer(Customer customer);
	public void removeById(int id);
	public List<Customer> getAllCustomer();
	public Customer getCustomerById(int id);
	public Customer updateCustomer(Customer customer,int id);

}
