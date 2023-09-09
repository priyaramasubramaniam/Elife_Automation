Feature: This test is to verify search partner by name

  Scenario: Search partner by partner name
    Given I open Back office website
    When I enter back office email as "gangye@elifetransfer.com"
    And I enter back office password as "qweasdzxc"
    And I click on sign in button in the back office login page
    And I click on b-b link
    And I click on search partner from nav bar
    And I enter partner name as "TEST"
    And I click on search button in the search partner page
    And I verify the search partner result should contains partner name "TEST"
    And I verify the partner db result data should be equal to the partner UI result data