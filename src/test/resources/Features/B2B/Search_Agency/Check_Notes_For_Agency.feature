Feature: This test is to verify the download note for agency on B2B

  Background: This will run before all the scenarios
    Given I open Back office website
    When I enter back office email as "gangye@elifetransfer.com"
    And I enter back office password as "qweasdzxc"
    And I click on sign in button in the back office login page
    And I click on b-b link
    And I click on the search agency from the navigation bar
    Given I enter agency name as "elife1"
    When I click on search button in the search agency page
    And I click on the agency id link
    And I click on notes menu

  Scenario: This is to verify the add button should be disabled when the notes field is empty
    And I verify the add button is disabled when no text in the notes field

  Scenario: This is to verify the add button should be disabled when we enter blank spaces
    And I enter "   " in the notes field
    And I verify the add button is disabled when blank spaces in the notes field

  Scenario: This test to verify the notes functionality without download option
    And I enter agency notes as "Notes example12345"
    And I click on add button in the notes page
    And I verify the success toast message "Success" in notes page
    And I verify the notes "Notes : Notes example12345" added successfully in the UI

  Scenario: This test to verify the notes functionality with download option
    And I enter agency notes as "This is the note to test download note as a text file is visible or not when the char limit is greater than thirty two"
    And I click on add button in the notes page
    And I verify the success toast message "Success" in notes page
    And I verify the notes "Download note as text file" is displaying in the UI if the char limit is greater than thirty two

  Scenario: This test is to verify the download note data with our expected note data
    Given I enter agency notes as "This is the note to test download note as a text file is visible or not when the char limit is greater"
    And I click on add button in the notes page
    And I verify the success toast message "Success" in notes page
    And I get the agency notes data from csv file
    And I compare the Csv agency note data to my expected data "This is the note to test download note as a text file is visible or not when the char limit is greater"


  Scenario: This test is to verify the added note are updated in the db
    And I enter agency notes as "test note in db"
    And I click on add button in the notes page
    And I verify the success toast message "Success" in notes page
    And I verify the notes "Notes : test note in db" added successfully in the UI
    And I verify the notes "Notes : test note in db" updated successfully in the DB



