package PageComponent.B2B;

import Utilities.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class B2BCorporateEAHPage {
      public static B2BCorporateEAHPage b2bCorporateEAHInstance;
      private B2BCorporateEAHPage(){}

      public static B2BCorporateEAHPage getInstance()
      {
            if(b2bCorporateEAHInstance == null)
            {
                  b2bCorporateEAHInstance = new B2BCorporateEAHPage();
            }
            return b2bCorporateEAHInstance;
      }

      @FindBy(id = "corporate-employee-assignment") private WebElement linkCorporate;
      public void clickOnCorporateLink(){
            Utils.clickOnElement(linkCorporate);
      }
      @FindBy(xpath = "/html/body/div[3]/div[7]/div[2]/div/div[6]/div[1]/div[1]/input") private WebElement inputCorporateId;
      public void enterCorporateID(String corporate_id) throws InterruptedException {
            Utils.setTextOnElement(inputCorporateId, corporate_id);
            Thread.sleep(3000);
      }
      @FindBy(id = "corporate-elife-manager-search-act") private WebElement btnSearch;
      public void clickOnSearchBtn()
      {
            Utils.clickOnElement(btnSearch);
      }

      @FindBy(xpath = "//tr[@name='corporate-page-list-row']//td[@name='elife-manager-admin']//i") private List<WebElement> textB2BManagerName;
      @FindBy(xpath = "//tr[@name='corporate-page-list-row']//td[@name='elife-manager-admin']//a") private List<WebElement> textB2bManagerEmail;
      @FindBy(xpath = "//tr[@name='corporate-page-list-row']//td[@name='elife-manager-start-date']") private List<WebElement> textB2BManagerStartDate;
      @FindBy(xpath = "//tr[@name='corporate-page-list-row']//td[@name='elife-manager-end-date']") private List<WebElement> textB2BManagerEndDate;
      public List<String> getB2BManagerDetails()
      {
            List<String> B2BManagerDetails = new ArrayList<>();
            for (int i = 0; i<=textB2BManagerName.size()-1; i++)
            {
                  B2BManagerDetails.add(textB2BManagerName.get(i).getText());
                  B2BManagerDetails.add(textB2bManagerEmail.get(i).getText());
                  B2BManagerDetails.add(textB2BManagerStartDate.get(i).getText());
                  B2BManagerDetails.add(textB2BManagerEndDate.get(i).getText());

            }
            System.out.println(B2BManagerDetails);
            return B2BManagerDetails;
      }

      @FindBy(xpath = "//tr[@name='corporate-page-list-kam-row']//td[@name='kam-admin']//i") private List<WebElement> textB2BKAMName;
      @FindBy(xpath = "//tr[@name='corporate-page-list-kam-row']//td[@name='kam-admin']//a") private List<WebElement> textB2BKAMEmail;
      @FindBy(xpath = "//tr[@name='corporate-page-list-kam-row']//td[@name='kam-start-date']") private List<WebElement> textB2BKAMStartDate;
      @FindBy(xpath = "//tr[@name='corporate-page-list-kam-row']//td[@name='kam-end-date']") private List<WebElement> textB2BKAMEndDate;

      public List<String> getB2BKAMDetails()
      {
            List<String> B2BKAMDetails = new ArrayList<>();
            for (int i=0; i<=textB2BKAMName.size()-1; i++)
            {
                  B2BKAMDetails.add(textB2BKAMName.get(i).getText());
                  B2BKAMDetails.add(textB2BKAMEmail.get(i).getText());
                  B2BKAMDetails.add(textB2BKAMStartDate.get(i).getText());
                  B2BKAMDetails.add(textB2BKAMEndDate.get(i).getText());
            }
            return B2BKAMDetails;
      }
}
