package com.shopping.controller;

import java.security.PublicKey;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.dto.OrderDto;
import com.shopping.repository.OrderRepository;
import com.shopping.service.OrderService;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {
	@Autowired
	OrderService orderService;
	@PostMapping("/addorder")
	public ResponseEntity<OrderDto> addOrder(@RequestBody OrderDto orderDto){
		return new ResponseEntity<OrderDto>(orderService.addOrder(orderDto),HttpStatus.OK);
	}
    
    @GetMapping("/orders")
	public ResponseEntity<List<OrderDto>> getAllOrder(){
		return new ResponseEntity<List<OrderDto>>(orderService.getAllOrder(),HttpStatus.OK);
	}
    
    @GetMapping("/order/{id}")
    public ResponseEntity<OrderDto> getOrderById(@PathVariable int id){
    	return new ResponseEntity<OrderDto>(orderService.getOrderById(id),HttpStatus.OK);
    }
    
    @PutMapping("/updateorder/{id}")
    public ResponseEntity<OrderDto> updateOrderById(@PathVariable int id,@RequestBody OrderDto orderDto){
    	return new ResponseEntity<OrderDto>(orderService.updateOrderById(id, orderDto),HttpStatus.OK);
    }
    
    @DeleteMapping("/deleteorder/{id}")
    public ResponseEntity<String> deleteOrderById(@PathVariable int id){
    	return new ResponseEntity<String>(orderService.deleteOrderById(id),HttpStatus.OK);
    }
    
}
