package com.apicucumberintegration;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class getRequestCucumber {
	@Given("The user enters base uri {string}")
	public void the_user_enters_base_uri(String URI) {
		//base url
		RestAssured.baseURI=URI;
	}

	@When("the user enters values {string}{string},{string},{string},{string}")
	public void the_user_enters_values(String ID, String FN, String LN, String EID, String CL) {
		
				given().
				when().
				//get request
				get(ID).
				then().contentType(ContentType.JSON).and().
				body("first_name",equalTo(FN),"last_name",equalTo(LN),"email",equalTo(EID)).and().
				header("Content-Length", CL).and().assertThat().statusCode(200);
	}

	@Then("the user sees success message")
	public void the_user_sees_success_message() {
	    System.out.println("success");
	}


}
