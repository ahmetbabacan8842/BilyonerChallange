Feature: Coupon functionality

  As a user of Bilyoner
  Coupon testing and coupon system will be tested by logging into the site for the coupon test

  Scenario: Create a coupon and cancel
    Given I log in using invalid credentials
    And I go to betting newsletter
    And I select bet type and select match-end mutual goals
    And I select 4 match and result 1
    Then I should see bet slipe has 4 match
    When Create a coupon with selected matches
    And I go to my account
    And I cancel the bet
    Then I should see the coupon is canceled
