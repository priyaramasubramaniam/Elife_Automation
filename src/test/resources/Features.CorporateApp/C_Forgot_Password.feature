Feature: Verify the Forgot password functionality of the corporate app

  Background:
    Given I open corporate app website
    And I click on the corporate forgot password link
  @1
  Scenario: Verify forgot password with valid data
    Given I enter valid corporate email id "lucio1235@elifetransfer.com"
    And I click on corporate send code button
    And I wait for 40 secs to enter code
    And I enter corporate forgot password as "admin123"
    And I click on corporate finish
    And I get password from db for this corporate
    And Verify the corporate password "admin123" is updated in db