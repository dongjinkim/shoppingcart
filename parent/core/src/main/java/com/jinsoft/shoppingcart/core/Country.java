package com.jinsoft.shoppingcart.core;

public class Country {
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	private Long id;
	private String name;
	private String code;  // ISO-3166-1 alpha-2 (2 character country code)
}
