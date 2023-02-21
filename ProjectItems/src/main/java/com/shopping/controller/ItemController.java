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

import com.shopping.dto.ItemDto;
import com.shopping.service.ItemService;

@RestController
@RequestMapping("/api/v1/item")
public class ItemController {
	
	@Autowired
	ItemService itemService;
	
	@PostMapping("/additem")
	public ResponseEntity<ItemDto> addItem(@RequestBody ItemDto itemDto){
		return new ResponseEntity<ItemDto>(itemService.addItem(itemDto),HttpStatus.OK);
	}
	
	@GetMapping("/items")
	public ResponseEntity<List<ItemDto>> getAllItem(){
		return new ResponseEntity<List<ItemDto>>(itemService.getAllItem(),HttpStatus.OK);
	}
	
	@GetMapping("/item/{id}")
	public ResponseEntity<ItemDto> getItemById(@PathVariable int id){
		return new ResponseEntity<ItemDto>(itemService.getItemById(id),HttpStatus.OK);
	}
	
	@PutMapping("/updateitem/{id}")
	public ResponseEntity<ItemDto> updateItemByID(@PathVariable int id,@RequestBody ItemDto itemDto){
		return new ResponseEntity<ItemDto>(itemService.updateItemById(id, itemDto),HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteitem/{id}")
	public ResponseEntity<String> deleteItemById(@PathVariable int id){
		return new ResponseEntity<String>(itemService.deleteItemById(id),HttpStatus.OK);
	}
	

}
