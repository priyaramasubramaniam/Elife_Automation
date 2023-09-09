package PageComponent.B2B;

import Utilities.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;


public class B2BPartnerEAHPage {
      public static B2BPartnerEAHPage b2bPartnerEAHInstance;
      private B2BPartnerEAHPage(){}

      public static B2BPartnerEAHPage getInstance()
      {
            if(b2bPartnerEAHInstance == null)
            {
                  b2bPartnerEAHInstance = new B2BPartnerEAHPage();
            }
            return b2bPartnerEAHInstance;
      }

      @FindBy(xpath = "/html/body/div[3]/div[7]/div[2]/div/div[2]/div/ul/li[2]/a") private WebElement linkPartner;
      public void clickOnPartnerLink() throws InterruptedException {
            Utils.clickOnElement(linkPartner);
            Thread.sleep(3000);
      }
      @FindBy(xpath = "/html/body/div[3]/div[7]/div[2]/div/div[5]/div[1]/div[1]/input") private WebElement inputPartnerID;
      public void enterPartnerID(String partner_id)
      {
            Utils.setTextOnElement(inputPartnerID, partner_id);
      }
      @FindBy(xpath = "/html/body/div[3]/div[7]/div[2]/div/div[5]/div[1]/div[3]/button[1]") private WebElement btnSearch;
      public void clickOnSearchBtn() throws InterruptedException {
            Utils.clickOnElement(btnSearch);
            Thread.sleep(3000);
      }
      @FindBy(xpath = "//tr[@name='partner-page-list-row']//td[@name='elife-manager-admin']//i")
      private List<WebElement> textB2BManagerName;
      @FindBy(xpath = "//tr[@name='partner-page-list-row']//a")
      private List<WebElement> textB2BManagerEmail;
      @FindBy(xpath = "//tr[@name='partner-page-list-row']//td[@name='elife-manager-start-date']")
      private List<WebElement> textB2bManagerStartDate;
      @FindBy(xpath = "//tr[@name='partner-page-list-row']//td[@name='elife-manager-end-date']")
      private List<WebElement> textB2bManagerEndDate;

      public List<String> getB2BManagerDetails()
      {
            List<String> B2BManagerDetails = new ArrayList<>();
            for (int i = 0; i<=textB2BManagerName.size()-1; i++)
            {
                  B2BManagerDetails.add(textB2BManagerName.get(i).getText());
                  B2BManagerDetails.add(textB2BManagerEmail.get(i).getText());
                  B2BManagerDetails.add(textB2bManagerStartDate.get(i).getText());
                  B2BManagerDetails.add(textB2bManagerEndDate.get(i).getText());

            }
            System.out.println(B2BManagerDetails);
            return B2BManagerDetails;
      }

      @FindBy(xpath = "//tr[@name='partner-page-list-kam-row']//td[@name='kam-admin']//i") private List<WebElement> textB2BKAMName;
      @FindBy(xpath = "//tr[@name='partner-page-list-kam-row']//td[@name='kam-admin']//a") private List<WebElement> textB2BKAMEmail;
      @FindBy(xpath = "//tr[@name='partner-page-list-kam-row']//td[@name='kam-start-date']") private List<WebElement> textB2BKAMStartDate;
      @FindBy(xpath = "//tr[@name='partner-page-list-kam-row']//td[@name='kam-end-date']") private List<WebElement> textB2BKAMEndDate;

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
            System.out.println(B2BKAMDetails);
            return B2BKAMDetails;
      }

}
