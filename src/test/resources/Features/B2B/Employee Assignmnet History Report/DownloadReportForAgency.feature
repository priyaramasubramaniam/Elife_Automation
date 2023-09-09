Feature: Download Elife Manager report & Elife KAM Report and compare it with UI and DB data

  Background: It will open website and go until EAH page
    Given I open Back office website
    When I enter back office email as "gangye@elifetransfer.com"
    And I enter back office password as "qweasdzxc"
    And I click on sign in button in the back office login page
    And I click on b-b link
    And I click on Reports dropdown in the nav bar
    And I click on Employee assignment history link
@1
  Scenario: This test is to verify elife manager report with Ui And Db
    And I enter elife agency id as "320"
    And I click on search button in the agency EAH page
    And I get All the B-B Manager details for agency from UI
    And I get all the B-B manager details for agency from CSV File
    Then I verify the B-B Manager details for agency from UI with B-B Manager details for agency from csv file

  Scenario: This test is to verify elife KAM report with Ui And Db
    And I enter elife agency id as "320"
    And I click on search button in the agency EAH page
    And I get All the B-B KAM details from UI
    And I get all the B-B KAM details from CSV File
    Then I verify the B-B KAM details for agency from UI with B-B KAM details for agency from csv file