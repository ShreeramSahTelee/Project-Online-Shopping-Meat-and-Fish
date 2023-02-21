package com.shopping.dto;

public class ItemDto {
	private int id;
	private String itemName;
	private String itemType;
	private int itemPrice;
	public ItemDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ItemDto(int id, String itemName, String itemType, int itemPrice) {
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
