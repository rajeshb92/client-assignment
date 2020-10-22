Feature: Test the successful response of the Latest foreign exchange API
   
    Scenario: Assert the successful response of Latest foreign exchange api  
    Given Rates API for Latest Foreign Exchange rates to check response
    When The API is available to check reponse
    Then verify that response is not empty
            
    Scenario: Assert the successful response of Latest foreign exchange api with symbol
    Given Rates API for Latest Foreign Exchange rates with symbol to check response
    When The API with symbol is available to check response
    Then verify that the response has base as EUR
      
    Scenario: Assert the successful response of Latest foreign exchange api with base  
    Given Rates API for Latest Foreign Exchange rates with base to check response
    When The API with base is available to check response
    Then verify that the response has current date
    And response has base currency same as the base parameter mentioned in api
    
    
    Scenario: Assert the successful response of Latest foreign exchange api with Symbol & base 
    Given Rates API for Latest Foreign Exchange rates with Symbol & base to check response
    When The API with Symbol & base is available to check response
    Then verify that the response has base currency same as the base parameter mentioned in api
