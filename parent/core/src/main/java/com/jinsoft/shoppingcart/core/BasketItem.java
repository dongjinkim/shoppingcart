package com.jinsoft.shoppingcart.core;

import java.math.BigDecimal;

public class BasketItem {
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getTotalPrice() {
		return product.getUnitPrice().multiply(BigDecimal.valueOf(quantity));
	}
	
	private Long id;
	private Product product;
	private int quantity;
}
