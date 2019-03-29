package com.requests;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class putRequest {
	public static void main(String[] args) {
		
		RequestSpecification request = RestAssured.with();
		HashMap<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		user u3 = new user();
		u3.setId(3);
		u3.setFirst_name("Ginji");
		u3.setLast_name("Amano");
		u3.setEmail("lightningemperor@gmail.com");
		Response response = request.baseUri("http://localhost:3000/").headers(headers).body(u3).put("users/3");
		System.out.println(response.getStatusCode());
	}

}
