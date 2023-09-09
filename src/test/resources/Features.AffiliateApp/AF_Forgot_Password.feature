Feature: Verify the Forgot password functionality of the affiliate app

  Background:
    Given I open affiliate app website
    And I click on the affiliate forgot password link
@1
  Scenario: Verify forgot password with valid data
    Given I enter valid affiliate email id "johndessie2@gmail.com"
    And I click on affiliate send code button
    And I wait for 40 secs to enter code
    And I enter affiliate forgot password as "admin123"
    And I click on affiliate finish
    And I get password from db for this affiliate
    And Verify the affiliate password "admin123" is updated in db

  Scenario: Verify forgot password with invalid email
    Given I enter invalid affiliate email id "john@gmail.com"
    And I click on affiliate finish
    And Verify the affiliate error message "Error"

  Scenario: Verify forgot password without entering verification code
    Given I enter valid affiliate email id "johndessie2@gmail.com"
    And I enter affiliate forgot password as "admin123"
    And I click on affiliate finish
    And Verify the affiliate error message "Error"

  Scenario: Verify forgot password without entering verification code
    Given I enter valid affiliate email id "johndessie2@gmail.com"
    And I click on affiliate send code button
    And Verify the affiliate send code button should be enabled
    And I wait for 60seconds
    And Verify the affiliate send code button should be disabled after 60seconds

  Scenario: Verify forgot password send code button without entering email
    And Verify the affiliate send code button should be disabled before entering email
    Given I enter valid affiliate email id "johndessie2@gmail.com"
    And Verify the affiliate send code button should be enabled after entering email


  Scenario: Verify forgot password when i click on cancel button
    Given I enter valid affiliate email id "johndessie2@gmail.com"
    And I click on cancel button
    And Verify the page redirects to sign in page

  Scenario: Verify forgot password with incorrect verification code
    Given I enter valid affiliate email id "johndessie2@gmail.com"
    And I click on affiliate send code button
    And I wait for 20 secs to enter code
    And I enter affiliate forgot password as "admin123"
    And I click on affiliate finish
    And Verify the affiliate error message "Error"

  Scenario: Verify forgot password with to get verification code again
    Given I enter valid affiliate email id "johndessie2@gmail.com"
    And I click on affiliate send code button
    And I wait for 60 secs to enter code
    And I enter valid affiliate email id "johndessie2@gmail.com"
    And I click on affiliate send code button
    And I wait for 30 secs to enter code
    And I enter affiliate forgot password as "admin123"
    And I click on affiliate finish

