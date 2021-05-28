package com.dhakad.service;

import org.springframework.stereotype.Service;

import com.dhakad.entity.OrderItem;
import java.util.List;

@Service
public interface OrderItemSrevice {

	public OrderItem addOrderItem(OrderItem orderItem);
	public List<OrderItem> getAllOrderItem();
	public OrderItem getOrderItemById(int id);
	public OrderItem updateOrderItem(OrderItem orderItem,int id);
	public OrderItem removeOrderitem(int id);
	
	
	
}
