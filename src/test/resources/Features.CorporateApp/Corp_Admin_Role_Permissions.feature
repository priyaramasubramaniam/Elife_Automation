Feature: This feature is to verify the admin corp roles

  Background:
    Given I open corporate app website
    When I enter username as "lucio1235@elifetransfer.com"
    And I enter password as "admin123"
    And I click on sign in button

  Scenario: Verify admin can see all sub menus are displaying or not
    And Verify admin can access corporate dashboard
    And Verify admin can access corporate rides
    And Verify admin can access corporate employee
    And Verify admin can access corporate settings

  Scenario: Verify admin can see book a ride
    And I click on the book a ride button
    And I navigate to booking page
    And I enter the from location as "san francisco" and select from dropdown
    And I enter to location as "san jose" and select from dropdown
    And I select date
    And I select time from dropdown
    And I click on the choose vehicle button


  Scenario: Verify admin can see all dashboard details
#    And I click on dashboard link
    And I click on last month link
    And I verify admin can see paid rides details for last  month
    And I verify admin can see unpaid rides details for last month
    And I verify admin can see cancelled rides details for last month
    And I click on the current month link
    And I verify admin can see paid rides details for current  month
    And I verify admin can see unpaid rides details for current month
    And I verify admin can see cancelled rides details for current month
    And I click on the next month button
    And I verify admin can see paid rides details for next  month
    And I verify admin can see unpaid rides details for next month
    And I verify admin can see cancelled rides details for next month
    And I click on the custom button
    And I enter from start date and to end date
    And I verify admin can see paid rides details for next  month
    And I verify admin can see unpaid rides details for next month
    And I verify admin can see cancelled rides details for next month


  Scenario: Verify admin can search Rides
    And I click on the rides sub menu
    And I enter ride id as "139939"
    And I click on search button
    And I verify admin can view the ride details

@1
  Scenario: Verify admin can view all rides
    And I click on the rides sub menu
    And I click on search button
    And I verify admin can view all ride details
