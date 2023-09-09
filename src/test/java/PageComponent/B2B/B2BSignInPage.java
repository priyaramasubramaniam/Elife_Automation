package PageComponent.B2B;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class B2BSignInPage {

      private static B2BSignInPage b2bsignInInstance;

      public B2BSignInPage(){}

      public static B2BSignInPage getInstance()
      {
            if(b2bsignInInstance == null)
            {
                  b2bsignInInstance = new B2BSignInPage();
            }
            return b2bsignInInstance;
      }


      @FindBy(id = "sign-in-email") private WebElement inputEmail;
      @FindBy(id = "sign-in-password") private WebElement inputPassword;
      @FindBy(id = "sign-in-act") private WebElement btnSignIn;

      public void enterInputEmail(String email) {
            inputEmail.sendKeys(email);
      }

      public void enterInputPassword(String password) {
            inputPassword.sendKeys(password);
      }

      public void clickBtnSignIn() {
            btnSignIn.click();
      }
}
