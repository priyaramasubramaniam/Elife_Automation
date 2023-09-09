package PageComponent.CorporateApp;

import Web_Driver_Manager.DriverManager;
import io.cucumber.java.en_lol.WEN;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class CRidesPage {
      private static CRidesPage CRideInstance;

      public CRidesPage(){}

      public static CRidesPage getInstance()
      {
            if(CRideInstance == null)
            {
                  CRideInstance = new CRidesPage();
            }
            return CRideInstance;
      }

      @FindBy(xpath = "//input[@id='ride-id-filter-fld']") private WebElement inputRideID;
      public void enterRideID(String ride_id)
      {
            inputRideID.sendKeys(ride_id);
      }
      @FindBy(xpath = "//button[@id='search-act']//i[@class='fa fa-search mr-2']") private WebElement btnSearch;
      public void clickOnSearchBtn()
      {
            btnSearch.click();
      }
      @FindBy(xpath = "//strong[@id='order-num']//span") private WebElement linkRideId;
      public String getRideId(){ return  linkRideId.getText();}
      @FindBy(xpath = "//div[@id='ride-stat-6']") private WebElement textStatus;
      public String getRideStatus(){ return textStatus.getText();}
      @FindBy(xpath = "//div[@id='from-name']") private WebElement textFromLocation;
      public String getFromLocation(){ return textFromLocation.getText();}
      @FindBy(xpath = "//div[@id='to-name']") private WebElement textToLocation;
      public String getToLocation(){ return textToLocation.getText();}
      @FindBy(xpath = "//div[@id='booking-corporate']") private WebElement textCorpName;
      public String getCorpName(){ return textCorpName.getText();}
      @FindBy(xpath = "//div[@id='corporate-refer']") private WebElement textCorpRefName;
      public String getCorpRefName(){ return textCorpRefName.getText();}
      @FindBy(xpath = "//div[@id='agent-email']") private WebElement textEmployeeEmail;
      public String getEmployeeEmail(){ return textEmployeeEmail.getText();}
      @FindBy(xpath = "//div[@id='fund']") private WebElement textRideAmount;
      public String getRideAmount(){ return textRideAmount.getText();}

      @FindBy(xpath = "//strong[@id='order-num']") private List<WebElement> linkRideIDs;
      @FindBy(xpath = "//div[@id='ride-card-next-btn']") private WebElement paginationNextBtn;
      public void clickOnPaginationNextBtn()
      {
            JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
            js.executeScript("arguments[0].click();", paginationNextBtn);
      }

      public void getAllRideIds()
      {
            List<String> rideIDs = new ArrayList<>();
            boolean hasNextPage = true;
            while (hasNextPage)
            {
                  try {
                        for(WebElement rideId : linkRideIDs)
                        {
                              rideIDs.add(rideId.getText());
                              System.out.println(rideId.getText());
                        }
                        // Check if the "Next" button is present
                        boolean isNextButtonPresent = paginationNextBtn.isEnabled();
                        if (isNextButtonPresent) {
                              Thread.sleep(5000);
                              clickOnPaginationNextBtn();
                        } else {
                              // If the "Next" button is not present, exit the loop
                              hasNextPage = false;
                        }
                  } catch (NoSuchElementException e) {
                        // If the "Next" button is not found, exit the loop
                        hasNextPage = false;
                  } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                  }
            }
            System.out.println(rideIDs);
            System.out.println(rideIDs.size());
      }
}
