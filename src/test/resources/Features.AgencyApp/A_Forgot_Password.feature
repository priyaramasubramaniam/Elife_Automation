Feature: Verify the Forgot password functionality of the agency app

  Background: This will run before all scenarios
    Given I open agency app website
    And I click on the agency forgot password link
@1
  Scenario: This test is verify the forgot password redirection
    Given I verify the page is redirected to forgot password page

  Scenario: Verify forgot password with valid data
    Given I enter valid agency email id "elife24@gmail.com"
    And I click on agency send code button
    And I wait for 40 secs to enter code
    And I enter agency forgot password as "admin123"
    And I click on agency finish
    And I get password from db for this agency
    And Verify the agency password "admin123" is updated in db

#  Scenario : Verify forgot password with invalid email
#    Given I enter invalid agency email id "john@gmail.com"
#    And I click on agency finish
#    And Verify the agency error message "Error"

  Scenario: Verify forgot password without entering verification code
    Given I enter valid agency email id "elife24@gmail.com"
    And I enter agency forgot password as "admin123"
    And I click on agency finish
    And Verify the agency error message "Error"

  Scenario: Verify forgot password without entering verification code
    Given I enter valid agency email id "elife24@gmail.com"
    And I click on agency send code button
    And Verify the agency send code button should be enabled
    And I wait for 60seconds
    And Verify the agency send code button should be disabled after 60seconds

  Scenario: Verify forgot password send code button without entering email
    And Verify the agency send code button should be disabled before entering email
    Given I enter valid agency email id "elife24@gmail.com"
    And Verify the agency send code button should be enabled after entering email

  Scenario: Verify forgot password when i click on cancel button
    Given I enter valid agency email id "elife24@gmail.com"
    And I click on cancel button
    And Verify the page redirects to sign in page

  Scenario: Verify forgot password with incorrect verification code
    Given I enter valid agency email id "elife24@gmail.com"
    And I click on agency send code button
    And I wait for 20 secs to enter code
    And I enter agency forgot password as "admin123"
    And I click on agency finish
    And Verify the agency error message "Error"

  Scenario: Verify forgot password with to get verification code again
    Given I enter valid agency email id "elife24@gmail.com"
    And I click on agency send code button
    And I wait for 60 secs to enter code
    And I enter valid agency email id "elife24@gmail.com"
    And I click on agency send code button
    And I wait for 30 secs to enter code
    And I enter agency forgot password as "admin123"
    And I click on agency finish

