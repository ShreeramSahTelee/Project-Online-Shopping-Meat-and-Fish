package com.shopping.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.shopping.entity.Item;

public interface ItemRepository extends MongoRepository<Item, Integer>{

}
