package StepDefinitions.AffiliateApp;

import Database.Affiliate_App_DB;
import PageComponent.AffiliateApp.AFForgotPasswordPage;
import PageComponent.AffiliateApp.AFSignInPage;
import Utilities.Utils;
import Web_Driver_Manager.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;

import java.io.IOException;
import java.sql.Driver;
import java.sql.SQLException;

public class AF_Forgot_Password_Steps {
      @Given("I open affiliate app website")
      public void i_open_affiliate_app_website() throws IOException {
            DriverManager.getDriver().get(Utils.getGlobalValue("AFFILIATE_APP_URL"));
      }
      @Given("I click on the affiliate forgot password link")
      public void i_click_on_the_affilite_forgot_password_link() {
            AFSignInPage.getInstance().clickOnForgotPasswordLink();
      }
      @Given("I enter valid affiliate email id {string}")
      public void iEnterValidAffiliateEmailId(String forgot_email) {
            AFForgotPasswordPage.getInstance().enterForgotEmail(forgot_email);
      }
      @Given("I click on affiliate send code button")
      public void i_click_on_affiliate_send_code_button() {
            AFForgotPasswordPage.getInstance().clickOnSendCodeBtn();
      }
      @Given("I wait for {int} secs to enter code")
      public void i_wait_for_secs_to_enter_code(Integer int1) throws InterruptedException {
            Thread.sleep(40000);
      }
      @Given("I enter affiliate forgot password as {string}")
      public void i_enter_affiliate_forgot_password_as(String forgot_pswd) {
            AFForgotPasswordPage.getInstance().enterForgotPassword(forgot_pswd);
      }
      @Given("I click on affiliate finish")
      public void i_click_on_affiliate_finish() throws InterruptedException {
            AFForgotPasswordPage.getInstance().clickOnFinishBtn();
            Thread.sleep(3000);
      }
      @Given("I get password from db for this affiliate")
      public void i_get_password_from_db_for_this_affiliate() throws SQLException, IOException {
            Affiliate_App_DB.GetAffiliatePassword();
      }

      @And("Verify the affiliate password {string} is updated in db")
      public void verifyTheAffiliatePasswordIsUpdatedInDb(String updated_password) throws SQLException, IOException {
            Assert.assertEquals(Affiliate_App_DB.GetAffiliatePassword(), updated_password);
      }

      @Given("I enter invalid affiliate email id {string}")
      public void iEnterInvalidAffiliateEmailId(String invalid_email) {
            AFForgotPasswordPage.getInstance().enterForgotEmail(invalid_email);
      }

      @And("Verify the affiliate error message {string}")
      public void verifyTheAffiliateErrorMessageForAffiliateWrongEmail(String error_msg) {
            String message = AFForgotPasswordPage.getInstance().getErrorMsg();
            Assert.assertEquals(message, error_msg);
      }

      @And("Verify the affiliate send code button should be enabled")
      public void verifyTheAffiliateSendCodeButtonShouldBeEnabled() {
            Assert.assertTrue("Send code button is not enabled" , AFForgotPasswordPage.getInstance().isSendCodeEnabled());
      }

      @And("I wait for {int}seconds")
      public void iWaitForSeconds(int arg0) throws InterruptedException {
            Thread.sleep(60);
      }

      @And("Verify the affiliate send code button should be disabled after {int}seconds")
      public void verifyTheAffiliateSendCodeButtonShouldBeDisabledAfterSeconds(int arg0) {
            Assert.assertTrue("Send Code button is not disabled after 60 seconds", AFForgotPasswordPage.getInstance().isSendCodeNotEnabled());
      }

      @And("I click on cancel button")
      public void iClickOnCancelButton() throws InterruptedException {
            AFForgotPasswordPage.getInstance().clickOnCancelBtn();
            Thread.sleep(3000);
      }

      @And("Verify the page redirects to sign in page")
      public void verifyThePageRedirectsToSignInPage() {
            Assert.assertTrue(AFSignInPage.getInstance().isForgotPasswordDisplayed());
      }

      @And("Verify the affiliate send code button should be disabled before entering email")
      public void verifyTheAffiliateSendCodeButtonShouldBeDisabledBeforeEnteringEmail() {
            Assert.assertTrue(AFForgotPasswordPage.getInstance().isSendCodeNotEnabled());
      }

      @And("Verify the affiliate send code button should be enabled after entering email")
      public void verifyTheAffiliateSendCodeButtonShouldBeEnabledAfterEnteringEmail() {
            Assert.assertTrue(AFForgotPasswordPage.getInstance().isSendCodeEnabled());
      }


}
