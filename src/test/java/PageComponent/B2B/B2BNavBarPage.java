package PageComponent.B2B;

import Utilities.Utils;
import Web_Driver_Manager.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.rmi.CORBA.Util;

public class B2BNavBarPage {
      private static B2BNavBarPage b2bnavBarInstance;
      private B2BNavBarPage(){}
      public static B2BNavBarPage getInstance()
      {
            if(b2bnavBarInstance == null)
            {
                  b2bnavBarInstance = new B2BNavBarPage();
            }
            return b2bnavBarInstance;
      }

      @FindBy(id = "agency-search-act") private WebElement linkSearchAgency;
      public void clickOnSearchAgencyLink(){ Utils.clickOnElement(linkSearchAgency);}

      @FindBy(id = "partners-search-act") private WebElement linkSearchPartners;
      public void clickOnSearchPartnersLink(){ Utils.clickOnElement(linkSearchPartners);}
      @FindBy(id = "affiliates-search-act") private WebElement linkSearchAffiliate;
      public void clickOnSearchAffiliateLink(){ Utils.clickOnElement(linkSearchAffiliate);}
      @FindBy(id = "corporates-search-act") private WebElement linkSearchCorporates;
      public void clickOnSearchCorporateLink() throws InterruptedException {
            JavascriptExecutor jsExecutor = (JavascriptExecutor) DriverManager.getDriver();
            jsExecutor.executeScript("arguments[0].scrollIntoView(true);", linkSearchCorporates);
            Thread.sleep(3000);
            linkSearchCorporates.click();
            Thread.sleep(3000);
      }

      @FindBy(id = "navbarDropdown") private WebElement dropdownReportsLink;
      public void clickOnReportsLinkDD()
      {
            Utils.clickOnElement(dropdownReportsLink);
      }
      @FindBy(id = "employee-assignment-act") private WebElement linkEmployeeAssignmentHistory;
      public void clickOnEAHLink()
      {
            Utils.clickOnElement(linkEmployeeAssignmentHistory);
      }

      @FindBy(id = "employee-report-act") private WebElement linkEmployeeReport;
      public void clickOnEmployeeReportLink(){ Utils.clickOnElement(linkEmployeeReport);}
}
