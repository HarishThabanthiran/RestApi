package org.basicrequestscucumber;

import static io.restassured.RestAssured.given;

import java.util.LinkedHashMap;
import java.util.Map;



import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class cucumberPostRequest {
	
	RequestSpecification request;
	Response response;
	userPojo u = new userPojo();
	Map<String, String> headers = new LinkedHashMap<String, String>();
	
	@When("The user enters the data to be added and the specifies the content type {int} , {string}, {string}, {string}, {string},{string}")
	public void the_user_enters_the_data_to_be_added_and_the_specifies_the_content_type(Integer int1, String string, String string2, String string3, String string4, String string5) {
		u.setId(int1);
		u.setFirst_name(string);
		u.setLast_name(string2);
		u.setEmail(string3);
		headers.put(string4, string5);
	}

	@When("The users makes a post call")
	public void the_users_makes_a_post_call() {
		request=given().contentType("application/json");
		response=request.when().headers(headers).body(u).post();
	}

	@Then("The users verifies the status code")
	public void the_users_verifies_the_status_code() {
		System.out.println("------POST REQUEST------");
		response.then().log().all().assertThat().statusCode(201);
		System.out.println();
	}




}
