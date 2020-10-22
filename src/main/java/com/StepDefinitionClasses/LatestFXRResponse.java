package com.StepDefinitionClasses;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class LatestFXRResponse {
	Response res;
	
	@Given("^Rates API for Latest Foreign Exchange rates to check response$")
	public void buildAPI() throws Throwable {
	 
	//setting up the baseURI
	RestAssured.baseURI=commonResources.Respos.b1;
	}

	@When("^The API is available to check reponse$")
	public void invokeAPI() throws Throwable {
	
		//hitting the api using get method by providing base path
		res= RestAssured.get("/api/latest");
	}

	@Then("^verify that response is not empty$")
	public void validate() throws Throwable {
	    
		//converting response body in string
		String ResString= res.getBody().asString();
		//printing the string response
		System.out.println("Response body is :" +ResString);
		//verify that the response string is not empty
		Assert.assertEquals(false, ResString.isEmpty());
	
	}

}
