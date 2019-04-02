package com.apicucumberintegration;
import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class getRequestCucumber {
	
	RequestSpecification request;
	Response response;
	userPojo u1;	
	
	@Given("The user is using the base URI")
	public void the_user_is_using_the_base_URI() {
	   request = RestAssured.with();
	   request.baseUri("http://localhost:3000/users");
			   
	}

	@When("The user makes a GET call using the {string}")
	public void the_user_makes_a_GET_call_using_the(String string) {
	   response = request.get(string);
	}

	@Then("The user checks for the status code {string}")
	public void the_user_checks_for_the_status_code(String string) {
		Assert.assertEquals(200, response.getStatusCode());
		/*System.out.println("GET Request Status code:  "+response.getStatusCode());
		System.out.println("GET Request Status Line:  "+response.getStatusLine());
		System.out.println();
		u1 = response.as(userPojo.class);
		System.out.println("Body");
		System.out.println("id: "+u1.getId());
		System.out.println("first_name: "+u1.getFirst_name());
		System.out.println("last_name: "+u1.getLast_name());
		System.out.println("email: "+u1.getEmail());
		System.out.println();
		System.out.println("Headers");
		System.out.println(response.getHeaders());
		System.out.println();*/
		//System.out.println(request.log().headers().toString());
		//System.out.println(response.asString());
		System.out.println(request.log().headers().toString());
		
	}

}
