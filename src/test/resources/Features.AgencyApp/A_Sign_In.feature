Feature: This is used to test the sign in functionality of the agency signin page

  Scenario: This is to test the sign in with valid credentials
    Given I open agency app website
    And I enter agency signin username as "elife24@gmail.com"
    And I enter agency signin password as "admin123"
    And I click on sign in button in the agency sign in page
    And I verify the agency email "elife24@gmail.com" in the home page

  Scenario Outline: This is to test the sign in with invalid credentials
    Given I open agency app website
    And I enter agency signin username as "<agency_email>"
    And I enter agency signin password as "<agency_password>"
    And I click on sign in button in the agency sign in page
    And I verify the error message in the agency signin page as "Error"
    Examples:
    | agency_email | agency_password |
    | elife24@gmail.com | admin1234 |
    | elife2@gmail.com | admin1234 |
    | elife2@gmail.com | admin123 |

  Scenario: This is to test the sign in with empty values
    Given I open agency app website
    And I click on sign in button in the agency sign in page
    And I verify the error message in the agency signin page as "Error"
@1
  Scenario: This test is verify the agency sign in with db password
    Given I open agency app website
    And I enter agency signin username as "elife24@gmail.com"
    And I get the password from db and enter in the password field
    And I click on sign in button in the agency sign in page
    And I verify the agency email "elife24@gmail.com" in the home page


