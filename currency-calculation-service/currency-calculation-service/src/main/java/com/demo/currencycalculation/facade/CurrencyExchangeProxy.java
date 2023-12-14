package com.demo.currencycalculation.facade;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.demo.currencycalculation.model.CalculatedAmount;

//@FeignClient(name ="currency-exchange-service", url ="http://localhost:8000")
@FeignClient(name ="currency-exchange-service")
@RibbonClient(name ="currency-exchange-service")
public interface CurrencyExchangeProxy {

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CalculatedAmount retrieveExchangeValue1(@PathVariable("from") String from,
			@PathVariable("to") String to);

}
