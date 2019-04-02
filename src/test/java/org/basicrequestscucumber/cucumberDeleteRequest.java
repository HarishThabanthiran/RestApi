package org.basicrequestscucumber;

import static io.restassured.RestAssured.given;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class cucumberDeleteRequest {
	RequestSpecification request;
	Response response;
		
	@When("The users makes a delete call using the {string}")
	public void the_users_makes_a_delete_call_using_the(String string) {
		request=given().contentType("application/json");
		response=request.when().delete(string);
	}

	@Then("The users verifies for the status code")
	public void the_users_verifies_for_the_status_code() {
		System.out.println("------DELETE REQUEST------");
		System.out.println(response.statusLine());
		response.then().assertThat().statusCode(200);
		System.out.println();
	}



}
