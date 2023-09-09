package StepDefinitions.AgencyApp;

import Database.Agency_App_DB;
import PageComponent.AgencyApp.ADashboardPage;
import PageComponent.AgencyApp.ASignInPage;
import Utilities.Utils;
import Web_Driver_Manager.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.io.IOException;
import java.sql.SQLException;

public class A_Sign_In_Steps {
      String agencyPassword;
      @Given("I open agency app website")
      public void i_open_agency_app_website() throws IOException {
            DriverManager.getDriver().get(Utils.getGlobalValue("AGENCY_APP_URL"));
      }

      @When("I enter agency signin username as {string}")
      public void iEnterAgencySigninUsernameAs(String username) {
            ASignInPage.getInstance().enterUsername(username);
      }

      @And("I enter agency signin password as {string}")
      public void iEnterAgencySigninPasswordAs(String password) {
            ASignInPage.getInstance().enterPassword(password);
      }

      @And("I click on sign in button in the agency sign in page")
      public void iClickOnSignInButtonInTheAgencySignInPage() {
            ASignInPage.getInstance().clickOnSignInBtn();
      }

      @And("I verify the agency email {string} in the home page")
      public void iVerifyTheAgencyEmailInTheHomePage(String agency_email) {
            Assert.assertEquals( ADashboardPage.getInstance().getAgencyEmail(), agency_email);
      }

      @And("I verify the error message in the agency signin page as {string}")
      public void iVerifyTheErrorMessageInTheAgencySigninPageAs(String error_message) throws InterruptedException {
            Assert.assertEquals(ASignInPage.getInstance().getErrorMsgText(), error_message);
      }

      @And("I get the password from db and enter in the password field")
      public void iGetThePasswordFromDbAndEnterInThePasswordField() throws SQLException, IOException {
            ASignInPage.getInstance().enterPassword(Agency_App_DB.GetAgencyPassword());
      }
}
