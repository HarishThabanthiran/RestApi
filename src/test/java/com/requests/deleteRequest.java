package com.requests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class deleteRequest {
	public static void main(String[] args) {
		
		RequestSpecification request = RestAssured.with();
		Response response = request.baseUri("http://localhost:3000/users/2").delete();
		System.out.println(response.getStatusCode());
		
	}

}
