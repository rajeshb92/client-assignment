package com.StepDefinitionClasses1;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class latestFXR {
	
	Response res;
	
	@Given("^Rates API for Latest Foreign Exchange rates$")
	public void buildAPI() throws Throwable {
	 
	//setting up the baseURI
	RestAssured.baseURI="https://api.ratesapi.io";
	}

	@When("^The API is available$")
	public void invokeAPI() throws Throwable {
	
		//hitting the api using get method by providing base path
		res= RestAssured.get("/api/latest");
	}

	@Then("^verify that the status of the response is Success$")
	public void validate() throws Throwable {
	    
		//print the response status code 
		System.out.println("Status code of the response is : "+res.getStatusCode());
		//validating that it is 200
		Assert.assertEquals(200, res.getStatusCode() );
	
	}

}
