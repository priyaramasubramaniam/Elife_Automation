package PageComponent.B2B;

import Utilities.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class B2BSearchPartnerPage {
      private static B2BSearchPartnerPage b2bSearchPartnerInstance;
      private B2BSearchPartnerPage(){}
      public static B2BSearchPartnerPage getInstance()
      {
            if(b2bSearchPartnerInstance == null)
            {
                  b2bSearchPartnerInstance = new B2BSearchPartnerPage();
            }
            return b2bSearchPartnerInstance;
      }
      @FindBy(id = "the-partner-id") private WebElement inputPartnerId;
      public void enterPartnerId(String partner_id)
      {
            Utils.setTextOnElement(inputPartnerId, partner_id);
      }
      @FindBy(id = "partner-name") private WebElement inputPartnerName;
      public void enterPartnerName(String partner_name) {Utils.setTextOnElement(inputPartnerName, partner_name);}
      @FindBy(xpath = "/html/body/div[3]/div[6]/div[1]/div/div[1]/div[1]/button") private WebElement btnSearch;
      public void clickOnSearchBtn() { Utils.clickOnElement(btnSearch);}
      @FindBy(xpath = "/html/body/div[3]/div[6]/div[1]/div/div[1]/div[2]/table/tbody/tr[1]/th/button") private WebElement textPartnerID;
      public void clickOnPartnerId()
      {
            Utils.clickOnElement(textPartnerID);
      }
      @FindBy(xpath = "//tr[@name = 'partners-page-list-row']//td[@name = 'partner-name']") private List<WebElement> textPartnersNames;
      @FindBy(id = "partners-page-list-next-btn") private WebElement btnNextPage;

      public List<String> getAllPartnerNames() throws InterruptedException {
           return Utils.getWebElementList(textPartnersNames, btnNextPage);
      }
}
