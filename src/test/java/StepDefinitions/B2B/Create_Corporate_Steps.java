package StepDefinitions.B2B;

import Database.Corporate_App_DB;
import PageComponent.B2B.*;
import Utilities.Utils;
import Web_Driver_Manager.DriverManager;
import io.cucumber.java.en.*;
import org.junit.Assert;

import javax.rmi.CORBA.Util;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Create_Corporate_Steps {
      String corporateID;
      List<String> corporateDetailsDB;
      List<String> corporateDetailsUi;
      List<String> corporateDetailsFromDetailsPage;

      @And("I click on the Add Corporate button")
      public void iClickOnTheAddCorporateButton() {
            B2BSearchCorporatePage.getInstance().clickOnBtnAddCorp();
      }
      @Then("I verify the page contains {string} text")
      public void iVerifyThePageContainsText(String add_corp_text) {
            Assert.assertTrue(B2BAddCorporatePage.getInstance().CheckAddCorpDisplayed(add_corp_text));
      }

      @Then("I click on save button in the add corp page")
      public void iClickOnSaveButtonInTheAddCorpPage() throws InterruptedException {
            B2BAddCorporatePage.getInstance().clickOnSaveBtn();
            Thread.sleep(3000);
      }


      @Then("I verify error message for corp name as {string}")
      public void iVerifyErrorMessageForCorpNameAs(String corp_name) {
            Assert.assertEquals(B2BAddCorporatePage.getInstance().getErrorCorpNameText(), corp_name);
      }

      @Then("I verify error message for corp company address as {string}")
      public void iVerifyErrorMessageForCorpCompanyAddressAs(String corp_address) {
            Assert.assertEquals(B2BAddCorporatePage.getInstance().getErrorCorpAddressText(), corp_address);
      }

      @Then("I verify error message for corp country  as {string}")
      public void iVerifyErrorMessageForCorpCountryAs(String corp_country) {
            Assert.assertEquals(B2BAddCorporatePage.getInstance().getErrorCorpCountryText(), corp_country);
      }

      @Then("I verify error message for corp city  as {string}")
      public void iVerifyErrorMessageForCorpCityAs(String corp_city) {
            Assert.assertEquals(B2BAddCorporatePage.getInstance().getErrorCorpCity(), corp_city);
      }

      @Then("I verify error message for corp admin name as {string}")
      public void iVerifyErrorMessageForCorpAdminNameAs(String corp_admin_name) {
            Assert.assertEquals(B2BAddCorporatePage.getInstance().getErrorCorpAdminName(), corp_admin_name);
      }

      @Then("I verify error message for corp admin email as {string}")
      public void iVerifyErrorMessageForCorpAdminEmailAs(String corp_admin_email) {
            Assert.assertEquals(B2BAddCorporatePage.getInstance().getErrorCorpAdminEmail(), corp_admin_email);
      }

      @Then("I verify error message for corp country code as {string}")
      public void iVerifyErrorMessageForCorpCountryCodeAs(String corp_country_code) {
            Assert.assertEquals(B2BAddCorporatePage.getInstance().getErrorCorpCountryCode(), corp_country_code);
      }

      @Then("I verify error message for corp contact number as {string}")
      public void iVerifyErrorMessageForCorpContactNumberAs(String corp_contact_number) {
            Assert.assertEquals(B2BAddCorporatePage.getInstance().getErrorCorpAdminMobileNumber(), corp_contact_number);
      }

      @And("I enter new corporate name as {string}")
      public void iEnterNewCorporateNameAs(String corp_name) {
            B2BAddCorporatePage.getInstance().enterCorpName(corp_name);
      }
      @And("I enter corporate address as {string}")
      public void iEnterCorporateAddressAs(String corp_address) throws InterruptedException {
            B2BAddCorporatePage.getInstance().enterCorpAddress(corp_address);
            Thread.sleep(5000);
      }

      @And("I select address from the dropdown")
      public void iSelectAddressFromTheDropdown() {
            B2BAddCorporatePage.getInstance().selectCorpCompanyAddressFromDD();
      }

      @And("I enter corporate admin name as {string}")
      public void iEnterCorporateAdminNameAs(String corp_admin_name) {
            B2BAddCorporatePage.getInstance().enterCorpAdminName(corp_admin_name);
      }

      @And("I enter corporate admin email as {string}")
      public void iEnterCorporateAdminEmailAs(String corp_admin_email) {
            B2BAddCorporatePage.getInstance().enterCorpAdminEmail(corp_admin_email);
      }
      @And("I enter corporate country code as {string}")
      public void iEnterCorporateCountryCodeAs(String corp_country_code) throws InterruptedException {
            B2BAddCorporatePage.getInstance().enterCorpCountryCode(corp_country_code);
            Thread.sleep(3000);
      }
      @And("I select corporate country code from DD")
      public void iSelectCorporateCountryCodeFromDD() throws InterruptedException {
            B2BAddCorporatePage.getInstance().selectCorpCountryCodeFromDD();
      }
      @And("I enter corporate cell number as {string}")
      public void iEnterCorporateCellNumberAs(String corp_cell_number) {
            B2BAddCorporatePage.getInstance().enterCorpCellNumber(corp_cell_number);
      }
      @And("I enter corporate minimum cell number as {string}")
      public void iEnterCorporateMinimumCellNumberAs(String corp_cell_number_minimum) {
            B2BAddCorporatePage.getInstance().enterCorpCellNumber(corp_cell_number_minimum);
      }
      @And("I enter corporate maximum cell number as {string}")
      public void iEnterCorporateMaximumCellNumberAs(String corp_cell_number_maximum) {
            B2BAddCorporatePage.getInstance().enterCorpCellNumber(corp_cell_number_maximum);
      }
      @And("I click on generate button in the add corp page")
      public void iClickOnGenerateButtonInTheAddCorpPage() {
            B2BAddCorporatePage.getInstance().clickOnGeneratePassword();
      }
      @Then("I verify the error toast message {string}")
      public void iVerifyTheErrorToastMessage(String error_msg) {
            Assert.assertEquals(B2BAddCorporatePage.getInstance().getErrorMessage(), error_msg);
      }

      @Then("I verify the success toast message {string}")
      public void iVerifyTheSuccessToastMessage(String success_msg) {
            Assert.assertEquals(B2BAddCorporatePage.getInstance().getSuccessMessage(), success_msg);
      }
      @Then("I verify the the page redirects to corporate details page and contains corp name {string}")
      public void iVerifyTheThePageRedirectsToCorporateDetailsPageAndContainsCorpName(String corp_name) {
            Assert.assertTrue(B2BCorporateDetailsPage.getInstance().checkPageContainsCorpName(corp_name));
      }

      @Then("Verify the error message for corp admin email for invalid email {string}")
      public void verifyTheErrorMessageForCorpAdminEmailForInvalidEmail(String error_msg) {
            Assert.assertEquals(B2BAddCorporatePage.getInstance().getErrorMsgForEmail(), error_msg);
      }

      @Then("Verify the error message for corp admin mobile number for invalid cell number {string}")
      public void verifyTheErrorMessageForCorpAdminMobileNumberForInvalidCellNumber(String error_msg) {
            Assert.assertEquals(B2BAddCorporatePage.getInstance().getErrorMsgForNumber(), error_msg);
      }

      @Then("I get the corporate id from the database")
      public void iGetTheCorporateIdFromTheDatabase() throws SQLException, IOException {
            corporateID = Corporate_App_DB.getCorporateID();
      }
      @Then("I search corporate by corporate id in the corporate search page")
      public void iSearchCorporateByCorporateIdInTheCorporateSearchPage() throws InterruptedException {
            B2BSearchCorporatePage.getInstance().enterSearchCorporateID(corporateID);
            B2BSearchCorporatePage.getInstance().clickOnSearchCorporateBtn();
            Thread.sleep(3000);
      }


      @Then("I verify the corporate details {string},{string},{string},{string} in the corporate search page")
      public void iVerifyTheCorporateDetailsInTheCorporateSearchPage(String corp_name, String corp_admin_name, String corp_admin_email, String corp_admin_number) {
            Assert.assertEquals(B2BSearchCorporatePage.getInstance().getCorpName(), corp_name);
            Assert.assertEquals(B2BSearchCorporatePage.getInstance().getCorpAdminName(), corp_admin_name);
            Assert.assertEquals(B2BSearchCorporatePage.getInstance().getCorpAdminEmail(), corp_admin_email);
//            Assert.assertEquals(B2BSearchCorporatePage.getInstance().getCorpAdminCellNumber(), corp_admin_number);
      }

      @Then("I get the corporate details from db")
      public void iGetTheCorporateDetailsFromDb() throws SQLException, IOException {
             corporateDetailsDB = Corporate_App_DB.getCorporateDetails();
      }

      @Then("I get the corporate details from UI")
      public void iGetTheCorporateDetailsFromUI() {
            corporateDetailsUi = B2BSearchCorporatePage.getInstance().getCorporateDetails();
      }

      @And("I verify the corporate details from db should be equal to corporate details from UI")
      public void iVerifyTheCorporateDetailsFromDbShouldBeEqualToCorporateDetailsFromUI() {
            Assert.assertEquals(corporateDetailsDB, corporateDetailsUi);
      }

      @Then("I get the corporate details from the corp details page")
      public void iGetTheCorporateDetailsFromTheCorpDetailsPage() {
            corporateDetailsFromDetailsPage = B2BCorporateDetailsPage.getInstance().getCorporateDetails();
      }

      @And("I verify the corporate details from db should be equal to corporate details from the corp details page")
      public void iVerifyTheCorporateDetailsFromDbShouldBeEqualToCorporateDetailsFromTheCorpDetailsPage() {
            Assert.assertEquals(corporateDetailsDB, corporateDetailsFromDetailsPage);
      }


      @And("I click on the save button")
      public void iClickOnTheSaveButton() {
      }

      @Then("Verify the error message for corp name {string}")
      public void verifyTheErrorMessageForCorpName(String arg0) {
      }

      @Then("Verify the error message for corp address {string}")
      public void verifyTheErrorMessageForCorpAddress(String arg0) {
      }

      @And("I enter name as {string}")
      public void iEnterNameAs(String arg0) {
      }

      @And("I enter the address as {string}")
      public void iEnterTheAddressAs(String arg0) {
      }

      @When("I refresh the page")
      public void iRefreshThePage() {
      }

      @And("I enter corporate name {string} in the name input field")
      public void iEnterCorporateNameInTheNameInputField(String arg0) {
      }

      @And("I select corp name from the dropdown")
      public void iSelectCorpNameFromTheDropdown() {
      }
      @Then("I verify error message for corp password as {string}")
      public void iVerifyErrorMessageForCorpPasswordAs(String corp_password) {
            Assert.assertEquals(B2BAddCorporatePage.getInstance().getErrorCorpAdminPassword(), corp_password);
      }



      @Given("I open Back office website")
      public void iOpenBackOfficeWebsite() throws IOException {
            DriverManager.getDriver().get(Utils.getGlobalValue("BACK_OFFICE_URL"));
      }

      @And("I enter back office email as {string}")
      public void iEnterBackOfficeEmailAs(String email) {
            B2BSignInPage.getInstance().enterInputEmail(email);
      }

      @And("I enter back office password as {string}")
      public void iEnterBackOfficePasswordAs(String password) {
            B2BSignInPage.getInstance().enterInputPassword(password);
      }

      @And("I click on sign in button in the back office login page")
      public void iClickOnSignInButtonInTheBackOfficeLoginPage() throws InterruptedException {
            B2BSignInPage.getInstance().clickBtnSignIn();
            Thread.sleep(3000);
      }

      @And("I click on b-b link")
      public void iClickOnBBLink() throws InterruptedException {
            B2BApplicationSelectionPage.getInstance().clickLinkB2B();
      }


      @When("I click on the search corporate from the navigation bar")
      public void i_click_on_the_search_corporate_from_the_navigation_bar() throws InterruptedException {
            B2BNavBarPage.getInstance().clickOnSearchCorporateLink();
            Thread.sleep(3000);
      }



}
