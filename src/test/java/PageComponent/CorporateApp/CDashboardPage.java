package PageComponent.CorporateApp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CDashboardPage {

      private static CDashboardPage CdashboardInstance;

      public CDashboardPage(){}

      public static CDashboardPage getInstance()
      {
            if(CdashboardInstance == null)
            {
                  CdashboardInstance = new CDashboardPage();
            }
            return CdashboardInstance;
      }
      @FindBy(xpath = "//li[@id='dashboard-container-menu']")
      private WebElement linkDashboard;
      public boolean getDashboardLinkText(){return linkDashboard.isDisplayed();}
      public void clickOnDashboardLink(){linkDashboard.click();}

      @FindBy(xpath = "//li[@id='rides-container-menu']")
      private WebElement linkRides;
      public boolean getRidesLinkText(){return linkRides.isDisplayed();}
      public void clickOnRidesMenu(){ linkRides.click();}

      @FindBy(xpath = "//span[@id='employee-lbl']")
      private WebElement linkEmployee;
      public boolean getEmployeeLinkText(){return linkEmployee.isDisplayed();}

      @FindBy(xpath = "//li[@id='setting-container-menu']")
      private WebElement linkSettings;
      public boolean getSettingsLinkText(){return linkSettings.isDisplayed();}

      @FindBy(xpath = "//div[@id='last-month-btn']") private WebElement linkLastMonth;
      public void clickOnLastMonthLink(){linkLastMonth.click();}
      @FindBy(xpath = "//div[@id='current-month-btn']") private WebElement linkCurrentMonth;
      public void clickOnCurrentMonthLink(){linkCurrentMonth.click();}
      @FindBy(xpath = "//div[@id='next-month-btn']") private WebElement linkNextMonth;
      public void clickOnNextMonthLink(){linkNextMonth.click();}

      @FindBy(xpath = "//div[@id='custom-date-btn']") private WebElement linkCustomMonth;
      @FindBy(xpath = "//input[@id='from-start-custom']") private WebElement inputFromStartDate;
      @FindBy(xpath = "//input[@id='from-end-custom']") private WebElement inputToStartDate;
      public void clickOnCustomDateLink()
      {
            linkCustomMonth.click();
      }
      public void enterCustomDates()
      {
            inputFromStartDate.sendKeys("01/07/2023");
            inputToStartDate.sendKeys("31/07/2023");
      }
      @FindBy(xpath = "//span[@id='paid-rides-label']") private WebElement textPaidRides;
      public boolean getPaidRideText(){return textPaidRides.isDisplayed();}

      @FindBy(xpath = "//span[@id='unpaid-rides-label']")
      private WebElement textUnpaidRides;
      public boolean getUnpaidRideText(){return textUnpaidRides.isDisplayed();}

      @FindBy(xpath = "//span[@id='cancelled-rides-label']")
      private WebElement textCancelledRides;
      public boolean getCancelledRideText(){return textCancelledRides.isDisplayed();}

}
