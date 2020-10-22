Feature: Test the successful response of the specific date foreign exchange API

		Scenario: Assert the successful response of specific date foreign exchange API  
    Given Rates API for specific date Foreign Exchange rates to check response
    When The specific date foreign exchange API is available to check reponse
    Then verify that specific date foreign exchange API response is not empty
            
    Scenario: Assert the successful response of specific date foreign exchange API with symbol
    Given Rates API for specific date Foreign Exchange rates with symbol to check response
    When The specific date foreign exchage API with symbol is available to check response
    Then verify that the specific date foreign exchage API response has base as EUR
      
    
    Scenario: Assert the successful response of specific date foreign exchage API with base  
    Given Rates API for specific date foreign exchage rates with base to check response
    When The specific date foreign exchage API with base is available to check response
    Then verify that the specific date foreign exchage API response has date mentioned in API
    And specific date foreign exchage API response has base currency same as the base parameter mentioned in api
    
    
    Scenario: Assert the successful response of specific date foreign exchage API with Symbol & base 
    Given Rates API for specific date foreign exchage rates with Symbol & base to check response
    When The specific date foreign exchage API with Symbol & base is available to check response
    Then verify that the specific date foreign exchage API response has base currency same as the base parameter mentioned in api
   
    