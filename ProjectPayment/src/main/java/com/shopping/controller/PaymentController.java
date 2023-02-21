package com.shopping.controller;

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

import com.shopping.dto.PaymentDto;
import com.shopping.service.PaymentService;

@RestController
@RequestMapping("/api/v1/payment")
public class PaymentController {
	@Autowired
	PaymentService paymentService;
	
    @PostMapping("/addpayment")
	public ResponseEntity<PaymentDto> addPayment(@RequestBody PaymentDto paymentDto){
		return new ResponseEntity<PaymentDto>(paymentService.addPayment(paymentDto),HttpStatus.OK);
	}
    
    @GetMapping("/payments")
    public ResponseEntity<List<PaymentDto>> getAllPaymentDetails(){
    	return new ResponseEntity<List<PaymentDto>>(paymentService.getAllPaymentDetails(),HttpStatus.OK);
    }
    
    @GetMapping("/payment/{id}")
    public ResponseEntity<PaymentDto> getPaymentById(@PathVariable int id){
    	return new ResponseEntity<PaymentDto>(paymentService.getPaymentDetailsById(id),HttpStatus.OK);
    }
    
    @PutMapping("/updatepayment/{id}")
    public ResponseEntity<PaymentDto> updatePaymentDetailsById(@PathVariable int id,@RequestBody PaymentDto paymentDto){
    	return new ResponseEntity<PaymentDto>(paymentService.updatePaymentDetailById(id, paymentDto),HttpStatus.OK);
    }
    
    @DeleteMapping("/deletepayment/{id}")
    public ResponseEntity<String> deletePaymentById(@PathVariable int id){
    	return new ResponseEntity<String>(paymentService.deletePaymentDetailById(id),HttpStatus.OK);
    }
}
