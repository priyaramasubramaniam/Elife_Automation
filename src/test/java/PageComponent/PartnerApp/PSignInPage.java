package PageComponent.PartnerApp;

import Utilities.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PSignInPage {

      private static PSignInPage PSignInInstance;

      public PSignInPage(){}

      public static PSignInPage getInstance()
      {
            if(PSignInInstance == null)
            {
                  PSignInInstance = new PSignInPage();
            }
            return PSignInInstance;
      }
      @FindBy(xpath = "//a[@id='sign-in-forgot-btn']") private WebElement linkForgotPassword;
      public void clickOnForgotPasswordLink(){
            Utils.clickOnElement(linkForgotPassword);
      }
      public boolean isForgotPasswordDisplayed(){ return Utils.checkIfElementIsDisplayed(linkForgotPassword);}
}
