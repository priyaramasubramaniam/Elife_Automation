Feature: This test is to verify search affiliate by name

  Scenario: Search affiliate by affiliate name
    Given I open Back office website
    When I enter back office email as "gangye@elifetransfer.com"
    And I enter back office password as "qweasdzxc"
    And I click on sign in button in the back office login page
    And I click on b-b link
    And I click on search affiliate from nav bar
    And I enter affiliate name as "TEST"
    And I click on search button in the search affiliate page
    And I verify the search affiliate result should contains affiliate name "TEST"
    And I verify the affiliate db result data should be equal to the affiliate UI result data