package com.apicucumberintegration;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Assert;

import com.practiceadvanced.userPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class putRequestCucumber {
	
	
	RequestSpecification request;
	Response response;
	userPojo u = new userPojo();
	Map<String, String> headers = new LinkedHashMap<String, String>();
	
	@Given("The user uses the base resource URI")
	public void the_user_uses_the_base_resource_URI() {
		 request = RestAssured.with();
		 request.baseUri("http://localhost:3000/users");
	}

	@When("The user enters the datas to be updated and then specifies the content type {int} , {string}, {string}, {string}, {string},{string}")
	public void the_user_enters_the_datas_to_be_updated_and_then_specifies_the_content_type(Integer int1, String string, String string2, String string3, String string4, String string5) {
		u.setId(int1);
		u.setFirst_name(string);
		u.setLast_name(string2);
		u.setEmail(string3);
		headers.put(string4, string5);
	}

	@When("The user makes a Put call using the {string}")
	public void the_user_makes_a_Put_call_using_the(String string) {
		response = request.headers(headers).body(u).put(string);
	}

	@Then("The user uses assert to verify the status code created")
	public void the_user_uses_assert_to_verify_the_status_code_created() {
		Assert.assertEquals(200, response.getStatusCode());
		System.out.println("PUT Request Status code:  "+response.getStatusCode());
		System.out.println("PUT Request Status Line:  "+response.getStatusLine());
		System.out.println();
		u = response.as(userPojo.class);
		System.out.println("id: "+u.getId());
		System.out.println("Body");
		System.out.println("first_name: "+u.getFirst_name());
		System.out.println("last_name: "+u.getLast_name());
		System.out.println("email: "+u.getEmail());
		System.out.println();
		System.out.println("Headers");
		System.out.println(response.getHeaders());
		System.out.println();
	}



}
