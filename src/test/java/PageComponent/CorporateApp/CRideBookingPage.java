package PageComponent.CorporateApp;

import io.cucumber.java.zh_cn.假如;
import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CRideBookingPage {
      private static CRideBookingPage CridebookingInstance;

      public CRideBookingPage(){}

      public static CRideBookingPage getInstance()
      {
            if(CridebookingInstance == null)
            {
                  CridebookingInstance = new CRideBookingPage();
            }
            return CridebookingInstance;
      }

      @FindBy(xpath = "This element is in iframe - //input[@id='from-place']")
      private WebElement inputFromLocation;
      @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div/div[1]/dl/dd/ul/li[1]")
      private WebElement textFromLocation;
      public void enterFromLocation(String from_location)
      {
            inputFromLocation.sendKeys(from_location);
            textFromLocation.click();
      }

      @FindBy(xpath = "//input[@id='to-place']")
      private WebElement inputToLocation;
      @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div/div[3]/dl/dd/ul/li[1]")
      private WebElement textToLocation;
      public void enterToLocation(String to_location)
      {
            inputToLocation.sendKeys(to_location);
            textToLocation.click();
      }

      @FindBy(xpath = "//input[@id='from-date']")
      private WebElement calenderFromDate;
      @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div/div[7]/div[1]/dl/dd/div/div/table/tbody/tr[8]/td[4]")
      private WebElement textFromDate;
      public void selectFromDate()
      {
            calenderFromDate.click();
            textFromDate.click();
      }
      @FindBy(xpath = "//input[@id='from-time']")
      private WebElement ddFromTime;
      @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div/div[7]/div[2]/dl/dd/div[1]/div/div[1]/div[1]/a[9]")
      private WebElement hourFromTime;
      @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div/div[7]/div[2]/dl/dd/div[1]/div/div[1]/div[2]/a[6]")
      private WebElement minuteFromTime;
      @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div/div[7]/div[2]/dl/dd/div[1]/div/div[2]/a[1]")
      private WebElement amFromTime;
      @FindBy(xpath = "//div[@id='from-time-dropdown']//a[@id='time-selector-confirm']")
      private WebElement fromTimeConfirm;
      public void selectFromTime()
      {
            ddFromTime.click();
            hourFromTime.click();
            minuteFromTime.click();
            amFromTime.click();
            fromTimeConfirm.click();
      }
      @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/a")
      private WebElement btnChooseVehicle;
      public void clickOnChooseVehicleBtn()
      {
            btnChooseVehicle.click();
      }
}
