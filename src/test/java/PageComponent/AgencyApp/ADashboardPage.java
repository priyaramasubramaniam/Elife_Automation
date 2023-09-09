package PageComponent.AgencyApp;

import Utilities.Utils;
import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ADashboardPage {
      private static ADashboardPage ADashboardInstance;

      public ADashboardPage(){}

      public static ADashboardPage getInstance()
      {
            if(ADashboardInstance == null)
            {
                  ADashboardInstance = new ADashboardPage();
            }
            return ADashboardInstance;
      }
      @FindBy(id = "btn-book-ride") private WebElement btnBookARide;
      public void clickOnBookARideBtn() {
            Utils.clickOnElement(btnBookARide);}
      @FindBy(id = "agency-name") private WebElement textAgencyEmail;
      public String getAgencyEmail(){ return Utils.getWebElementText(textAgencyEmail);}
      @FindBy(id = "rides-container-menu") private WebElement linkAgencyRideSubMenu;
      public void clickOnAgencyRideSubmenu() { Utils.clickOnElement(linkAgencyRideSubMenu);}
      @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/ul/li[1]/a") private WebElement text;
      public String getText()
      {
           return Utils.getWebElementText(text);
      }
}
