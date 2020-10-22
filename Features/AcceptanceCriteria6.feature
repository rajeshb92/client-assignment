Feature: Test the behaviour of API when future date is entered as parameter

    Scenario: Verify that the response has current date when future date is provided
    Given Rates API for specific date foreign exchage rates with Symbol & base to check date in response
    When The specific date foreign exchage API with future date is available
    Then verify that current date is returned in API response
  