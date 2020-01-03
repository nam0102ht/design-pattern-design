package com.demo.api_gateway;

import java.io.StringWriter;

import javax.annotation.Resource;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApiGateway {
	@Resource
	private ImageClient imageClient;
	
	@Resource
	private PriceClient priceClient;
	
	@RequestMapping(value = "/mobile", method = RequestMethod.GET)
	public String getMobile() {
		JSONObject obj = new JSONObject();
		obj.put("Image_path",imageClient.getImagePath());
		obj.put("Price", priceClient.getPrice());
		return obj.toString();
	}
	
	@RequestMapping(value = "/desktop", method = RequestMethod.GET)
	public String getDesktop() {
		JSONObject obj = new JSONObject();
		obj.put("Price", priceClient.getPrice());
		return obj.toString();
	}
	
}
