package com.shopping.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="payment50")
public class Payment {
	@Id
	private int id;
	private int orderId;
	private String paymentMode;
	private Long paymentAmount;
	private String paymentStatus;
	private LocalDateTime paymentDateTime;
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Payment(int id, int orderId, String paymentMode, Long paymentAmount, String paymentStatus,
			LocalDateTime paymentDateTime) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.paymentMode = paymentMode;
		this.paymentAmount = paymentAmount;
		this.paymentStatus = paymentStatus;
		this.paymentDateTime = paymentDateTime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public Long getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(Long paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public LocalDateTime getPaymentDateTime() {
		return paymentDateTime;
	}
	public void setPaymentDateTime(LocalDateTime paymentDateTime) {
		this.paymentDateTime = paymentDateTime;
	}

}
