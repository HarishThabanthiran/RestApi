package com.practiceadvanced;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getRequest {

	public static void main(String[] args) {

		RequestSpecification request = RestAssured.with();
		Response response = request.baseUri("http://localhost:3000/").get("users/1");
		System.out.println(response.statusCode());
		userPojo u1 = response.as(userPojo.class);
		System.out.println(u1.getFirst_name()+ " " + u1.getLast_name());
	}

}
