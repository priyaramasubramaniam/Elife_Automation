Feature: This test is to verify search corporate by name


  Background: this will run before all scenarios
    Given I open Back office website
    When I enter back office email as "gangye@elifetransfer.com"
    And I enter back office password as "qweasdzxc"
    And I click on sign in button in the back office login page
    And I click on b-b link
    And I click on search corporate from nav bar

  Scenario: Search corporate by corporate name
    And I enter corporate name as "TEST"
    And I click on search button in the search corporate page
    And I verify the search corporate result should contains corporate name "TEST"
    And I verify the corporate db result data should be equal to the corporate UI result data

  Scenario: Search corporate by valid corporate name
    And I enter corporate name as "R corp 2"
    And I click on search button in the search corporate page
    And I verify the search corporate result should contains corporate name "R corp 2"
    And I verify the valid corporate db result data should be equal to the valid corporate UI result data
