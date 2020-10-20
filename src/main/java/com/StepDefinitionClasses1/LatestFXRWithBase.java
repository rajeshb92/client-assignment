package com.StepDefinitionClasses1;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class LatestFXRWithBase {
	
	//creating response object to store response
		Response res2;
		
		@Given("^Rates API for Latest Foreign Exchange rates with base$")
		public void buildAPI() throws Throwable {
			//setting up the baseURI
			RestAssured.baseURI="https://api.ratesapi.io";
		}

		@When("^The API with base is available$")
		public void invokeAPI() throws Throwable {
		
			res2= RestAssured.get("/api/latest?base=USD");
		}

		@Then("^verify that the response status code of base api  is 200$")
		public void validate() throws Throwable {
		    
			//validating that status code is 200
			Assert.assertEquals(200, res2.getStatusCode() );
		
		}
		
		@And("^base api response status line is HTTP/1.1 200 OK$")
		public void validateHTTPVersion() throws Throwable {
		    
			//printing the response status line
			System.out.println("Status line of the base api response is : "+res2.getStatusLine());
			//validate that status line is as expected
			Assert.assertEquals("HTTP/1.1 200 OK", res2.getStatusLine());
		}

}
