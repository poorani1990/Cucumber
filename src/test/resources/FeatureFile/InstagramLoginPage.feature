Feature: Instagram Functionality Testing

Scenario: Instagram Login Credentials testing
    Given User should be in Instagram login page
    When User should enter username and password
    And User should click login button
    Then User should verify the success message
  