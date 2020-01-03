package com.demo.api_gateway;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;

import org.springframework.stereotype.Component;

@Component
public class PriceCientImpl implements PriceClient{
	
	@Override
	public String getPrice() {
		var httpClient = HttpClient.newHttpClient();
		var httpGet = HttpRequest.newBuilder()
				.GET()
				.uri(URI.create("http://localhost:50002/price"))
				.build();
		try {
			var httpResponse = httpClient.send(httpGet, BodyHandlers.ofString());
			return httpResponse.body();
		}catch(IOException | InterruptedException ex) {
			ex.printStackTrace();
		}
		return null;
	}

}
