package PageComponent.Backoffice;

import PageComponent.B2B.B2BAgencyEAHPage;
import Utilities.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BackOfficeNavBarPage {
      public static BackOfficeNavBarPage backOfficeNavbarInstance;
      private BackOfficeNavBarPage(){}

      public static BackOfficeNavBarPage getInstance()
      {
            if(backOfficeNavbarInstance == null)
            {
                  backOfficeNavbarInstance = new BackOfficeNavBarPage();
            }
            return backOfficeNavbarInstance;
      }
      @FindBy(xpath = "//*[@id=\"new-act\"]/span[1]") private WebElement linkCreateNewRide;
      public void clickOnCreateNewRideLink() {
            Utils.clickOnElement(linkCreateNewRide);
      }
}
