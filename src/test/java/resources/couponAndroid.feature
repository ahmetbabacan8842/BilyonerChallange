Feature: Coupon functionality

  As a user of Bilyoner
  Coupon testing and coupon system will be tested by logging into the site for the coupon test

  Scenario: Create a coupon and cancel in Android
    Given I log in using invalid Android credentials
    And I go to betting newsletter Android
    And I select bet type and select match-end mutual goals in Android
    Then I should see the coupon is played
    And I go to my account and Cancel the coupon in Android
    Then I should see the coupon is canceled