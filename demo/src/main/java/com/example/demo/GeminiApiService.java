package com.example.demo;

import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GeminiApiService {

	private static final String API_URL = "https://generativelanguage.googleapis.com/v1beta/models/gemini-1.5-flash:generateContent?key=AIzaSyDaXTpbt5djI_CPkx5T66_N9y-kNFlnfVQ";

	public String generateContent(String str) {
		RestTemplate restTemplate = new RestTemplate();

		// Build the request body
		ContentRequest contentRequest = new ContentRequest();
		ContentRequest.Content content = new ContentRequest.Content();
		content.setParts(List.of(new ContentRequest.Content.Part(str)));
		contentRequest.setContents(List.of(content));

		// Set the request headers
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		// Prepare the request entity with body and headers
		HttpEntity<ContentRequest> entity = new HttpEntity<>(contentRequest, headers);

		// Send POST request to the API
		try {
			ResponseEntity<String> response = restTemplate.exchange(API_URL, HttpMethod.POST, entity, String.class);
			return response.getBody();
		} catch (Exception e) {
			e.printStackTrace();
			return "Error occurred: " + e.getMessage();
		}
	}
}
