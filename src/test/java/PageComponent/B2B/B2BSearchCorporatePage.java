package PageComponent.B2B;

import Utilities.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B2BSearchCorporatePage {
      private static B2BSearchCorporatePage b2bSearchCorporateInstance;
      private B2BSearchCorporatePage(){}
      public static B2BSearchCorporatePage getInstance()
      {
            if(b2bSearchCorporateInstance == null)
            {
                  b2bSearchCorporateInstance = new B2BSearchCorporatePage();
            }
            return b2bSearchCorporateInstance;
      }
      @FindBy(id = "the-corporate-id") private WebElement inputSearchCorporateId;
      public void enterSearchCorporateID(String corp_id)
      {
            Utils.setTextOnElement(inputSearchCorporateId, corp_id);
      }
      @FindBy(id = "corporate-name") private WebElement inputSearchCorporateName;
      public void enterSearchCorporateName(String corporate_name)
      {
            Utils.setTextOnElement(inputSearchCorpName, corporate_name);
      }
      @FindBy(xpath = "/html/body/div[3]/div[4]/div[1]/div/div[1]/div[2]/div[1]/div[6]/button") private WebElement btnSearchCorporate;
      public void clickOnSearchCorporateBtn()
      {
            Utils.clickOnElement(btnSearchCorporate);
      }
      @FindBy(xpath = "/html/body/div[3]/div[4]/div[1]/div/div[1]/div[2]/div[2]/div[1]/table/tbody/tr[1]/th/button") private WebElement linkCorporateID;
      public void clickOnCorporateId() { Utils.clickOnElement(linkCorporateID);}

      @FindBy(xpath = "//button[@id='add-corporate-act']") private WebElement btnAddCorp;
      public void clickOnBtnAddCorp() {
            Utils.clickOnElement(btnAddCorp);
      }
      @FindBy(xpath = "//div[@class='form-field']//input[@id='name-input']") private WebElement inputCorporateName;
      public void enterCorporateName(String corp_name){
            inputCorporateName.sendKeys(corp_name);
      }
      @FindBy(xpath = "/html/body/div[3]/div[4]/div[1]/div/div[2]/div[2]/div[2]/form/div/div[1]/input") private WebElement inputCorpAddress;
      public void enterInputCorpAddress(String corp_address) {
            inputCorpAddress.sendKeys(corp_address);
      }

      @FindBy(id = "corporate-name") private WebElement inputSearchCorpName;
      public void enterSearchCorpName(String corp_name){Utils.setTextOnElement(inputSearchCorpName, corp_name);}
      @FindBy(xpath = "/html/body/div[3]/div[4]/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/table/tbody/tr[1]")
      private WebElement DropdownCorpName;
      public void clickOnCorpName()
      {
            Utils.clickOnElement(DropdownCorpName);
      }

      @FindBy(xpath = "/html/body/div[3]/div[4]/div[1]/div/div[1]/div[2]/div[2]/div[1]/table/tbody/tr[1]/th/button")
      private WebElement textCorpId;
      public String getCorpID(){return Utils.getWebElementText(textCorpId);}
      @FindBy(xpath = "//*[@id=\"corporate-page-list-row-0\"]/td[1]") private WebElement textCorpName;
      public String getCorpName(){return Utils.getWebElementText(textCorpName);}
      @FindBy(xpath = "//*[@id=\"corporate-page-list-row-0\"]/td[2]") private WebElement textCorpAddress;
      public String getCorpAddress(){return Utils.getWebElementText(textCorpAddress);}
      @FindBy(xpath = "/html/body/div[3]/div[4]/div[1]/div/div[1]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[3]/i") private WebElement textCorpAdminName;
      public String getCorpAdminName(){ return Utils.getWebElementText(textCorpAdminName);}
      @FindBy(xpath = "/html/body/div[3]/div[4]/div[1]/div/div[1]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[3]/a") private WebElement textCorpAdminEmail;
      public String getCorpAdminEmail() {return  Utils.getWebElementText(textCorpAdminEmail);}
//      @FindBy(xpath = "/html/body/div[3]/div[4]/div[1]/div/div[1]/div[2]/div[2]/div[1]/table/tbody/tr[1]/td[3]") private WebElement textCorpAdminNumber;
//      public String getCorpAdminCellNumber()
//      {
//            StringBuilder sb = new StringBuilder();
//
//            for (char c : textCorpAdminNumber.getText().toCharArray()) {
//                  if (Character.isDigit(c)) {
//                        sb.append(c);
//                  }
//            }
//            return sb.toString();
//      }
      public List<String> getCorporateDetails()
      {
            List<String> corporateDetails = new ArrayList<>();
            corporateDetails.add(textCorpId.getText());
            corporateDetails.add(textCorpName.getText());
            corporateDetails.add(textCorpAddress.getText());
            corporateDetails.add(textCorpAdminName.getText());
            corporateDetails.add(textCorpAdminEmail.getText());
            System.out.println(corporateDetails);
            return corporateDetails;
      }
      @FindBy(xpath = "//tr[@name = 'corporate-page-list-row']//td[@name = 'corporate-name']")
      private List<WebElement> textCorporateNames;
      @FindBy(id = "corporate-page-list-next-btn") private WebElement btnNextPage;
      public List<String> getAllCorporateNames() throws InterruptedException {
            return Utils.getWebElementList(textCorporateNames, btnNextPage);
      }

}
