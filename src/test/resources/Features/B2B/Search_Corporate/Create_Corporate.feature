Feature: This is to verify the Create Corporate in the Search Corporate Page

  Background: Admin user can add corporate in the b2b management app
    Given I open Back office website
    And I enter back office email as "gangye@elifetransfer.com"
    And I enter back office password as "qweasdzxc"
    And I click on sign in button in the back office login page
    And I click on b-b link
    When I click on the search corporate from the navigation bar
    And I click on the Add Corporate button

  Scenario: Verify when i click on add corporate button navigates to the add corporate page
    Then I verify the page contains "Add Corporate" text

#  Scenario : This test is to verify corporate details are updated in details page
#    And I click on the search corporate from the navigation bar
#    Then I get the corporate id from the database
#    Then I search corporate by corporate id in the corporate search page
#    Then I click on the corporate id link in the search page
#    And I click on the details link in the corporate details page
#    Then I get the corporate details from db
#    Then I get the corporate details from the corp details page
#    And I verify the corporate details from db should be equal to corporate details from the corp details page

  Scenario: Verify when i click on save button without entering anything in the add corporate page will give proper error message
    Then I click on save button in the add corp page
    Then I verify error message for corp name as "Please enter corporate name"
    Then I verify error message for corp company address as "Please select an address from the dropdown"
    Then I verify error message for corp country  as "Full address must contain country name"
    Then I verify error message for corp city  as "Full address must contain city name"
    Then I verify error message for corp admin name as "Please enter admin name"
    Then I verify error message for corp admin email as "Please enter admin email"
    Then I verify error message for corp country code as "Please enter country code"
    Then I verify error message for corp contact number as "Please enter contact number"
    Then I verify error message for corp password as "Please enter password"
@1
  Scenario Outline: This test is to verify corporate is created successfully with valid inputs data
    And I enter new corporate name as "<corporate_name>"
    And I enter corporate address as "<company_address>"
    And I select address from the dropdown
    And I enter corporate admin name as "<corporate_admin_name>"
    And I enter corporate admin email as "<corporate_admin_email>"
    And I enter corporate country code as "USA"
    And I select corporate country code from DD
    And I enter corporate cell number as "<corporate_admin_number>"
    And I click on generate button in the add corp page
    Then I click on save button in the add corp page
#    Then I verify the success toast message "Success"
    And I click on the search corporate from the navigation bar
    Then I get the corporate id from the database
    Then I search corporate by corporate id in the corporate search page
    Then I verify the corporate details "<corporate_name>","<corporate_admin_name>","<corporate_admin_email>","<corporate_admin_number>" in the corporate search page
  Examples:
    |corporate_name | company_address |corporate_admin_name|corporate_admin_email|corporate_admin_number|
    |Test Create Corp 00014 | chennai, India | Test create corp admin 15| testcorpadmin000015@elife.com |8597463220|

  Scenario: Verify that after successful creation of the corporate it redirects to corporate details page
    And I enter new corporate name as "Test Create Corp 02"
    And I enter corporate address as "San francisco"
    And I select address from the dropdown
    And I enter corporate admin name as "Test create corp admin 02"
    And I enter corporate admin email as "testcorpadmin002@elife.com"
    And I enter corporate country code as "USA"
    And I select corporate country code from DD
    And I enter corporate cell number as "8597463211"
    And I click on generate button in the add corp page
    Then I click on save button in the add corp page
    Then I verify the success toast message "Success"
    Then I verify the the page redirects to corporate details page and contains corp name "Test Create Corp 02"

  Scenario: This test is to verify corporate is created  with existing email and mobile number
    And I enter new corporate name as "Test Create Corp 002"
    And I enter corporate address as "San francisco"
    And I select address from the dropdown
    And I enter corporate admin name as "Test create corp admin 01"
    And I enter corporate admin email as "testcorpadmin001@elife.com"
    And I enter corporate country code as "USA"
    And I select corporate country code from DD
    And I enter corporate cell number as "8597463210"
    And I click on generate button in the add corp page
    Then I click on save button in the add corp page
    Then I verify the error toast message "Error"
    Then I verify the the page redirects to corporate details page and contains corp name "Test Create corp 002"

  Scenario: This test is to verify the error message for invalid email and invalid mobile number
    And I enter new corporate name as "Test Create Corp 002"
    And I enter corporate address as "San francisco"
    And I select address from the dropdown
    And I enter corporate admin name as "Test create corp admin 01"
    And I enter corporate admin email as "testcorpadmin001   @elife.com"
    And I enter corporate country code as "USA"
    And I select corporate country code from DD
    And I enter corporate cell number as "iiiiiiiii"
    And I click on generate button in the add corp page
    Then I click on save button in the add corp page
    Then Verify the error message for corp admin email for invalid email "Please enter a valid email (e.g., example@example.com)"
    Then Verify the error message for corp admin mobile number for invalid cell number "Please enter a valid cellphone number. It should contain a minimum of 6 digits and a maximum of 15 digits."

  Scenario: This test is to verify the error message for minimum and maximum char limit for mobile number
    And I enter corporate minimum cell number as "12345"
    Then I click on save button in the add corp page
    Then Verify the error message for corp admin mobile number for invalid cell number "Please enter a valid cellphone number. It should contain a minimum of 6 digits and a maximum of 15 digits."
    And I enter corporate maximum cell number as "1234567890123456"
    Then I click on save button in the add corp page
    Then Verify the error message for corp admin mobile number for invalid cell number "Please enter a valid cellphone number. It should contain a minimum of 6 digits and a maximum of 15 digits."

  Scenario Outline: This test is to verify corporate is created successfully with valid inputs data and updated in db
    And I enter new corporate name as "<corporate_name>"
    And I enter corporate address as "San francisco"
    And I select address from the dropdown
    And I enter corporate admin name as "<corporate_admin_name>"
    And I enter corporate admin email as "<corporate_admin_email>"
    And I enter corporate country code as "USA"
    And I select corporate country code from DD
    And I enter corporate cell number as "<corporate_admin_number>"
    And I click on generate button in the add corp page
    Then I click on save button in the add corp page
#    Then I verify the success toast message "Success"
    And I click on the search corporate from the navigation bar
    Then I get the corporate id from the database
    Then I search corporate by corporate id in the corporate search page
    Then I get the corporate details from db
    Then I get the corporate details from UI
    And I verify the corporate details from db should be equal to corporate details from UI
    Examples:
      |corporate_name |corporate_admin_name|corporate_admin_email|corporate_admin_number|
      |Test Create Corp 00001 | Test create corp admin 01| testcorpadmin000001@elife.com |8597463212|
@1
  Scenario:  This test is to verify corporate details are updated in details page
    And I click on the search corporate from the navigation bar
    Then I get the corporate id from the database
    Then I search corporate by corporate id in the corporate search page
    Then I click on the corporate id link in the search page
    And I click on the details link in the corporate details page
    Then I get the corporate details from db
    Then I get the corporate details from the corp details page
    And I verify the corporate details from db should be equal to corporate details from the corp details page




