Feature: Verify the sign up for agency app

  Scenario: Verify the sign up with valid data
    Given I open agency app website
    And I click on sign up link
    And I enter agency or company name as "Agency 0001"
    And I enter agency address as "USA"
    And I select agency address from the dropdown
    And I enter company representative as "Agency 0001"
    And I enter country code as "USA"
    And I select country code from dropdown
    And I enter agency mobile number as "897456210"
    And I enter agency email as "pppp@elife.com"
    And I click on get code button
    And I wait for 40 secs to enter code
    And I enter agency password as "admin123"
    And I click on sign up button
    And I get added agency from DB
