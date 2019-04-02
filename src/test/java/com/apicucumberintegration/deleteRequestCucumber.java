package com.apicucumberintegration;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class deleteRequestCucumber {
	
	RequestSpecification request;
	Response response;
	
	@Given("The user is using the base resource URI")
	public void the_user_is_using_the_base_resource_URI() {
		request = RestAssured.with();
		   request.baseUri("http://localhost:3000/users");
	}

	@When("The user makes a Delete call using the {string}")
	public void the_user_makes_a_Delete_call_using_the(String string) {
		 response = request.delete(string);
	}

	@Then("The user checks for the status code created {string}")
	public void the_user_checks_for_the_status_code_created(String string) {
		Assert.assertEquals(200, response.getStatusCode());
		System.out.println("DELETE Request Status code:  "+response.getStatusCode());
		System.out.println("DELETE Request Status Line:  "+response.getStatusLine());
		System.out.println();
		
	}

	
	
}
