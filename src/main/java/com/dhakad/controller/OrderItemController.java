package com.dhakad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dhakad.entity.OrderItem;
import com.dhakad.service.OrderItemSrevice;
import com.dhakad.service.impl.OrderItemServiceImpl;
import java.util.List;

@RestController
public class OrderItemController {

	@Autowired
	private OrderItemSrevice orderItemSrevice;
	
	@PostMapping("orderitem")
	public OrderItem addOrderItem(@RequestBody OrderItem orderItem) {
		return orderItemSrevice.addOrderItem(orderItem);
	}
	
	@GetMapping("orderitem")
	public List<OrderItem> getOrderItems(){
		return orderItemSrevice.getAllOrderItem();
	}
	
	@GetMapping("orderitem/{id}")
	public OrderItem getOrderItemById(@PathVariable("id") int id) {
		return orderItemSrevice.getOrderItemById(id);
	}
	
	@PutMapping("orderitem/{id}")
	public OrderItem updateOrderItem(@RequestBody OrderItem orderItem,@PathVariable("id") int id) {
		return orderItemSrevice.updateOrderItem(orderItem, id);
	}
	
	@DeleteMapping("orderitem/{id}")
	public OrderItem removeOrderItem(@PathVariable("id") int id) {
		return orderItemSrevice.removeOrderitem(id);
	}
	
	
}
