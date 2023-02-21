package com.shopping.service;

import java.util.List;


import com.shopping.dto.PaymentDto;

public interface PaymentService {
	PaymentDto addPayment(PaymentDto paymentDto);
	List<PaymentDto> getAllPaymentDetails();
	PaymentDto getPaymentDetailsById(int id);
	PaymentDto updatePaymentDetailById(int id,PaymentDto paymentDto);
	String deletePaymentDetailById(int id);
	

}
