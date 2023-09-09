Feature: This test is to verify the employee report

  Background: This will run before all the scenarios
    Given I open Back office website
    When I enter back office email as "gangye@elifetransfer.com"
    And I enter back office password as "qweasdzxc"
    And I click on sign in button in the back office login page
    And I click on b-b link
    And I click on Reports dropdown in the nav bar
    And I click on Employee report link

  Scenario: This is used for testing the employee report of all
    And I click on agency, partner, affiliate and corporate links
    And I click on search button in the employee reports page
    And I get all the data from UI
    And I get all the data from csv file "all"
    And I verify the employee report in the UI and CSV file

  Scenario: This is used for testing the employee report of agency
    And I click on agency link
    And I click on search button in the employee reports page
    And I get all the agency data from UI
    And I get all the agency data from csv file "agency"
    And I verify the employee report of agency in the UI and CSV file "agency"

  Scenario: This is used for testing the employee report of partner
    And I click on partner link
    And I click on search button in the employee reports page
    And I get all the partner data from UI
    And I get all the partner data from csv file "partner"
    And I verify the employee report of partner in the UI and CSV file "partner"
@1
  Scenario: This is used for testing the employee report of affiliate
    And I click on affiliate link
    And I click on search button in the employee reports page
    And I get all the affiliate data from UI
    And I get all the affiliate data from csv file "affiliate"
    And I verify the employee report of affiliate in the UI and CSV file "affiliate"

  Scenario: This is used for testing the employee report of corporate
    And I click on corporate link
    And I click on search button in the employee reports page
    And I get all the corporate data from UI
    And I get all the corporate data from csv file "corporate"
    And I verify the employee report of corporate in the UI and CSV file "corporate"