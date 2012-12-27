package com.jinsoft.shoppingcart.core;

public class ShoppingCartService {
	
	public Account getAccount() { 
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public void addItemToBasket(BasketItem item) {
		basketService.addItem(item);
	}	
	public void removeItemFromBasket(BasketItem item) {
		basketService.removeItem(item);
	}	
	public void emptyBasket() {
		basketService.empty();
	}
	
	public Order placeOrder() {
		Order order = new Order();
		
		order.setEmail(account.getEmail());
		order.setBillingAddress(account.getBillingAddress());
		order.setShippingAddress(account.getBillingAddress());
		
		for (BasketItem item : basketService.getBasket().getItems()) {
			LineItem lineItem = new LineItem();
			lineItem.setProduct(item.getProduct());
			lineItem.setQuantity(item.getQuantity());
			lineItem.setUnitPrice(item.getProduct().getUnitPrice());
		}
		
		return order;
	}
	
	private Account account;
	private BasketService basketService;
}
