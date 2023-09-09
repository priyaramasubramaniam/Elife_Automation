Feature: Download Elife Manager report & Elife KAM report and compare it with UI and DB data

  Background: this is run before all the scenario
    Given I open Back office website
    When I enter back office email as "gangye@elifetransfer.com"
    And I enter back office password as "qweasdzxc"
    And I click on sign in button in the back office login page
    And I click on b-b link
    And I click on Reports dropdown in the nav bar
    And I click on Employee assignment history link
    And I click on partners link
    And I enter elife partner id as "1"
    And I click on search button in the partner EAH page

  Scenario: This test is to verify elife manager report with Ui And Db
    And I get All the B-B Manager details for partner from UI
    And I get all the B-B manager details for partner from CSV File
    Then I verify the B-B Manager details for partner from UI with B-B Manager details for partner from csv file
@1
  Scenario: This test is to verify elife KAM report with Ui And Db
    And I get All the B-B KAM details for partner from UI
    And I get all the B-B KAM details for partner from CSV File
    Then I verify the B-B KAM details for partner from UI with B-B KAM details for partner from csv file
