package com.shopping.service;

import java.util.List;

import com.shopping.dto.ItemDto;


public interface ItemService {
	ItemDto addItem(ItemDto itemDto);
	List<ItemDto> getAllItem();
	ItemDto getItemById(int id);
	
	ItemDto updateItemById(int id,ItemDto ItemDto);
	String deleteItemById(int id);

}
