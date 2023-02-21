package com.shopping.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.dto.ItemDto;
import com.shopping.entity.Item;
import com.shopping.exception.IdNotFoundException;
import com.shopping.exception.NameNotFoundException;
import com.shopping.repository.ItemRepository;
import com.shopping.utility.AppConstant;
@Service
public class ItemServiceImpl implements ItemService{
	@Autowired
	ItemRepository itemRepository;

	@Override
	public ItemDto addItem(ItemDto itemDto) {
		
		return convertToDto(itemRepository.save(convertToEntity(itemDto)));
	}

	@Override
	public List<ItemDto> getAllItem() {
		List<Item> items=itemRepository.findAll();
		List<ItemDto> itemDto=new ArrayList<>();
		for(Item item:items) {
			itemDto.add(convertToDto(item));
		}
		
		return itemDto;
	}

	@Override
	public ItemDto getItemById(int id) {
		Optional<Item> optItem=itemRepository.findById(id);
		if(optItem.isPresent()) {
			return convertToDto(optItem.get());
		}else {
			throw new IdNotFoundException(AppConstant.ID_NOT_FOUND_MESSAGE);
		}
		
	
	}

//	public ItemDto findItemByName(String name) {
//		Optional<Item> optItem=itemRepository.getItemByName(name);
//		if(optItem.isPresent()) {
//			return convertToDto(optItem.get());
//		}else {
//			throw new NameNotFoundException(AppConstant.NAME_NOT_FOUND);
//		}
//		
//	}

	@Override
	public ItemDto updateItemById(int id, ItemDto ItemDto) {
		Optional<Item> optItem=itemRepository.findById(id);
		if(optItem.isPresent()) {
			return convertToDto(itemRepository.save(convertToEntity(ItemDto)));
		}else {
			throw new IdNotFoundException(AppConstant.ID_NOT_FOUND_MESSAGE);
		}
		
		
	}

	@Override
	public String deleteItemById(int id) {
		Optional<Item> optItem=itemRepository.findById(id);
		if(optItem.isPresent()) {
			itemRepository.deleteById(id);
			return "item is deleted";
		}
		else {
			throw new IdNotFoundException(AppConstant.ID_NOT_FOUND_MESSAGE);
		}
		
		
	}
	
	private ItemDto convertToDto(Item item) {
		ItemDto itemDto=new ItemDto();
		itemDto.setId(item.getId());
		itemDto.setItemName(item.getItemName());
		itemDto.setItemPrice(item.getItemPrice());
		itemDto.setItemType(item.getItemType());
		
		return itemDto;
	}
	
	private Item convertToEntity(ItemDto itemDto) {
		Item item=new Item();
		item.setId(itemDto.getId());
		item.setItemName(itemDto.getItemName());
		item.setItemPrice(itemDto.getItemPrice());
		item.setItemType(itemDto.getItemType());
		
		return item;
	}

	

}
