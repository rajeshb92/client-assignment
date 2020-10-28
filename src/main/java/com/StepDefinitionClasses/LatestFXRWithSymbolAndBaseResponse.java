package com.StepDefinitionClasses;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class LatestFXRWithSymbolAndBaseResponse {
	//creating response object to store response
			Response res1;
			Map<Object, Object> rate;
						
			@Given("^Rates API for Latest Foreign Exchange rates with Symbol & base to check response$")
			public void buildAPI() throws Throwable {
				//setting up the baseURI
				RestAssured.baseURI=commonResources.Respos.b1;
			}

			@When("The API with \"([^\"]*)\" & base is available to check response$")
			public void invokeAPI(String s) throws Throwable {
				
				res1= RestAssured.get("/api/latest?base=USD&symbols="+s);
				
			}
	
			
			@Then("^verify that the response contains rates of \"([^\"]*)\" currency only$")
			public void validate2(String s) {
				rate=res1.jsonPath().getMap("rates");
				//extract the key set from the map
				Set<Object> keys = rate.keySet();
				System.out.println("The key set is: "+keys.toString());
				//assert that it has only one currency and is same as symbol parameter
				Assert.assertEquals(1,keys.size());
				Assert.assertEquals("["+s+"]",keys.toString());
				
				
			}

}
