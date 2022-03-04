package com.kkebabci.cura.model;

import java.util.List;

public class CurrencyRateResponse {
	
	private Header header;
	
	private String baseCurrency;
	
	private String date;
	
	private List<CurrencyRate> rates;
	

	public CurrencyRateResponse() {
		super();
	}

	public CurrencyRateResponse(Header header, String baseCurrency, String date, List<CurrencyRate> rates) {
		super();
		this.header = header;
		this.baseCurrency = baseCurrency;
		this.date = date;
		this.rates = rates;
	}

	public Header getHeader() {
		return header;
	}

	public void setHeader(Header header) {
		this.header = header;
	}

	public String getBaseCurrency() {
		return baseCurrency;
	}

	public void setBaseCurrency(String baseCurrency) {
		this.baseCurrency = baseCurrency;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public List<CurrencyRate> getRates() {
		return rates;
	}

	public void setRates(List<CurrencyRate> rates) {
		this.rates = rates;
	}

	
	
}
