Feature: Download Elife Manager report & Elife KAM Report and compare it with UI and DB data

  Background: this will run before all scenarios
    Given I open Back office website
    When I enter back office email as "gangye@elifetransfer.com"
    And I enter back office password as "qweasdzxc"
    And I click on sign in button in the back office login page
    And I click on b-b link
    And I click on Reports dropdown in the nav bar
    And I click on Employee assignment history link
    And I click on corporates link
    And I enter elife corporate id as "1"
    And I click on search button in the corporate EAH page

  Scenario: This test is to verify elife manager report with Ui And Db
    And I get All the B-B Manager details for corporate from UI
    And I get all the B-B manager details for corporate from CSV File
    Then I verify the B-B Manager details for corporate from UI with B-B Manager details for corporate from csv file
@1
  Scenario: This test is to verify elife KAM report with Ui And Db
    And I get All the B-B KAM details for corporate from UI
    And I get all the B-B KAM details for corporate from CSV File
    Then I verify the B-B KAM details for corporate from UI with B-B KAM details for corporate from csv file