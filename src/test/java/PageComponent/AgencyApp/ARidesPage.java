package PageComponent.AgencyApp;

import Utilities.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ARidesPage {

      private static ARidesPage ARidesInstance;

      public ARidesPage(){}

      public static ARidesPage getInstance()
      {
            if(ARidesInstance == null)
            {
                  ARidesInstance = new ARidesPage();
            }
            return ARidesInstance;
      }


      @FindBy(xpath = "//*[@id=\"report-act\"]") private WebElement btnDownloadReport;
      public void clickOnDownloadReportBtn() {
            Utils.clickOnElement(btnDownloadReport);}



}
