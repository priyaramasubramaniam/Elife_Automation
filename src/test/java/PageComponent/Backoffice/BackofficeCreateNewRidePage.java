package PageComponent.Backoffice;

import PageComponent.B2B.B2BAgencyEAHPage;
import Utilities.Utils;
import Web_Driver_Manager.DriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.nio.file.Watchable;

public class BackofficeCreateNewRidePage {
      public static BackofficeCreateNewRidePage backofficeCreateNewRideInstance;
      private BackofficeCreateNewRidePage(){}

      public static BackofficeCreateNewRidePage getInstance()
      {
            if(backofficeCreateNewRideInstance == null)
            {
                  backofficeCreateNewRideInstance = new BackofficeCreateNewRidePage();
            }
            return backofficeCreateNewRideInstance;
      }

      @FindBy(id = "ride-detail-partners-input") private WebElement inputPartnerName;
      public void enterPartnerName(String partner_name) {Utils.setTextOnElement(inputPartnerName, partner_name);}
      @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/form/div[4]/div[1]/div[1]/div[1]/div/div[2]/table/tbody/tr[1]")
      private WebElement dropdownPartnerName;
      public void clickOnPartnerNameDD(){ Utils.clickOnElement(dropdownPartnerName);}
      @FindBy(id = "ride-detail-partner-ref") private WebElement inputRideReference;
      public void enterRideReference(String ref_name) { Utils.setTextOnElement(inputRideReference, ref_name);}
      @FindBy(id = "ride-detail-amount") private WebElement inputRideAmount;
      public void enterRideAmount(String ride_amount){ Utils.setTextOnElement(inputRideAmount, ride_amount);}
      @FindBy(id = "ride-detail-from-place") private WebElement inputPickupLocation;
      public void enterPickupLocation(String pickup_location) { Utils.setTextOnElement(inputPickupLocation, pickup_location);}
      @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/form/div[5]/div[1]/div[1]/div[1]/table/tbody/tr[1]") private WebElement ddPickuplocation;
      public void clickOnPickupLocationDD() throws InterruptedException {
            JavascriptExecutor jsExecutor = (JavascriptExecutor) DriverManager.getDriver();
            jsExecutor.executeScript("arguments[0].scrollIntoView(true);", ddPickuplocation);
            Thread.sleep(3000);
            Utils.clickOnElement(ddPickuplocation);}
      @FindBy(id = "ride-detail-from-date") private WebElement inputFromDate;
      public void enterFromDate(String from_date) { Utils.setTextOnElement(inputFromDate, from_date);}
      @FindBy(id = "ride-detail-from-hour") private WebElement inputFromHour;
      public void enterFromHour(String from_hour){ Utils.setTextOnElement(inputFromHour, from_hour);}
      @FindBy(id = "ride-detail-from-minute") private WebElement inputFromMinute;
      public void enterFromMinute(String from_minute) { Utils.setTextOnElement(inputFromMinute, from_minute);}
      @FindBy(id = "ride-detail-to-place") private WebElement inputDropoffLocation;
      public void enterDropoffLocation(String dropoff_location){ Utils.setTextOnElement(inputDropoffLocation, dropoff_location);};
      @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/form/div[5]/div[3]/div[1]/div[1]/table/tbody/tr[1]") private WebElement ddDropoffLocation;
      public void selectDropofflocationDD(){ Utils.clickOnElement(ddDropoffLocation);}
      @FindBy(id = "ride-detail-passenger-count") private WebElement inputPassengerCount;
      public void enterPassengerCount(String passenger_count) { Utils.setTextOnElement(inputPassengerCount, passenger_count);}
      @FindBy(xpath = "//*[@id=\"menu\"]") private WebElement ddVehicle;
      public void clickOnVehicleDD(){ Utils.clickOnElement(ddVehicle);}
      @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/form/div[6]/div/div[2]/div/div[2]/div/div[1]/div[2]/button[2]") private WebElement textVehicleName;
      public void clickOnVehicleName() {Utils.clickOnElement(textVehicleName);}
      @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/form/div[6]/div/div[2]/div/div[2]/div/div[1]/div[3]/button[2]") private WebElement textVehicleSedan;
      public void clickOnVehicleSedan(){ Utils.clickOnElement(textVehicleSedan);}
      @FindBy(id = "ride-detail-name-first") private WebElement inputFirstName;
      public void enterFirstname(String first_name) { Utils.setTextOnElement(inputFirstName, first_name);}
      @FindBy(id = "ride-detail-name-last") private WebElement inputLastName;
      public void enterLastname(String last_name) { Utils.setTextOnElement(inputLastName, last_name);}
      @FindBy(id = "ride-detail-customer-email") private WebElement inputEmail;
      public void enterEmail(String  email) {Utils.setTextOnElement(inputEmail, email);}
      @FindBy(id = "ride-detail-customer-number") private WebElement inputMobileNumber;
      public void enterMobileNumber(String mobile_number){ Utils.setTextOnElement(inputEmail, mobile_number);}
      @FindBy(id = "ride-detail-customer-create-btn") private WebElement btnSaveCustomer;
      public void clickOnSaveCustomerBtn() {Utils.clickOnElement(btnSaveCustomer);}
      @FindBy(id = "ride-detail-save-btn") private WebElement btnSave;
      public void clickOnSaveBtn() {Utils.clickOnElement(btnSave);}
      @FindBy(id = "ride-detail-id") private WebElement textRideId;
      public String getRideID(){return Utils.getWebElementText(textRideId);}



}
