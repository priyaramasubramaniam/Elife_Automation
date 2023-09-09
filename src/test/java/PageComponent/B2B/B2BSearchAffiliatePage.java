package PageComponent.B2B;

import Utilities.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class B2BSearchAffiliatePage {
      private static B2BSearchAffiliatePage b2bAffiliateInstance;
      private B2BSearchAffiliatePage(){}
      public static B2BSearchAffiliatePage getInstance()
      {
            if(b2bAffiliateInstance == null)
            {
                  b2bAffiliateInstance = new B2BSearchAffiliatePage();
            }
            return b2bAffiliateInstance;
      }

      @FindBy(id = "affiliate-name") private WebElement inputAffiliateName;
      public void enterAffiliateName(String affiliate_name){
            Utils.setTextOnElement(inputAffiliateName, affiliate_name);}
      @FindBy(xpath = "/html/body/div[3]/div[3]/div[1]/div/div[1]/div[1]/button") private WebElement btnSearch;
      public void clickOnSearchBtn(){ Utils.clickOnElement(btnSearch);}

      @FindBy(xpath = "//tr[@name = 'affiliates-page-list-row']//td[@name = 'affiliate-name']")
      private List<WebElement> textAffiliateNames;
      @FindBy(id = "affiliate-page-list-next-btn") private WebElement btnNextPage;

      public List<String> getAllAffiliateNames() throws InterruptedException {
            return Utils.getWebElementList(textAffiliateNames, btnNextPage);
      }
 }
