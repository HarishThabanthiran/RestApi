package org.practice;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

public class getRequest {
	
	public static void main(String[] args) {
		
		RestAssured.baseURI= "http://localhost:3000/";
		given().
		when().get("http://localhost:3000/users/1").
		then().statusCode(200);
	}

}
