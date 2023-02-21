package com.shopping.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.shopping.dto.ItemDto;
import com.shopping.entity.Item;

public interface ItemRepository extends MongoRepository<Item, Integer>{
	@Query("{itemName:?0}")
  Optional<List<ItemDto> > getItemByName(String itemName);
}
