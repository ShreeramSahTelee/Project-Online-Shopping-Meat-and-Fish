package com.shopping.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.dto.PaymentDto;
import com.shopping.entity.Payment;
import com.shopping.exception.IdNotFoundException;
import com.shopping.repository.PaymentRepository;
import com.shopping.utility.AppConstant;


@Service
public class PaymentServiceImpl implements PaymentService{
  @Autowired
	PaymentRepository paymentRepository;
	
	@Override
	public PaymentDto addPayment(PaymentDto paymentDto) {
		
		return convertToDto(paymentRepository.save(convertToEntity(paymentDto)));
	}

	@Override
	public List<PaymentDto> getAllPaymentDetails() {
		List<Payment> payments=paymentRepository.findAll();
		List<PaymentDto> paymentDtos=new ArrayList<>();
		for(Payment payment:payments) {
			paymentDtos.add(convertToDto(payment));
		}
		
		return paymentDtos;
	}

	@Override
	public PaymentDto getPaymentDetailsById(int id) {
		Optional<Payment> optPayment=paymentRepository.findById(id);
		if(optPayment.isPresent()) {
			return convertToDto(optPayment.get());
		}else {
			throw new IdNotFoundException(AppConstant.ID_NOT_FOUND_MESSAGE);
		}
		
		
	}

	@Override
	public PaymentDto updatePaymentDetailById(int id, PaymentDto paymentDto) {
		Optional<Payment> optPayment=paymentRepository.findById(id);
		if(optPayment.isPresent()) {
			return convertToDto(paymentRepository.save(convertToEntity(paymentDto)));
		}
		else {
			throw new IdNotFoundException(AppConstant.ID_NOT_FOUND_MESSAGE);
		}
	}

	@Override
	public String deletePaymentDetailById(int id) {
		Optional<Payment> optPayment=paymentRepository.findById(id);
		if(optPayment.isPresent()) {
			paymentRepository.deleteById(id);
			return "id is deleted";
		}
		else {
			throw new IdNotFoundException(AppConstant.ID_NOT_FOUND_MESSAGE);
		}
		
	}
	private PaymentDto convertToDto(Payment payment) {
		PaymentDto paymentDto=new PaymentDto();
		paymentDto.setId(payment.getId());
		paymentDto.setOrderId(payment.getOrderId());
		paymentDto.setPaymentAmount(payment.getPaymentAmount());
		paymentDto.setPaymentMode(payment.getPaymentMode());
		paymentDto.setPaymentStatus(payment.getPaymentStatus());
		paymentDto.setPaymentDateTime(LocalDateTime.now());
		
		return paymentDto;
	}

	
	private Payment convertToEntity(PaymentDto paymentDto) {
		Payment payment=new Payment();
		payment.setId(paymentDto.getId());
		payment.setOrderId(paymentDto.getOrderId());
		payment.setPaymentAmount(paymentDto.getPaymentAmount());
		payment.setPaymentMode(paymentDto.getPaymentMode());
		payment.setPaymentStatus(paymentDto.getPaymentStatus());
		payment.setPaymentDateTime(LocalDateTime.now());
		
		return payment;
	}
}
