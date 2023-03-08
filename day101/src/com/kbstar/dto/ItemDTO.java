package com.kbstar.dto;

public class ItemDTO {
	private String itemId;
	private String itemName;
	private int itemQt;
	public ItemDTO() {
	}
	
	public ItemDTO(String itemId, String itemName, int itemQt) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemQt = itemQt;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemQt() {
		return itemQt;
	}

	public void setItemQt(int itemQt) {
		this.itemQt = itemQt;
	}

	@Override
	public String toString() {
		return "ItemDTO [itemId=" + itemId + ", itemName=" + itemName + ", itemQt=" + itemQt + "]";
	}

	
}
