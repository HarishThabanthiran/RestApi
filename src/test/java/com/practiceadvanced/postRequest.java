package com.practiceadvanced;

import java.util.LinkedHashMap;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class postRequest {
	
	public static void main(String[] args) {

		userPojo u3 = new userPojo();
		u3.setId(55);
		u3.setFirst_name("Ban");
		u3.setLast_name("medow");
		u3.setEmail("sankbyte@gmail.com");
		
		RequestSpecification request = RestAssured.with();
		Map<String, String> headers = new LinkedHashMap<String, String>();
		headers.put("Content-Type", "application/json");
		Response response = request.baseUri("http://localhost:3000/").headers(headers).body(u3).post("users");
		System.out.println(response.statusCode());
	}

}
