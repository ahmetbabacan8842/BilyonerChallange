Feature: Login functionality

  As a user of Bilyoner
  In order to manage web site
  I want to be able to log in to the system

  Scenario: Log in with valid credentials
    Given I am a user of Bilyoner
    When I log in using valid credentials
    Then I should be logged in


  Scenario: Log in with invalid credentials
    Given I am a user of Bilyoner
    When I log in using invalid credentials
    Then I should not be logged in