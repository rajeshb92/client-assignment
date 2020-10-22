package com.StepDefinitionClasses;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SpecificDateFXRWithSymbolAndBaseResponse {
	//creating response object to store response
	Response res1;
	String base,currentDate;
		
	@Given("^Rates API for specific date foreign exchage rates with Symbol & base to check response$")
	public void buildAPI() throws Throwable {
		//setting up the baseURI
		RestAssured.baseURI="https://api.ratesapi.io";
	}

	@When("The specific date foreign exchage API with Symbol & base is available to check response$")
	public void invokeAPI() throws Throwable {
		currentDate=commonResources.Respos.getTodayDateString();
		res1= RestAssured.get("/api/"+currentDate+"?base=USD&symbols=GBP");
		
	}

	
	@Then("^verify that the specific date foreign exchage API response has base currency same as the base parameter mentioned in api$")
	public void validate2() {
		base=res1.jsonPath().get("base");
		//printing the base currency present in api response
		System.out.println("Base currency present in response is :"+base);
		//verifying that it is EUR
		Assert.assertEquals("USD", base);
		
	}


}
