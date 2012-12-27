package com.jinsoft.shoppingcart.web.model;

public class MessageStore {
	
	public MessageStore() {
		message = "Hello World";
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	private String message;
}
