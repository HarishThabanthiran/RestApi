package com.practiceadvanced;

import java.util.LinkedHashMap;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class putRequest {
	
	public static void main(String[] args) {
	
		userPojo u = new userPojo();
		u.setId(50);
		u.setFirst_name("kurudo11111");
		u.setLast_name("akabane");
		u.setEmail("finally@gmail.com");
		
		RequestSpecification request = RestAssured.with();
		Map<String, String> headers = new LinkedHashMap<String, String>();
		headers.put("Content-Type", "application/json");
		Response response = request.baseUri("http://localhost:3000").headers(headers).body(u).put("users/50");
		System.out.println(response.statusCode());
	}

}
