Feature: Login functionality

  As a user of Bilyoner
  In order to manage web site
  I want to be able to log in to the system

  Scenario: Log in with valid Android credentials
    Given I am a user of Bilyoner
    When I log in using valid Android credentials
    Then I should be logged in Android


  Scenario: Log in with invalid Android credentials
    Given I am a user of Bilyoner
    When I log in using invalid Android credentials
    Then I should not be logged in Android