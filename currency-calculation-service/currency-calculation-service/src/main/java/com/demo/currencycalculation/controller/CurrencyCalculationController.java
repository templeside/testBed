package com.demo.currencycalculation.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.demo.currencycalculation.facade.CurrencyExchangeProxy;
import com.demo.currencycalculation.model.CalculatedAmount;

@RestController
public class CurrencyCalculationController {
	
	@Autowired
	private CurrencyExchangeProxy proxy;
	
	//rest template
	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CalculatedAmount calculateAmount(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {
		
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);
		ResponseEntity<CalculatedAmount> responseEntity = new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}"
				, CalculatedAmount.class, uriVariables);
		CalculatedAmount calculatedAmount =responseEntity.getBody();
		
		return new CalculatedAmount(calculatedAmount.getId(), calculatedAmount.getFrom(), 
				calculatedAmount.getTo(), calculatedAmount.getConversionMultiple(),
				quantity, quantity.multiply(calculatedAmount.getConversionMultiple()), 
				calculatedAmount.getPort());
	}
	

	//feign client
	@GetMapping("/currency-converter-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CalculatedAmount calculateAmountFeign(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {
		
		CalculatedAmount calculatedAmount= proxy.retrieveExchangeValue1(from, to);
		
		System.out.println(calculatedAmount.toString());
		
		return new CalculatedAmount(calculatedAmount.getId(), calculatedAmount.getFrom(), 
				calculatedAmount.getTo(), calculatedAmount.getConversionMultiple(),
				quantity, quantity.multiply(calculatedAmount.getConversionMultiple()), 
				calculatedAmount.getPort());
		
	}
}
