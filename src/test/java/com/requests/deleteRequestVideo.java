package com.requests;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;

public class deleteRequestVideo {
	
	public static void main(String[] args) {
		
		RestAssured.baseURI="http://localhost:3000";
		given().
		when().delete("users/v_2-tPt").
		then().statusCode(200);
	}

}
