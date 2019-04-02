package org.basicrequestscucumber;

import static io.restassured.RestAssured.given;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class cucumberGetRequest {
	RequestSpecification request;
	Response response;
		
	@Given("The users is using the base URI")
	public void the_users_is_using_the_base_URI() {
	   RestAssured.baseURI="http://localhost:3000/users";
		
	}

	@When("The users makes a GET call using the {string}")
	public void the_users_makes_a_GET_call_using_the(String string) {
		request=given().contentType("application/json");
		response=request.when().get(string);
	}

	@Then("The users checks for the status code")
	public void the_users_checks_for_the_status_code() {
		System.out.println("------GET REQUEST------");
		response.then().log().all().assertThat().statusCode(200);
		System.out.println();
		
	}



}
