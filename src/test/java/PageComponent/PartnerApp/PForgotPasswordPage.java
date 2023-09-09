package PageComponent.PartnerApp;

import Utilities.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PForgotPasswordPage {

      private static PForgotPasswordPage PForgotPasswordInstance;

      public PForgotPasswordPage(){}

      public static PForgotPasswordPage getInstance()
      {
            if(PForgotPasswordInstance == null)
            {
                  PForgotPasswordInstance = new PForgotPasswordPage();
            }
            return PForgotPasswordInstance;
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
