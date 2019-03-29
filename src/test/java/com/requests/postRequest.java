package com.requests;

import cucumber.api.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class postRequest {
	public static void main(String[] args) {
		RequestSpecification request = RestAssured.with();
		HashMap<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		user u1 = new user();
		u1.setId(3);
		u1.setFirst_name("kurudo");
		u1.setLast_name("Akabane");
		u1.setEmail("Dr.jackal@gmail.com");
		Response response = request.baseUri("http://localhost:3000").headers(headers).body(u1).post("users");
		System.out.println(response.getStatusCode());
		 
		

		
	
	}

}
