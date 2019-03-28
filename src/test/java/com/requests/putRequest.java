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
		u3.setId(4);
		u3.setFirst_name("avatarYang");
		u3.setLast_name("H");
		u3.setEmail("homura@gmail.com");
		Response response = request.baseUri("http://localhost:3000/users/4").headers(headers).body(u3).put();
		System.out.println(response.getStatusCode());
	}

}
