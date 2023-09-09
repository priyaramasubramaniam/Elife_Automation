Feature: This test is to verify search agency by name

  Background: This will run before all scenarios
    Given I open Back office website
    When I enter back office email as "gangye@elifetransfer.com"
    And I enter back office password as "qweasdzxc"
    And I click on sign in button in the back office login page
    And I click on b-b link
    And I click on search agency from nav bar
@1
  Scenario: Search agency by agency name
    And I enter agency name as "TEST"
    And I click on search button in the search agency page
    And I verify the search agency result should contains agency name "TEST"
    And I get the agency result from db
    And I verify the agency db result data should be equal to the agency UI result data

  Scenario: Search Name dropdown should contains all the agency name
    And I get all the agency names from dropdown
    And I get all the agency names from db
    And I verify the agency names in the UI should be equal to agency names in db