package com.dhakad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dhakad.entity.Order_Table;
import com.dhakad.service.Order_TableService;
import java.util.*;


@RestController
public class Order_TableController {

	@Autowired
	private Order_TableService order_TableService;

	@PostMapping("order")
	public Order_Table addOrder(@RequestBody  Order_Table order_Table) {
		return order_TableService.addOrder(order_Table);
	}

	@GetMapping("order")
	public List<Order_Table> getAllOrder(){
		return order_TableService.getAllOrder();
	}

	@GetMapping("order/{id}")
	public Order_Table getOrderById(@PathVariable("id") int id) {
		return order_TableService.getOrderById(id);
	}
	
	@PutMapping("order/{id}")
	public Order_Table updateOrder(@RequestBody Order_Table order_Table,@PathVariable("id") int id) {
		return order_TableService.updateOrder(order_Table, id);
	}

	@DeleteMapping("order/{id}")
	public Order_Table removeOrder(@PathVariable("id") int id) {
		return order_TableService.removeOrder(id);
	}









}
