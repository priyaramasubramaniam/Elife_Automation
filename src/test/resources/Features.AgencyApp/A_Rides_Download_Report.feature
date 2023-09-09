Feature: This test is to verify rides download report for agency
  Scenario: This is the test to verify the download report of rides data
    Given I open agency app website
    When I enter agency signin username as "elife24@gmail.com"
    And I enter agency signin password as "admin123"
    And I click on sign in button in the agency sign in page
    And I click on the agency rides sub menu
    And I click on download report button
    And I read data from downloaded report