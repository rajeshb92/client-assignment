package com.StepDefinitionClasses;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FutureDateAPIResponse {
		
		Response res1;
		String date,futureDate,currentDate;
		
				
		@Given("^Rates API for specific date foreign exchage rates with Symbol & base to check date in response$")
		public void buildAPI() throws Throwable {
			//setting up the baseURI
			RestAssured.baseURI=commonResources.Respos.b1;
		}

		@When("The specific date foreign exchage API with future date is available$")
		public void invokeAPI() throws Throwable {
			//providing future date as param
			futureDate=commonResources.Respos.getFutureDayDateString();
			res1= RestAssured.get("/api/"+futureDate+"?base=USD&symbols=GBP");
			
		}
	
		@Then("^verify that current date is returned in API response$")
		public void validate2() {
			date=res1.jsonPath().get("date");
			System.out.println("Date in the response is :"+date);
			currentDate=commonResources.Respos.getTodayDateString();
			//verifying the date is current
			Assert.assertEquals(currentDate,date);
			
		}

}
