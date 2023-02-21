package com.shopping.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.dto.OrderDto;
import com.shopping.entity.Order;
import com.shopping.exception.IdNotFoundException;
import com.shopping.repository.OrderRepository;
import com.shopping.utility.AppConstant;
@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	OrderRepository orderRepository;

	@Override
	public OrderDto addOrder(OrderDto orderDto) {
		
		return convertToDto(orderRepository.save(convertToEntity(orderDto)));
	}

	@Override
	public List<OrderDto> getAllOrder() {
		List<Order> orders=orderRepository.findAll();
		List<OrderDto> orderDto=new ArrayList<>();
		for(Order order:orders) {
			orderDto.add(convertToDto(order));
		}
		return orderDto;
		
	}

	@Override
	public OrderDto getOrderById(int id) {
		Optional<Order> optOrder=orderRepository.findById(id);
		if(optOrder.isPresent()) {
			return convertToDto(optOrder.get());
		}
		else {
			throw new IdNotFoundException(AppConstant.ID_NOT_FOUND_MESSAGE);
		}
	}

	@Override
	public OrderDto updateOrderById(int id, OrderDto orderDto) {
		Optional<Order> optOrder=orderRepository.findById(id);
		if(optOrder.isPresent()) {
			return convertToDto(orderRepository.save(convertToEntity(orderDto)));
		}
		else {
	    throw new IdNotFoundException(AppConstant.ID_NOT_FOUND_MESSAGE);
		}
	}

	@Override
	public String deleteOrderById(int id) {
		
		Optional<Order> optOrder=orderRepository.findById(id);
		if(optOrder.isPresent()) {
			orderRepository.deleteById(id);
			return "id is deletd";
		}
		else {
	    throw new IdNotFoundException(AppConstant.ID_NOT_FOUND_MESSAGE);
		}
	}
	
	private OrderDto convertToDto(Order order) {
		OrderDto orderDto=new OrderDto();
		orderDto.setId(order.getId());
		orderDto.setOrderName(order.getOrderName());
		orderDto.setOrderType(order.getOrderType());
		orderDto.setOrderDateTime(LocalDateTime.now());
		orderDto.setOrderPrice(order.getOrderPrice());
		orderDto.setItems(order.getItems());
		return orderDto;
	}
    
	private Order convertToEntity(OrderDto orderDto) {
		Order order=new Order();
		order.setId(orderDto.getId());
		order.setOrderName(orderDto.getOrderName());
		order.setOrderType(orderDto.getOrderType());
		order.setOrderDateTime(LocalDateTime.now());
		order.setOrderPrice(orderDto.getOrderPrice());
		order.setItems(orderDto.getItems());
		return order;
	}
	
}
