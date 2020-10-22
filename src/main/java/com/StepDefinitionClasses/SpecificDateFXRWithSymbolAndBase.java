package com.StepDefinitionClasses;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SpecificDateFXRWithSymbolAndBase {
	
			//creating response object to store response
			Response res1;
			String currentDate;
			
			@Given("^Rates API for specific date Foreign Exchange rates with Symbol & base$")
			public void buildAPI() throws Throwable {
				//setting up the baseURI
				RestAssured.baseURI=commonResources.Respos.b1;
			}

			@When("The specific date FXR API with Symbol & base is available$")
			public void invokeAPI() throws Throwable {
				currentDate=commonResources.Respos.getTodayDateString();
				res1= RestAssured.get("/api/"+currentDate+"?base=INR&symbols=GBP,USD");
				
			}

			@Then("^verify that the response status code of specific date FXR API with symbol & base is 200$")
			public void validate() throws Throwable {
			    
				//printing the response status line
				System.out.println("Status code of the Symbol and base api response is : "+res1.getStatusCode());
				//validating that status code is 200
				Assert.assertEquals(200, res1.getStatusCode() );
			
			}

}
