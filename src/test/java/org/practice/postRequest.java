package org.practice;

import java.util.LinkedHashMap;
import java.util.Map;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

public class postRequest {
	public static void main(String[] args) {
		Map<String, String> m1 = new LinkedHashMap<String, String>();
		m1.put("id", "5");
		m1.put("first_name", "korra");
		m1.put("last_name", "M");
		m1.put("email", "korra@gmail.com");
		m1.put("location", "northern water tribe");
		
		RestAssured.baseURI="http://localhost:3000";
		given().contentType("application/json").body(m1).
		when().post("/users").
		then().statusCode(201);
		
	}
}
