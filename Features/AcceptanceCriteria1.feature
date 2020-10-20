@AC1
Feature: Test the success status of latest foreign exchange rates api
   
    Scenario: Assert the success status of Latest foreign exchange api response 
    Given Rates API for Latest Foreign Exchange rates
    When The API is available
    Then verify that the status of the response is Success
        
    Scenario: Assert the success status of response for Latest foreign exchange api with symbol 
    Given Rates API for Latest Foreign Exchange rates with symbol
    When The API with symbol is available
    Then verify that the response status code of symbol api is 200
    And symbol api response HTTP version is 1.1
    
    Scenario: Assert the success status of response for Latest foreign exchange api with base  
    Given Rates API for Latest Foreign Exchange rates with base
    When The API with base is available
    Then verify that the response status code of base api  is 200
    And base api response status line is HTTP/1.1 200 OK
    
    Scenario: Assert the success status of Latest foreign exchange api with Symbol & base response 
    Given Rates API for Latest Foreign Exchange rates with Symbol & base
    When The API with Symbol & base is available 
    Then verify that the response status code of Symbol & base api is 200
    
          
        
 

    
   
    
    
    

    