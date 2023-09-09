package PageComponent.CorporateApp;

import Utilities.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CSignInPage {

      private static CSignInPage CSignInInstance;

      public CSignInPage(){}

      public static CSignInPage getInstance()
      {
            if(CSignInInstance == null)
            {
                  CSignInInstance = new CSignInPage();
            }
            return CSignInInstance;
      }
      @FindBy(xpath = "//input[@id='sign-in-email']")
      private WebElement inputEmail;
      @FindBy(xpath = "//input[@id='sign-in-password']")
      private WebElement inputPassword;
      @FindBy(xpath = "//button[@id='sign-in-act']")
      private WebElement btnSignin;
      @FindBy(xpath = "//a[@id='sign-in-forgot-btn']") private WebElement linkForgotPassword;
      public void clickOnForgotPassword(){Utils.clickOnElement(linkForgotPassword);}

      public void enterEmail(String email){ inputEmail.sendKeys(email);}
      public void enterPassword(String pswd){ inputPassword.sendKeys(pswd);}
      public void clickOnSigninBtn(){btnSignin.click();}
}
