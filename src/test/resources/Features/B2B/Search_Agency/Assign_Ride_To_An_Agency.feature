Feature: This is to verify the assign elife ride to an agency

  Background: This will run before all scenarios
    Given I open Back office website
    When I enter back office email as "gangye@elifetransfer.com"
    And I enter back office password as "qweasdzxc"
    And I click on sign in button in the back office login page
    And I click on Backoffice link
    And I click on Create new ride on Backoffice nav bar
    And I enter partner as "Elife transfer"
    And I select partner name from dropdown
    And I enter Reference as "Test Ref 001"
    And I enter amount as "100"
    And I enter pickup location as "san francisco"
    And I select pickup location from dropdown
    And I enter Date as "2023-08-31"
    And I enter time hour as "05" and time minutes as "30"
    And I enter dropoff location as "San jose"
    And I select dropoff location from dropdown
    And I enter passenger count as "2"
    And I select vehicle type
    And I enter firstname as "Priya"
    And I enter lastname as "SP"
    And I enter email as "priya@test.com"
    And I enter mobile number as "8597463210"
    And I click on save customer
    And I click on save button
    And I get Ride id from the page

  Scenario: Create Elife ride and assign this ride to an agency
    Given I open Back office website
    When I enter back office email as "gangye@elifetransfer.com"
    And I enter back office password as "qweasdzxc"
    And I click on sign in button in the back office login page
    And I click on b-b link
    And I click on search agency from nav bar
    And I enter agency id as "elife1"
    And I click on search button in the search agency page
    And I click on the agency id link
    And I click on assign ride link
    And I enter ride id
    And I click on Search button in the assign ride page
    And I click on assign ride button
    And I enter "Assign" in the input field
    And I click on confirm button

