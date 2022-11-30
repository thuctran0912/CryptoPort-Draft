package com.example.CryptoPortfolio.model;

import org.springframework.ui.Model;

public class Wallet {
	
	private String name;
	private String code;
	private double quantity;
	
	public Wallet(String name, String code, double quantity) {
		this.name = name;
		this.code = code;
		this.quantity = quantity;
		
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

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Wallet [name=" + name + ", code=" + code + ", quantity=" + quantity + "]";
	}

	
}

	
	
