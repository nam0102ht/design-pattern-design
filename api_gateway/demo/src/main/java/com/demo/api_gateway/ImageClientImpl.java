package com.demo.api_gateway;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;
import java.io.IOException;

import org.springframework.stereotype.Component;

@Component
public class ImageClientImpl implements ImageClient{

	@Override
	public String getImagePath() {
		var httpClient = HttpClient.newHttpClient();
		var httpGet = HttpRequest.newBuilder()
				.GET()
				.uri(URI.create("http://localhost:50005/image-path"))
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
