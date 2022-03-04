package com.kkebabci.cura.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kkebabci.cura.model.CurrencyRate;
import com.kkebabci.cura.model.CurrencyRateResponse;
import com.kkebabci.cura.model.Header;

@RestController
@RequestMapping(path = "/api/currency-rates")
public class CurrencyRateController {
	
	@GetMapping
	public CurrencyRateResponse getCurrencyRates() {
		
		Header header = new Header();
		header.setCode("00");
		header.setMessage("Request processed successfully.");
		header.setRequestId("7234e-23412-sferw1234");
		
		
		CurrencyRate currencyRate = new CurrencyRate();
		currencyRate.setCurrency("TRY");
		currencyRate.setValue(14.3123);
		
		CurrencyRateResponse response = new CurrencyRateResponse();
		response.setBaseCurrency("USD");
		response.setDate("04-03-2022 23:59:00");
		response.setHeader(header);
		response.setRates(new ArrayList<>());
		response.getRates().add(currencyRate);
		
		return response;
	}

}
