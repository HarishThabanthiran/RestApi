package com.requests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType; 
import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.given;

public class getRequest {
	
	public static void main(String[] args) {
		//base url
		RestAssured.baseURI="http://localhost:3000";
		//parameters
		given().
		//param("id","1").
		//param("first_name","Harish").
		//param("last_name","T").
		//param("email","harisht@gmail.com").
		when().
		//get request
		get("users/1").
		then().contentType(ContentType.JSON).and().
		body("first_name",equalTo("Harish"),"last_name",equalTo("T"),"email",equalTo("harisht@gmail.com")).and().
		header("Content-Length", "91").and().assertThat().statusCode(200);
		
	
	}
	
	
	
	
}
