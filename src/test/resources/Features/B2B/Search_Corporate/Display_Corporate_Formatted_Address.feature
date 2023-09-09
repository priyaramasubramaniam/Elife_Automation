Feature: This test is to verify the formatted address in the corporate pages
  
  Background: This will run before all the scenarios
    Given I open Back office website
    When I enter back office email as "gangye@elifetransfer.com"
    And I enter back office password as "qweasdzxc"
    And I click on sign in button in the back office login page
    And I click on b-b link
    And I click on search corporate from nav bar
    And I click on the Add Corporate button

  Scenario Outline: This test will create a new corporate and check the corporate address in the search page
    And I enter new corporate name as "<corporate_name>"
    And I enter corporate address as "San Jose Center for the Performing Arts, South Almaden Boulevard, San Jose, CA, USA"
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
    Then I verify the corporate address for the corp "<corporate_name>" in the corporate search page should be same as formatted address in the DB
    Examples:
      |corporate_name |corporate_admin_name|corporate_admin_email|corporate_admin_number|
      |Test Create Corp 00011 | Test create corp admin 01| testcorpadmin000011@elife.com |8597463234|


  @1
  Scenario Outline: This test will create a new corporate and check the corporate address in the details page
    And I enter new corporate name as "<corporate_name>"
    And I enter corporate address as "San Jose Center for the Performing Arts, South Almaden Boulevard, San Jose, CA, USA"
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
    Then I click on the corporate id link in the search page
    Then I click on the details link in the corporate details page
    Then I verify the corporate address for the corp "<corporate_name>" in the corporate details page should be same as formatted address in the DB
    Examples:
      |corporate_name |corporate_admin_name|corporate_admin_email|corporate_admin_number|
      |Test Create Corp 00012 | Test create corp admin 03| testcorpadmin000012@elife.com |8597463235|
