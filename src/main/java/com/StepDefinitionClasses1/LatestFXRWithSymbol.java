package com.StepDefinitionClasses1;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class LatestFXRWithSymbol {
	
	//creating response object to store response
	Response res1;
	
	@Given("^Rates API for Latest Foreign Exchange rates with symbol$")
	public void buildAPI() throws Throwable {
		//setting up the baseURI
		RestAssured.baseURI="https://api.ratesapi.io";
	}

	@When("^The API with symbol is available$")
	public void invokeAPI() throws Throwable {
	
		res1= RestAssured.get("/api/latest?symbols=USD");
	}

	@Then("^verify that the response status code of symbol api is 200$")
	public void validate() throws Throwable {
	    
		//validating that status code is 200
		Assert.assertEquals(200, res1.getStatusCode() );
	
	}
	
	@And("^symbol api response HTTP version is 1.1$")
	public void validateHTTPVersion() throws Throwable {
	    
		//printing the response status line
		System.out.println("Status line of the symbol api response is : "+res1.getStatusLine());
		//validate that status line has 1.1
		Assert.assertEquals(res1.getStatusLine().contains("1.1"), true);
	
	}

}
