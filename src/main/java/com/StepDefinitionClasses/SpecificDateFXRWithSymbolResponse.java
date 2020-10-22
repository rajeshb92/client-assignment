package com.StepDefinitionClasses;

import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SpecificDateFXRWithSymbolResponse {
			//creating response object to store response
			Response res1;
			String base,currentDate;
						
			@Given("^Rates API for specific date Foreign Exchange rates with symbol to check response$")
			public void buildAPI() throws Throwable {
				//setting up the baseURI
				RestAssured.baseURI="https://api.ratesapi.io";
			}

			@When("^The specific date foreign exchage API with symbol is available to check response$")
			public void invokeAPI() throws Throwable {
				currentDate=commonResources.Respos.getTodayDateString();
				res1= RestAssured.get("/api/"+currentDate+"?symbols=USD");
			}

			@Then("^verify that the specific date foreign exchage API response has base as EUR$")
			public void validate() throws Throwable {
			    
				base=res1.jsonPath().get("base");
				//printing the base currency present in api response
				System.out.println("Base currency present in response is :"+base);
				//verifying that it is EUR
				Assert.assertEquals("EUR", base);
			
			}	
}
