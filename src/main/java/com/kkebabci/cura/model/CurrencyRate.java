package com.kkebabci.cura.model;

public class CurrencyRate {
	
	private String currency;
	
	private Double value;
	
	public CurrencyRate() {
		super();
	}

	public CurrencyRate(String currency, Double value) {
		super();
		this.currency = currency;
		this.value = value;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
}
