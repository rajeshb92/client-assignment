package com.StepDefinitionClasses;

import java.util.Map;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class LatestFXRResponseCurrencyCount {
	Response res;
	Map<Object, Object> currencyList;
	
	@Given("^Rates API for Latest Foreign Exchange rates to check count$")
	public void buildAPI() throws Throwable {
	 
	//setting up the baseURI
	RestAssured.baseURI=commonResources.Respos.b1;
	}

	@When("^The API is available to check count$")
	public void invokeAPI() throws Throwable {
	
		//hitting the api using get method by providing base path
		res= RestAssured.get("/api/latest");
	}

	@Then("^verify that response contains rates for all currencies$")
	public void checkCurrency() {
		//storing the currencies along with their values in a map
		currencyList = res.jsonPath().getMap("rates");		
		System.out.println("Response contains total of "+currencyList.size()+" currencies");
		//asserting the same
		Assert.assertEquals(commonResources.Respos.currencyCount, currencyList.size());
	}

}
