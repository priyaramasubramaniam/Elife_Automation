package PageComponent.AgencyApp;

import PageComponent.AffiliateApp.AFSignInPage;
import Utilities.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.rmi.CORBA.Util;

public class ASignInPage {

      private static ASignInPage ASignInInstance;

      public ASignInPage(){}

      public static ASignInPage getInstance()
      {
            if(ASignInInstance == null)
            {
                  ASignInInstance = new ASignInPage();
            }
            return ASignInInstance;
      }

      @FindBy(id = "sign-in-email") private WebElement inputUsername;
      public void enterUsername(String username){
            Utils.setTextOnElement(inputUsername, username);
      }
      @FindBy(id = "sign-in-password") private WebElement inputPassword;
      public void enterPassword(String password) {
            Utils.setTextOnElement(inputPassword, password);}
      @FindBy(id = "sign-in-act") private WebElement btnSignIn;
      public void clickOnSignInBtn() {Utils.clickOnElement(btnSignIn);}
      @FindBy(xpath = "/html/body/div[2]/div[3]/strong") private WebElement textErrorMsg;
      public String getErrorMsgText() throws InterruptedException {
            Thread.sleep(3000);
            return Utils.getWebElementText(textErrorMsg);}
      @FindBy(xpath = "//a[@id='sign-in-forgot-btn']") private WebElement linkForgotPassword;
      public void clickOnForgotPasswordLink(){Utils.clickOnElement(linkForgotPassword);}
      @FindBy(xpath = "//a[@id='sign-up-btn']") private WebElement linkSignUp;
      public void clickOnSignUpLink(){ Utils.clickOnElement(linkSignUp);}
}
