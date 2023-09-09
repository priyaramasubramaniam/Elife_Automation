Feature: This is to verify the Assignment functionality

  Background: Admin user can add corporate in the b2b management app
    Given I open Back office website
    And I enter back office email as "gangye@elifetransfer.com"
    And I enter back office password as "qweasdzxc"
    And I click on sign in button in the back office login page
    And I click on b-b link
    Given I click on search affiliate from nav bar
    And I enter affiliate id as "1"
    And I click on search button in the search affiliate page
    And I click on the affiliate id link

  Scenario: This is to verify the Employee assignment is successfully done
    And I click on employee dropdown in the affiliate details page
    And I enter employee name as "b2bmanager@elifetransfer.com" in the affiliate details page
    And I click on the employee from dropdown in the affiliate details page
    And I click on employee start date calender in the affiliate details page
    And I click on employee start date from calender in the affiliate details page
    And I click on employee save button in the affiliate details page
    And I verify the success message as "Success" in the affiliate details page

  Scenario: This is to verify the Lead generator assignment is successfully done
    And I click on lead generator dropdown in the affiliate details page
    And I enter lead generator name as "miguel@elifeteam.com" in the affiliate details page
    And I click on the lead generator from dropdown in the affiliate details page
    And I click on lead generator start date calender in the affiliate details page
    And I click on lead generator start date from calender in the affiliate details page
    And I click on lead generator save button in the affiliate details page
    And I verify the success message as "Success" in the affiliate details page
  @1
  Scenario: This is to verify the KAM assignment is successfully done
    And I click on KAM dropdown in the affiliate details page
    And I enter KAM name as "b2bkam@elifetransfer.com" in the affiliate details page
    And I click on the KAM from dropdown in the affiliate details page
    And I click on KAM start date calender in the affiliate details page
    And I click on KAM start date from calender in the affiliate details page
    And I click on KAM save button in the affiliate details page
    And I verify the success message as "Success" in the affiliate details page

