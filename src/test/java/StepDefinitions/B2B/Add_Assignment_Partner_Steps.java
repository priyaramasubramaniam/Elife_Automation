package StepDefinitions.B2B;

import PageComponent.B2B.B2BPartnerDetailsPage;
import PageComponent.B2B.B2BSearchPartnerPage;
import io.cucumber.java.en.And;
import org.junit.Assert;

public class Add_Assignment_Partner_Steps {
      @And("I enter partner id as {string}")
      public void iEnterPartnerIdAs(String parter_id) {
            B2BSearchPartnerPage.getInstance().enterPartnerId(parter_id);
      }

      @And("I click on the partner id link")
      public void iClickOnThePartnerIdLink() throws InterruptedException {
            B2BSearchPartnerPage.getInstance().clickOnPartnerId();
            Thread.sleep(3000);
      }

      @And("I click on employee dropdown in the partner details page")
      public void iClickOnEmployeeDropdownInThePartnerDetailsPage() {
            B2BPartnerDetailsPage.getInstance().clickOnEmployeeDD();
      }

      @And("I enter employee name as {string} in the partner details page")
      public void iEnterEmployeeNameAsInThePartnerDetailsPage(String employee_email) {
            B2BPartnerDetailsPage.getInstance().enterEmployeeEmail(employee_email);
      }

      @And("I click on the employee from dropdown in the partner details page")
      public void iClickOnTheEmployeeFromDropdownInThePartnerDetailsPage() {
            B2BPartnerDetailsPage.getInstance().clickOnEmployeeEmail();
      }

      @And("I click on employee start date calender in the partner details page")
      public void iEnterStartDateAsInThePartnerDetailsPage() {
            B2BPartnerDetailsPage.getInstance().clickOnEmployeeStartDateCalender();
      }
      @And("I click on employee start date from calender in the partner details page")
      public void iClickOnEmployeeStartDateFromCalenderInThePartnerDetailsPage() {
            B2BPartnerDetailsPage.getInstance().enterEmployeeStartDate();
      }

      @And("I click on employee save button in the partner details page")
      public void iClickOnEmployeeSaveButtonInThePartnerDetailsPage() {
            B2BPartnerDetailsPage.getInstance().clickOnSaveEmployeeBtn();
      }

      @And("I verify the success message as {string} in the partner details page")
      public void iVerifyTheSuccessMessageAsInThePartnerDetailsPage(String success_msg) {
            Assert.assertEquals(B2BPartnerDetailsPage.getInstance().getSuccessMessage(), success_msg);
      }
      @And("I verify the assigned employee is updated in Database")
      public void iVerifyTheAssignedEmployeeIsUpdatedInDatabase() {

      }


      @And("I click on lead generator dropdown in the partner details page")
      public void iClickOnLeadGeneratorDropdownInThePartnerDetailsPage() {
            B2BPartnerDetailsPage.getInstance().clickOnLeadGeneratorDD();
      }

      @And("I enter lead generator name as {string} in the partner details page")
      public void iEnterLeadGeneratorNameAsInThePartnerDetailsPage(String lead_gen_email) {
            B2BPartnerDetailsPage.getInstance().enterLeadGeneratorEmail(lead_gen_email);
      }

      @And("I click on the lead generator from dropdown in the partner details page")
      public void iClickOnTheLeadGeneratorFromDropdownInThePartnerDetailsPage() {
            B2BPartnerDetailsPage.getInstance().clickOnLeadGenEmail();
      }

      @And("I click on lead generator start date calender in the partner details page")
      public void iClickOnLeadGeneratorStartDateCalenderInThePartnerDetailsPage() throws InterruptedException {
            B2BPartnerDetailsPage.getInstance().clickOnLeadGenStartDateInput();
            Thread.sleep(3000);
      }

      @And("I click on lead generator start date from calender in the partner details page")
      public void iClickOnLeadGeneratorStartDateFromCalenderInThePartnerDetailsPage() {
            B2BPartnerDetailsPage.getInstance().clickOnLeadGenStartDate();
      }

      @And("I click on lead generator save button in the partner details page")
      public void iClickOnLeadGeneratorSaveButtonInThePartnerDetailsPage() throws InterruptedException {
            B2BPartnerDetailsPage.getInstance().clickOnLeadGenSaveBtn();
      }

      @And("I click on KAM dropdown in the partner details page")
      public void iClickOnKAMDropdownInThePartnerDetailsPage() throws InterruptedException {
            B2BPartnerDetailsPage.getInstance().clickOnKAMdd();
      }

      @And("I enter KAM name as {string} in the partner details page")
      public void iEnterKAMNameAsInThePartnerDetailsPage(String kam_email) {
            B2BPartnerDetailsPage.getInstance().enterKAMEmail(kam_email);
      }

      @And("I click on the KAM from dropdown in the partner details page")
      public void iClickOnTheKAMFromDropdownInThePartnerDetailsPage() {
            B2BPartnerDetailsPage.getInstance().clickOnKamEmail();
      }

      @And("I click on KAM start date calender in the partner details page")
      public void iClickOnKAMStartDateCalenderInThePartnerDetailsPage() throws InterruptedException {
            B2BPartnerDetailsPage.getInstance().clickOnKamStartDate();
            Thread.sleep(3000);
      }

      @And("I click on KAM start date from calender in the partner details page")
      public void iClickOnKAMStartDateFromCalenderInThePartnerDetailsPage() throws InterruptedException {
            B2BPartnerDetailsPage.getInstance().clickOnCalKamStartDate();
      }

      @And("I click on KAM save button in the partner details page")
      public void iClickOnKAMSaveButtonInThePartnerDetailsPage() {
            B2BPartnerDetailsPage.getInstance().clickOnKamSaveBtn();
      }


}
