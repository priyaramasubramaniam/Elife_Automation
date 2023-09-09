package PageComponent.AffiliateApp;

import PageComponent.CorporateApp.CSignInPage;
import Utilities.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.rmi.CORBA.Util;
import java.nio.file.Watchable;

public class AFForgotPasswordPage {

      private static AFForgotPasswordPage AFFForgotPasswordInstance;

      public AFForgotPasswordPage(){}

      public static AFForgotPasswordPage getInstance()
      {
            if(AFFForgotPasswordInstance == null)
            {
                  AFFForgotPasswordInstance = new AFForgotPasswordPage();
            }
            return AFFForgotPasswordInstance;
      }
      @FindBy(xpath = "//input[@id='forgot-email']") private WebElement inputForgotEmail;
      public void enterForgotEmail(String  forgot_email){
            Utils.setTextOnElement(inputForgotEmail, forgot_email);
      }
      @FindBy(xpath = "//button[@id='forgot-code-send']") private WebElement btnSendCode;
      public void clickOnSendCodeBtn(){Utils.clickOnElement(btnSendCode);}
      public boolean isSendCodeEnabled(){return Utils.checkIfElementIsEnabled(btnSendCode);}
      public boolean isSendCodeNotEnabled(){ return Utils.checkIfElementIsNotEnabled(btnSendCode);}
      @FindBy(xpath = "//input[@id='verification-code']") private WebElement inputVerificationCode;
      public void enterVerificationCode(String  code){Utils.setTextOnElement(inputVerificationCode, code);}
      @FindBy(xpath = "//input[@id='forgot-password']") private WebElement inputForgotPassword;
      public void enterForgotPassword(String forgot_pswd){Utils.setTextOnElement(inputForgotPassword, forgot_pswd);}
      @FindBy(xpath = "//button[@id='forgot-password-act']") private WebElement btnFinish;
      public void clickOnFinishBtn(){Utils.clickOnElement(btnFinish);}
      @FindBy(xpath = "//button[@id='forgot-password-cancel']") private WebElement btnCancel;
      public void clickOnCancelBtn(){Utils.clickOnElement(btnCancel);}
      @FindBy(xpath = "//*[@id=\"top-details-message\"]/strong") private WebElement errorMsg;
      public String getErrorMsg(){return Utils.getWebElementText(errorMsg);}
}
