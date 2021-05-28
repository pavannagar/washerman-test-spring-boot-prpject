package com.dhakad.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhakad.entity.Order_Table;
import com.dhakad.repository.Order_TableRepo;
import com.dhakad.service.Order_TableService;

@Service
public class Order_TableServiceImpl implements Order_TableService{

	@Autowired
	private Order_TableRepo order_TableRepo;
	
	@Override
	public Order_Table addOrder(Order_Table order_Table) {
		order_TableRepo.save(order_Table); 
		return order_Table;
	}

	@Override
	public List<Order_Table> getAllOrder() {
		List<Order_Table> order_Tables=order_TableRepo.findAll();
		return order_Tables;
	}

	@Override
	public Order_Table getOrderById(int id) {
		Order_Table order_Table=order_TableRepo.findById(id).get();
		return order_Table;
	}

	@Override
	public Order_Table removeOrder(int id) {
		Order_Table order_Table=order_TableRepo.findById(id).get();
		if(order_Table!=null) {
			order_TableRepo.deleteById(id);
		}
		return order_Table;
	}

	@Override
	public Order_Table updateOrder(Order_Table order_Table, int id) {
		Order_Table order_Table1=order_TableRepo.findById(id).get();
		if(order_Table.getOrderId()==order_Table1.getOrderId()) {
			order_TableRepo.save(order_Table);
		}
		return order_Table;
	}

}
