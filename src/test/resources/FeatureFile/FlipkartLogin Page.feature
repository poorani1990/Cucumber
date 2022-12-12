Feature: Flipkart Functionality Testing

Scenario: Flipkart Login Credentials testing
    Given User should be in Flipkart login page
    When User should enter username and password
    And User should click login button
    Then User should verify the success message
  