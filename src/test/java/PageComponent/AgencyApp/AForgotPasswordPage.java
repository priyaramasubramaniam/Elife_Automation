package PageComponent.AgencyApp;

import PageComponent.AffiliateApp.AFForgotPasswordPage;
import Utilities.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AForgotPasswordPage {
      private static AForgotPasswordPage AForgotPasswordInstance;

      public AForgotPasswordPage(){}

      public static AForgotPasswordPage getInstance()
      {
            if(AForgotPasswordInstance == null)
            {
                  AForgotPasswordInstance = new AForgotPasswordPage();
            }
            return AForgotPasswordInstance;
      }
      @FindBy(xpath = "//input[@id='forgot-email']") private WebElement inputForgotEmail;
      public void enterForgotEmail(String forgot_email){Utils.setTextOnElement(inputForgotEmail, forgot_email);}
      @FindBy(xpath = "//input[@id='forgot-password']") private WebElement inputForgotPassword;
      public void enterForgotPassword(String forgot_password) { Utils.setTextOnElement(inputForgotPassword, forgot_password);}
      @FindBy(xpath = "//button[@id='forgot-password-act']") private WebElement btnFinish;
      public void clickOnFinishBtn(){ Utils.clickOnElement(btnFinish);}
      @FindBy(xpath = "//button[@id='forgot-password-cancel']") private WebElement btnCancel;
      public void clickOnCancelBtn(){ Utils.clickOnElement(btnCancel);}
      @FindBy(xpath = "//button[@id='forgot-code-send']") private WebElement btnSendCode;
      public void clickOnSendCodeBtn(){Utils.clickOnElement(btnSendCode);}
      @FindBy(xpath = "//input[@id='verification-code']") private WebElement inputCode;
      public void enterInputCode(String code){ Utils.setTextOnElement(inputCode, code);}
}
