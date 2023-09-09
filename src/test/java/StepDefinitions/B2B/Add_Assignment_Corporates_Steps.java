package StepDefinitions.B2B;

import PageComponent.B2B.B2BCorporateDetailsPage;
import PageComponent.B2B.B2BSearchCorporatePage;
import io.cucumber.java.en.And;

public class Add_Assignment_Corporates_Steps {
      @And("I enter corporate id as {string}")
      public void iEnterCorporateIdAs(String corporate_id) {
            B2BSearchCorporatePage.getInstance().enterSearchCorporateID(corporate_id);
      }

      @And("I click on employee dropdown in the corporate details page")
      public void iClickOnEmployeeDropdownInTheCorporateDetailsPage() {
            B2BCorporateDetailsPage.getInstance().clickOnCorporateEmployeeDD();
      }

      @And("I enter employee name as {string} in the corporate details page")
      public void iEnterEmployeeNameAsInTheCorporateDetailsPage(String corp_employee_name) {
            B2BCorporateDetailsPage.getInstance().enterCorporateEmpEmail(corp_employee_name);
      }

      @And("I click on the employee from dropdown in the corporate details page")
      public void iClickOnTheEmployeeFromDropdownInTheCorporateDetailsPage() {
            B2BCorporateDetailsPage.getInstance().clickOnCorpEmpEmail();
      }

      @And("I click on employee start date calender in the corporate details page")
      public void iClickOnEmployeeStartDateCalenderInTheCorporateDetailsPage() {
            B2BCorporateDetailsPage.getInstance().clickOnStartDateCal();
      }

      @And("I click on employee start date from calender in the corporate details page")
      public void iClickOnEmployeeStartDateFromCalenderInTheCorporateDetailsPage() {
            B2BCorporateDetailsPage.getInstance().clickOnStartDate();
      }

      @And("I click on employee save button in the corporate details page")
      public void iClickOnEmployeeSaveButtonInTheCorporateDetailsPage() {
            B2BCorporateDetailsPage.getInstance().clickOnSaveEmployeeBtn();
      }

      @And("I verify the success message as {string} in the corporate details page")
      public void iVerifyTheSuccessMessageAsInTheCorporateDetailsPage(String success_msg) {
            B2BCorporateDetailsPage.getInstance().getSuccessMsg();
      }

      @And("I click on lead generator dropdown in the corporate details page")
      public void iClickOnLeadGeneratorDropdownInTheCorporateDetailsPage() {
            B2BCorporateDetailsPage.getInstance().clickOnDDCorpLead();
      }

      @And("I enter lead generator name as {string} in the corporate details page")
      public void iEnterLeadGeneratorNameAsInTheCorporateDetailsPage(String corp_lead_email) {
            B2BCorporateDetailsPage.getInstance().enterCorpLeadEmail(corp_lead_email);
      }

      @And("I click on the lead generator from dropdown in the corporate details page")
      public void iClickOnTheLeadGeneratorFromDropdownInTheCorporateDetailsPage() {
            B2BCorporateDetailsPage.getInstance().clickOnCorpLeadEmail();
      }

      @And("I click on lead generator start date calender in the corporate details page")
      public void iClickOnLeadGeneratorStartDateCalenderInTheCorporateDetailsPage() {
            B2BCorporateDetailsPage.getInstance().clickOnLeadStartDate();
      }

      @And("I click on lead generator start date from calender in the corporate details page")
      public void iClickOnLeadGeneratorStartDateFromCalenderInTheCorporateDetailsPage() {
            B2BCorporateDetailsPage.getInstance().clickOnLeadStartDateText();
      }

      @And("I click on lead generator save button in the corporate details page")
      public void iClickOnLeadGeneratorSaveButtonInTheCorporateDetailsPage() {
            B2BCorporateDetailsPage.getInstance().clickOnLeadSaveBtn();
      }

      @And("I click on KAM dropdown in the corporate details page")
      public void iClickOnKAMDropdownInTheCorporateDetailsPage() {
            B2BCorporateDetailsPage.getInstance().clickOnDDCorporateKAM();
      }

      @And("I enter KAM name as {string} in the corporate details page")
      public void iEnterKAMNameAsInTheCorporateDetailsPage(String corp_kam_email) {
            B2BCorporateDetailsPage.getInstance().enterCorpKamEmail(corp_kam_email);
      }

      @And("I click on the KAM from dropdown in the corporate details page")
      public void iClickOnTheKAMFromDropdownInTheCorporateDetailsPage() {
            B2BCorporateDetailsPage.getInstance().clickOnCorpKamEmailText();
      }

      @And("I click on KAM start date calender in the corporate details page")
      public void iClickOnKAMStartDateCalenderInTheCorporateDetailsPage() {
            B2BCorporateDetailsPage.getInstance().clickOnStartDateKamCal();
      }

      @And("I click on KAM start date from calender in the corporate details page")
      public void iClickOnKAMStartDateFromCalenderInTheCorporateDetailsPage() {
            B2BCorporateDetailsPage.getInstance().clickOnStartDateKamText();
      }

      @And("I click on KAM save button in the corporate details page")
      public void iClickOnKAMSaveButtonInTheCorporateDetailsPage() {
            B2BCorporateDetailsPage.getInstance().clickOnKamSaveBtn();
      }
}
