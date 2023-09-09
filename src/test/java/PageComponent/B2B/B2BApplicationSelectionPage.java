package PageComponent.B2B;

import Utilities.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class B2BApplicationSelectionPage {

      public static B2BApplicationSelectionPage b2bapplicationSelectionInstance;
      private B2BApplicationSelectionPage(){}

      public static B2BApplicationSelectionPage getInstance()
      {
            if(b2bapplicationSelectionInstance == null)
            {
                  b2bapplicationSelectionInstance = new B2BApplicationSelectionPage();
            }
            return b2bapplicationSelectionInstance;
      }

      @FindBy(id = "back-office") private WebElement linkBackoffice;
      public void clickOnBackofficeLink() { Utils.clickOnElement(linkBackoffice);}
      @FindBy(xpath = "/html/body/div[2]/div[1]/div/div[3]/div[1]/div[2]/ul[1]/li[4]")
      private WebElement linkB2B;

      public void clickLinkB2B() throws InterruptedException {
            Utils.clickOnElement(linkB2B);
      }
}
