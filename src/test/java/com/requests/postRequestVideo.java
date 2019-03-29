package com.requests;

import java.util.LinkedHashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;


public class postRequestVideo {
	
	public static void main(String[] args) {
		
		Map<String, String> m = new LinkedHashMap<String, String>();
		m.put("id","22");
		m.put("first_name", "Avatar");
		m.put("last_name", "Aang");
		m.put("email", "aang@gmail.com");
		given().contentType("application/json").body(m).
		when().post("http://localhost:3000/users/").
		then().statusCode(201);
	}

}
