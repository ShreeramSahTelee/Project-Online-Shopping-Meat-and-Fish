package com.shopping.service;

import java.util.List;

import com.shopping.dto.OrderDto;

public interface OrderService {
	OrderDto addOrder(OrderDto orderDto);
	List<OrderDto> getAllOrder();
	OrderDto getOrderById(int id);
	OrderDto updateOrderById(int id,OrderDto orderDto);
	String deleteOrderById(int id);

}
