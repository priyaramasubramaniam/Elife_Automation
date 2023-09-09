package StepDefinitions.AgencyApp;

import PageComponent.AgencyApp.ASignInPage;
import PageComponent.AgencyApp.ASignUpPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class A_SignUp_Steps {
      @And("I click on sign up link")
      public void iClickOnSignUpLink() {
            ASignInPage.getInstance().clickOnSignUpLink();
      }

      @And("I enter agency or company name as {string}")
      public void iEnterAgencyOrCompanyNameAs(String agency_name) {
            ASignUpPage.getInstance().enterAgencyName(agency_name);
      }

      @And("I enter agency address as {string}")
      public void iEnterAgencyAddressAs(String agency_address) {
            ASignUpPage.getInstance().enterAgencyAddress(agency_address);
      }

      @And("I select agency address from the dropdown")
      public void iSelectAgencyAddressFromTheDropdown() {
            ASignUpPage.getInstance().clickOnAgencyAddress();
      }

      @And("I enter company representative as {string}")
      public void iEnterCompanyRepresentativeAs(String company_rep) {
            ASignUpPage.getInstance().enterCompanyRep(company_rep);
      }

      @And("I enter country code as {string}")
      public void iEnterCountryCodeAs(String country_code) {
            ASignUpPage.getInstance().enterCountryCode(country_code);
      }

      @And("I select country code from dropdown")
      public void iSelectCountryCodeFromDropdown() {
            ASignUpPage.getInstance().selectCountryCodeFromDD();
      }

      @And("I enter agency mobile number as {string}")
      public void iEnterAgencyMobileNumberAs(String cell_number) {
            ASignUpPage.getInstance().enterCellNumber(cell_number);
      }
      @And("I enter agency email as {string}")
      public void iEnterAgencyEmailAs(String agency_email) {
            ASignUpPage.getInstance().enterEmail(agency_email);
      }

      @And("I click on get code button")
      public void iClickOnGetCodeButton() {
            ASignUpPage.getInstance().clickOnGetCodeBtn();
      }

      @And("I enter agency password as {string}")
      public void iEnterAgencyPasswordAs(String password) {
            ASignUpPage.getInstance().enterAGencyPassword(password);
      }

      @And("I click on sign up button")
      public void iClickOnSignUpButton() throws InterruptedException {
            ASignUpPage.getInstance().clickOnSignUpBtn();
            Thread.sleep(5000);
      }


      @And("I get added agency from DB")
      public void iGetAddedAgencyFromDB() {

      }
}
