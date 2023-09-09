package StepDefinitions.CorporateApp;

import Database.Corporate_App_DB;
import PageComponent.CorporateApp.CForgotPasswordPage;
import PageComponent.CorporateApp.CSignInPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;

import java.io.IOException;
import java.sql.SQLException;

public class C_Forgot_Password_Steps {
      @And("I click on the corporate forgot password link")
      public void iClickOnTheCorporateForgotPasswordLink() {
            CSignInPage.getInstance().clickOnForgotPassword();
      }

      @Given("I enter valid corporate email id {string}")
      public void iEnterValidCorporateEmailId(String forgot_email) {
            CForgotPasswordPage.getInstance().enterForgotEmail(forgot_email);
      }

      @And("I click on corporate send code button")
      public void iClickOnCorporateSendCodeButton() {
            CForgotPasswordPage.getInstance().clickOnSendCodeBtn();
      }
      @Given("I wait for {int} secs to enter code")
      public void i_wait_for_secs_to_enter_code(Integer int1) throws InterruptedException {
            Thread.sleep(40000);
      }

      @And("I enter corporate forgot password as {string}")
      public void iEnterCorporateForgotPasswordAs(String forgot_password) {
            CForgotPasswordPage.getInstance().enterForgotPassword(forgot_password);
      }

      @And("I click on corporate finish")
      public void iClickOnCorporateFinish() throws InterruptedException {
            CForgotPasswordPage.getInstance().clickOnFinishBtn();
            Thread.sleep(3000);
      }

      @And("I get password from db for this corporate")
      public void iGetPasswordFromDbForThisCorporate() throws SQLException, IOException {
            Corporate_App_DB.GetCorporatePassword();
      }

      @And("Verify the corporate password {string} is updated in db")
      public void verifyTheCorporatePasswordIsUpdatedInDb(String password) throws SQLException, IOException {
            Assert.assertEquals(Corporate_App_DB.GetCorporatePassword(), password);
      }


}
