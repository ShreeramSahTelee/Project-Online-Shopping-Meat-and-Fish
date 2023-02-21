package com.shopping.dto;

import java.time.LocalDateTime;
import java.util.List;

import com.shopping.entity.Item;

public class OrderDto {
	private int id;
	private String orderName;
	private String orderType;
	private LocalDateTime orderDateTime;
	private Float orderPrice;
	private List<Item> items;
	public OrderDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderDto(int id, String orderName, String orderType, LocalDateTime orderDateTime, Float orderPrice) {
		super();
		this.id = id;
		this.orderName = orderName;
		this.orderType = orderType;
		this.orderDateTime = orderDateTime;
		this.orderPrice = orderPrice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public LocalDateTime getOrderDateTime() {
		return orderDateTime;
	}
	public void setOrderDateTime(LocalDateTime orderDateTime) {
		this.orderDateTime = orderDateTime;
	}
	public Float getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(Float orderPrice) {
		this.orderPrice = orderPrice;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	

}
