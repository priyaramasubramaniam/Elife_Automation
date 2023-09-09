Feature: This is to verify the Dashboard page

  Background: Admin user can add corporate in the b2b management app
    Given I open Back office website
    And I enter back office email as "gangye@elifetransfer.com"
    And I enter back office password as "qweasdzxc"
    And I click on sign in button in the back office login page
    And I click on b-b link

  Scenario: This is to verify the count in the Ui and DB
    And I verify the count of agency in db should be equal to count of agency in the UI
    And I verify the count of partner in db should be equal to count of partner in the UI
    And I verify the count of affiliate in db should be equal to count of affiliate in the UI
    And I verify the count of affiliate in db should be equal to count of affiliate in the UI
    And I verify the count of corporate in db should be equal to count of corporate in the UI

  Scenario: This is to verify the recent count in the Ui and DB in last week
    And I verify the count of recent agencies in db should be equal to count of recent agencies in the UI "7"
    And I verify the count of recent partners in db should be equal to count of recent partners in the UI "7"
    And I verify the count of recent affiliates in db should be equal to count of recent affiliates in the UI "7"
    And I verify the count of recent corporates in db should be equal to count of recent corporates in the UI "7"

  Scenario: This is to verify the recent count in the Ui and DB in last week
    And I click on the last month link in the dashboard page
    And I verify the count of recent agencies in db should be equal to count of recent agencies in the UI "30"
    And I verify the count of recent partners in db should be equal to count of recent partners in the UI "30"
    And I verify the count of recent affiliates in db should be equal to count of recent affiliates in the UI "30"
    And I verify the count of recent corporates in db should be equal to count of recent corporates in the UI "30"
@1
  Scenario: This is to verify the recent names and dates in the Ui and DB in last week
    And I verify the recent agencies in DB should be equal to recent agencies in UI "7"
    And I verify the recent partners in DB should be equal to recent partners in UI "7"
    And I verify the recent affiliates in DB should be equal to recent affiliates in UI "7"
    And I verify the recent corporates in DB should be equal to recent corporates in UI "7"
@1
  Scenario: This is to verify the recent names and dates in the Ui and DB in last month
    And I click on the last month link in the dashboard page
    And I verify the recent agencies in DB should be equal to recent agencies in UI "30"
    And I verify the recent partners in DB should be equal to recent partners in UI "30"
    And I verify the recent affiliates in DB should be equal to recent affiliates in UI "30"
    And I verify the recent corporates in DB should be equal to recent corporates in UI "30"



