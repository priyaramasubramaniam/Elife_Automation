package StepDefinitions.PartnerApp;

import Database.Partner_App_DB;
import PageComponent.PartnerApp.PForgotPasswordPage;
import PageComponent.PartnerApp.PSignInPage;
import Utilities.Utils;
import Web_Driver_Manager.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;

import java.io.IOException;
import java.sql.SQLException;

public class P_Forgot_Password_Steps {
      @Given("I open partner app website")
      public void iOpenPartnerAppWebsite() throws IOException {
            DriverManager.getDriver().get(Utils.getGlobalValue("PARTNER_APP_URL"));
      }

      @And("I click on the partner forgot password link")
      public void iClickOnThePartnerForgotPasswordLink() {
            PSignInPage.getInstance().clickOnForgotPasswordLink();
      }

      @Given("I enter valid partner email id {string}")
      public void iEnterValidPartnerEmailId(String forgot_email) {
            PForgotPasswordPage.getInstance().enterForgotEmail(forgot_email);
      }

      @And("I click on partner send code button")
      public void iClickOnPartnerSendCodeButton() {
            PForgotPasswordPage.getInstance().clickOnSendCodeBtn();
      }

      @And("I enter partner forgot password as {string}")
      public void iEnterPartnerForgotPasswordAs(String forgot_password) {
            PForgotPasswordPage.getInstance().enterForgotPassword(forgot_password);
      }

      @And("I click on partner finish")
      public void iClickOnPartnerFinish() {
            PForgotPasswordPage.getInstance().clickOnFinishBtn();
      }

      @And("I get password from db for this partner")
      public void iGetPasswordFromDbForThisPartner() throws SQLException, IOException {
            Partner_App_DB.GetPartnerPassword();
      }

      @And("Verify the partner password {string} is updated in db")
      public void verifyThePartnerPasswordIsUpdatedInDb(String password) throws SQLException, IOException {
            Assert.assertEquals(Partner_App_DB.GetPartnerPassword(), password);
      }
}
