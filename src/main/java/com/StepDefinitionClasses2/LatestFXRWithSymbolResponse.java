package com.StepDefinitionClasses2;

import java.util.List;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class LatestFXRWithSymbolResponse {
	//creating response object to store response
		Response res1;
		String base;
		List<String> currencyList;
		
		@Given("^Rates API for Latest Foreign Exchange rates with symbol to check response$")
		public void buildAPI() throws Throwable {
			//setting up the baseURI
			RestAssured.baseURI="https://api.ratesapi.io";
		}

		@When("^The API with symbol is available to check response$")
		public void invokeAPI() throws Throwable {
		
			res1= RestAssured.get("/api/latest?symbols=USD");
		}

		@Then("^verify that the response has base as EUR$")
		public void validate() throws Throwable {
		    
			base=res1.jsonPath().get("base");
			//printing the base currency present in api response
			System.out.println("Base currency present in response is :"+base);
			//verifying that it is EUR
			Assert.assertEquals("EUR", base);
		
		}
		
		@And("^response contains currency value only for symbol parameter mentioned in api$")
		public void validateHTTPVersion() throws Throwable {
		    //printing currency list as a string
			System.out.println("Currency list returned is :"+res1.jsonPath().get("rates").toString());
			//verifying that it just has USD
			Assert.assertEquals("{USD=1.181}",res1.jsonPath().get("rates").toString());
				
		}
}
