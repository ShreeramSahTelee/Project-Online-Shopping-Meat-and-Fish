package com.shopping.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="item")
public class Item {
	@Id
	private int id;
	private String itemName;
	private String itemType;
	private int itemPrice;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(int id, String itemName, String itemType, int itemPrice) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemPrice = itemPrice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

}
