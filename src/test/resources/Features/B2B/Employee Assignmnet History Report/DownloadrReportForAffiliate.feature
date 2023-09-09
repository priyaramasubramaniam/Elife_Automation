Feature: Download Elife Manager report & Elife KAM report and compare it with UI and DB data

  Background:  This will run before all scenarios
    Given I open Back office website
    When I enter back office email as "gangye@elifetransfer.com"
    And I enter back office password as "qweasdzxc"
    And I click on sign in button in the back office login page
    And I click on b-b link
    And I click on Reports dropdown in the nav bar
    And I click on Employee assignment history link
    And I click on affiliates link
    And I enter elife affiliate id as "1"
    And I click on search button in the affiliate EAH page

  Scenario: This test is to verify elife manager report with Ui And Db
    And I get All the B-B Manager details for affiliate from UI
    And I get all the B-B manager details for affiliate from CSV File
    Then I verify the B-B Manager details for affiliate from UI with B-B Manager details for affiliate from csv file
@1
  Scenario: This test is to verify elife KAM report with Ui And Db
    And I get All the B-B KAM details for affiliate from UI
    And I get all the B-B KAM details for affiliate from CSV File
    Then I verify the B-B KAM details for affiliate from UI with B-B KAM details for partner from csv file