package com.price.api_gateway;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriceCotroller {
	@RequestMapping(value="/price", method = RequestMethod.GET)
	public String getPrice() {
		return "20$";
	}
}
