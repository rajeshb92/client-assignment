package com.StepDefinitionClasses;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class IncorrectAPIcallWithBadSymbol {
		//creating response object to store response
	Response res1;
	
	@Given("^Incorrect Rates API for Latest Foreign Exchange rate$")
	public void build() throws Throwable {
		//setting up the baseURI
		RestAssured.baseURI="https://api.ratesapi.io";	    
	}

	@When("^The API does not have valid symbol$")
	public void invoke() throws Throwable {
		res1= RestAssured.get("/api/latest?symbols=US");
	}

	@Then("^verify that the response is correct$")
	public void validate() throws Throwable {
	    //printing the status line
		System.out.println("Status line of response is: "+res1.getStatusLine());
	    //verifying that the response contains invalid
	    Assert.assertEquals(true,res1.getBody().asString().contains("invalid"));
	    //verifying the status code is 400
	    Assert.assertEquals(400, res1.getStatusCode());
		
	    
	}

}
