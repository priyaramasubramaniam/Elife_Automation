package PageComponent.B2B;

import Utilities.Utils;
import Web_Driver_Manager.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class B2BSearchAgencyPage {
      private static B2BSearchAgencyPage b2bSearchAgencyInstance;
      private B2BSearchAgencyPage(){}
      public static B2BSearchAgencyPage getInstance()
      {
            if(b2bSearchAgencyInstance == null)
            {
                  b2bSearchAgencyInstance = new B2BSearchAgencyPage();
            }
            return b2bSearchAgencyInstance;
      }

      @FindBy(id = "agency-name") private WebElement inputAgencyName;
      @FindBy(xpath = "//body[1]/div[3]/div[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr") private List<WebElement> DDAgencyNames;
      @FindBy(xpath = "/html/body/div[3]/div[5]/div[1]/div/div[1]/div[1]/div[2]/div/table/tbody/tr[7]") private WebElement downArrow;

      public void enterAgencyName(String agency_name){Utils.setTextOnElement(inputAgencyName, agency_name);}
      @FindBy(xpath = "/html/body/div[3]/div[5]/div[1]/div/div[1]/div[1]/div[7]/button") private WebElement btnSearch;
      public void clickOnSearchBtn(){ Utils.clickOnElement(btnSearch);}
      @FindBy(xpath = "//tr[@name = 'agency-page-list-row']//td[@name = 'agency-name']") private List<WebElement> textAgencyNames;
      @FindBy(id = "agency-page-list-next-btn") private WebElement btnNextPage;

      public List<String> getAllAgencyNames() throws InterruptedException {
             return Utils.getWebElementList(textAgencyNames, btnNextPage);
      }
      @FindBy(xpath = "/html/body/div[3]/div[5]/div[1]/div/div[1]/div[2]/table/tbody/tr[1]/th/button") private WebElement linkAgencyId;
      public void clickOnAgencyId() {Utils.clickOnElement(linkAgencyId);}

}
