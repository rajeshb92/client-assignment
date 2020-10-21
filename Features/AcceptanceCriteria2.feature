Feature: Test the successful response of the Latest foreign exchange API
   
    Scenario: Assert the successful response of Latest foreign exchange api  
    Given Rates API for Latest Foreign Exchange rates to check response
    When The API is available to check reponse
    Then verify that response contains all currencies
            
    Scenario: Assert the successful response of Latest foreign exchange api with symbol
    Given Rates API for Latest Foreign Exchange rates with symbol to check response
    When The API with symbol is available to check response
    Then verify that the response has base as EUR
    And response contains currency value only for symbol parameter mentioned in api
    
    
    Scenario: Assert the successful response of Latest foreign exchange api with base  
    Given Rates API for Latest Foreign Exchange rates with base to check response
    When The API with base is available to check response
    Then verify that the response has yesterday's date
    And response has base currency same as the base parameter mentioned in api
    
    
    Scenario: Assert the successful response of Latest foreign exchange api with Symbol & base 
    Given Rates API for Latest Foreign Exchange rates with Symbol & base to check response
    When The API with Symbol & base is available to check response
    Then verify that the response has base currency same as the base parameter mentioned in api
    
    Scenario: Verify response code when incorrect or incomplete API is triggered 
    Given Incorrect Rates API for Latest Foreign Exchange rate
    When The API does not have valid symbol
    Then verify that the response is correct
    
    Scenario: Verify response code when incorrect or incomplete API is triggered 
    Given Incomplete Rates API for Latest Foreign Exchange rate
    When The API does not have valid basepath
    Then verify that the response calls out the error