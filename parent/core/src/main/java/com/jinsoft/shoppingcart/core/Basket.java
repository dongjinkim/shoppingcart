package com.jinsoft.shoppingcart.core;

import java.util.List;

public class Basket {
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public List<BasketItem> getItems() {
		return items;
	}
	public void setItems(List<BasketItem> items) {
		this.items = items;
	}
	
	private Long id;
	private String userId;
	private List<BasketItem> items;
}
