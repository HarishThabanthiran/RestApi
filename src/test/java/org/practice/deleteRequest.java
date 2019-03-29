package org.practice;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

public class deleteRequest {
	
	public static void main(String[] args) {
		
		RestAssured.baseURI="http://localhost:3000";
		given().
		when().delete("users/2").
		then().statusCode(200);
	}

}
