package com.requests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class getRequestUpdated {
	
	public static void main(String[] args) {
		
		RequestSpecification request = RestAssured.with();
		Response response = request.baseUri("http://localhost:3000/").get("users/3");
		System.out.println(response.getStatusCode());
		user u2 = response.as(user.class);
		System.out.println(u2.getFirst_name());
		
		//user[] u2 = response.as(user[].class);
		//for (int i = 0; i < u2.length; i++) {
		//System.out.println(u2[i].getFirst_name()+" "+u2[i].getLast_name());
		
	}

}
	
//}

