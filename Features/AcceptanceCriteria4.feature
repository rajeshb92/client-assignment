Feature: Test the success status of specific date foreign exchange rates API

    Scenario: Assert the success status of specific date exchange API 
    Given Rates API for specific date foreign exchange rates
    When The specific date FXR API is available
    Then verify that the status code of the response is 200
        
    Scenario: Assert the success status of specific date exchange API with symbol 
    Given Rates API for specific date Foreign Exchange rates with symbol
    When The specific date FXR API with symbol is available
    Then verify that the response status code of specific date FXR API with symbol is 200
    And specific date FXR API with symbol response's HTTP version is 1.1
    
    Scenario: Assert the success status of specific date exchange API with base  
    Given Rates API for specific date Foreign Exchange rates with base
    When The specific date FXR API with base is available
    Then verify that the response status code of specific date FXR API with base is 200
    And specific date FXR API with base response's status line is HTTP/1.1 200 OK
    
    Scenario: Assert the success status of specific date exchange API with symbol & base 
    Given Rates API for specific date Foreign Exchange rates with Symbol & base
    When The specific date FXR API with Symbol & base is available 
    Then verify that the response status code of specific date FXR API with symbol & base is 200
