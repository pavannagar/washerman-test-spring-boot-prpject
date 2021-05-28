package com.dhakad.service;

import org.springframework.stereotype.Service;

import com.dhakad.entity.Order_Table;
import java.util.List;
@Service
public interface Order_TableService {

	
	public Order_Table addOrder(Order_Table order_Table);
	public List<Order_Table> getAllOrder();
	public Order_Table getOrderById(int id);
	public Order_Table removeOrder(int id);
	public Order_Table updateOrder(Order_Table order_table,int id);
	
}
