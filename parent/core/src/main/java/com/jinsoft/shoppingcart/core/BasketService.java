package com.jinsoft.shoppingcart.core;

public class BasketService {
	
	public void addItem(BasketItem item) {
		basket.getItems().add(item);
	}
	
	public void removeItem(BasketItem item) {
		basket.getItems().remove(item);
	}
	
	public void empty() {
		basket.getItems().clear();
	}
		
	public Basket getBasket() { 
		return basket; 
	}
	public void setBasket(Basket basket) {
		this.basket = basket;
	}
	
	private Basket basket;
}
