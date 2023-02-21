package com.shopping.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.shopping.entity.Payment;

public interface PaymentRepository extends MongoRepository<Payment, Integer>{

}
