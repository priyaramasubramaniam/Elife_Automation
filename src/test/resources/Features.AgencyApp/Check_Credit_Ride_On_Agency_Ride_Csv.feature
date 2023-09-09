Feature: This test is to verify the credit ride column is in the csv file or not

  Background: This is to test the agency credit ride
    Given I open agency app website
    When I enter agency signin username as "elife24@gmail.com"
    And I enter agency signin password as "admin123"
    And I click on sign in button in the agency sign in page

  Scenario: This is to test the agency credit ride on report
    And I click on the agency rides sub menu
    And I click on download report button
    And I get credit ride colum from the agency rides report




