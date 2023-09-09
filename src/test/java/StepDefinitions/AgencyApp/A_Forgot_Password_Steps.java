package StepDefinitions.AgencyApp;

import Database.Agency_App_DB;
import PageComponent.AffiliateApp.AFForgotPasswordPage;
import PageComponent.AffiliateApp.AFSignInPage;
import PageComponent.AgencyApp.AForgotPasswordPage;
import PageComponent.AgencyApp.ASignInPage;
import Utilities.Utils;
import Web_Driver_Manager.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;

import java.io.IOException;
import java.sql.SQLException;

public class A_Forgot_Password_Steps {
      @And("I verify the page is redirected to forgot password page")
      public void iVerifyThePageIsRedirectedToForgotPasswordPage() {
            Assert.assertTrue(DriverManager.getDriver().getPageSource().contains("Forgot Password"));
      }
      @Given("I click on the agency forgot password link")
      public void i_click_on_the_agency_forgot_password_link() {
            ASignInPage.getInstance().clickOnForgotPasswordLink();
      }
      @Given("I enter valid agency email id {string}")
      public void i_enter_valid_agency_email_id(String forgot_email) throws InterruptedException {
            AForgotPasswordPage.getInstance().enterForgotEmail(forgot_email);
            Thread.sleep(2000);
      }
      @Given("I click on agency send code button")
      public void i_click_on_agency_send_code_button() {
            AForgotPasswordPage.getInstance().clickOnSendCodeBtn();
      }
      @Given("I wait for {int} secs to enter code")
      public void i_wait_for_secs_to_enter_code(Integer int1) throws InterruptedException {
            Thread.sleep(40000);
      }
      @Given("I enter agency forgot password as {string}")
      public void i_enter_agency_forgot_password_as(String forgot_password) {
            AForgotPasswordPage.getInstance().enterForgotPassword(forgot_password);
      }
      @Given("I click on agency finish")
      public void i_click_on_agency_finish() {
           AForgotPasswordPage.getInstance().clickOnFinishBtn();
      }
      @Given("I get password from db for this agency")
      public void i_get_password_from_db_for_this_agency() throws SQLException, IOException {
            Agency_App_DB.GetAgencyPassword();
      }
      @Given("Verify the agency password {string} is updated in db")
      public void verify_the_agency_password_is_updated_in_db(String password) throws SQLException, IOException {
            Assert.assertEquals(Agency_App_DB.GetAgencyPassword(), password);
      }

      @Given("I enter invalid agency email id {string}")
      public void iEnterInvalidAgencyEmailId(String invalid_email) {
            AForgotPasswordPage.getInstance().enterForgotEmail(invalid_email);
      }

      @And("Verify the agency error message {string}")
      public void verifyTheAgencyErrorMessage(String error_msg) {

      }

      @And("Verify the agency send code button should be enabled")
      public void verifyTheAgencySendCodeButtonShouldBeEnabled() {
      }

      @And("Verify the agency send code button should be disabled after {int}seconds")
      public void verifyTheAgencySendCodeButtonShouldBeDisabledAfterSeconds(int arg0) {
      }

      @And("Verify the agency send code button should be disabled before entering email")
      public void verifyTheAgencySendCodeButtonShouldBeDisabledBeforeEnteringEmail() {
      }

      @And("Verify the agency send code button should be enabled after entering email")
      public void verifyTheAgencySendCodeButtonShouldBeEnabledAfterEnteringEmail() {
      }


}
