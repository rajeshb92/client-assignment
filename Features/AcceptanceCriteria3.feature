Feature: Test the response when API is incorrect or incomplete 

		Scenario: Verify response code when incorrect or incomplete API is triggered 
    Given Incorrect Rates API for Latest Foreign Exchange rate
    When The API does not have valid symbol
    Then verify that the response is correct
    
    Scenario: Verify response code when incorrect or incomplete API is triggered 
    Given Incomplete Rates API for Latest Foreign Exchange rate
    When The API does not have valid basepath
    Then verify that the response calls out the error