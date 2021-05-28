package com.dhakad.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhakad.entity.OrderItem;
import com.dhakad.repository.OrderItemRepo;
import com.dhakad.service.OrderItemSrevice;

@Service
public class OrderItemServiceImpl implements OrderItemSrevice {

	@Autowired
	private OrderItemRepo orderItemRepo;
	
	@Override
	public OrderItem addOrderItem(OrderItem orderItem) {
		orderItemRepo.save(orderItem);
		return orderItem;
	}

	@Override
	public List<OrderItem> getAllOrderItem() {
		List<OrderItem> orderItems=orderItemRepo.findAll();
		return orderItems;
	}

	@Override
	public OrderItem getOrderItemById(int id) {
		OrderItem orderItem=orderItemRepo.findById(id).get();
		return orderItem;
	}

	@Override
	public OrderItem updateOrderItem(OrderItem orderItem, int id) {
		OrderItem orderItem1=orderItemRepo.findById(id).get();
		if(orderItem.getId()==orderItem1.getId()) {
			orderItemRepo.save(orderItem);
		}
		return orderItem;
	}

	@Override
	public OrderItem removeOrderitem(int id) {
		OrderItem orderItem=orderItemRepo.findById(id).get();
		if(orderItem!=null) {
			orderItemRepo.deleteById(id);
		}
		return orderItem;
	}

}
