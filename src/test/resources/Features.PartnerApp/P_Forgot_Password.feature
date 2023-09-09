Feature: Verify the Forgot password functionality of the partner app

  Background:
    Given I open partner app website
    And I click on the partner forgot password link
  @1
  Scenario: Verify forgot password with valid data
    Given I enter valid partner email id "lisa@test.com"
    And I click on partner send code button
    And I wait for 40 secs to enter code
    And I enter partner forgot password as "admin123"
    And I click on partner finish
    And I get password from db for this partner
    And Verify the partner password "admin123" is updated in db