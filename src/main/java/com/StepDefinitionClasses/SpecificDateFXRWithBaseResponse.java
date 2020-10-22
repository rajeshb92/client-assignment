package com.StepDefinitionClasses;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SpecificDateFXRWithBaseResponse {
	//creating response object to store response
	Response res2;
	String date,base,currentDate;
		
	@Given("^Rates API for specific date foreign exchage rates with base to check response$")
	public void buildAPI() throws Throwable {
		//setting up the baseURI
		RestAssured.baseURI=commonResources.Respos.b1;
	}

	@When("^The specific date foreign exchage API with base is available to check response$")
	public void invokeAPI() throws Throwable {
		currentDate=commonResources.Respos.getTodayDateString();	
		res2= RestAssured.get("/api/"+currentDate+"?base=USD");
	}

	@Then("^verify that the specific date foreign exchage API response has date mentioned in API$")
	public void validate() throws Throwable {
	    date=res2.jsonPath().get("date");
		System.out.println("Date in the response is :"+date);
		//verifying the date is current
		Assert.assertEquals(currentDate,date);
	
	}
	
	@And("^specific date foreign exchage API response has base currency same as the base parameter mentioned in api$")
	public void validateHTTPVersion() throws Throwable {
	    
		base=res2.jsonPath().get("base");
		//printing the base currency present in api response
		System.out.println("Base currency present in response is :"+base);
		//verifying that it is USD
		Assert.assertEquals("USD", base);
	}


}
