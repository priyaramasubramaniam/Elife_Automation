package PageComponent.AffiliateApp;

import PageComponent.CorporateApp.CSignInPage;
import Utilities.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.rmi.CORBA.Util;

import static Utilities.Utils.checkIfElementIsDisplayed;

public class AFSignInPage {

      private static AFSignInPage AFSignInInstance;

      public AFSignInPage(){}

      public static AFSignInPage getInstance()
      {
            if(AFSignInInstance == null)
            {
                  AFSignInInstance = new AFSignInPage();
            }
            return AFSignInInstance;
      }
      @FindBy(xpath = "//a[@id='sign-in-forgot-btn']") private WebElement linkForgotPassword;
      public void clickOnForgotPasswordLink(){
            Utils.clickOnElement(linkForgotPassword);
      }
      public boolean isForgotPasswordDisplayed(){ return Utils.checkIfElementIsDisplayed(linkForgotPassword);}
}
