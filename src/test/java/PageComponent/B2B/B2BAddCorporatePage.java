package PageComponent.B2B;

import Utilities.Utils;
import Web_Driver_Manager.DriverManager;
import com.beust.ah.A;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class B2BAddCorporatePage {
      public static B2BAddCorporatePage b2bAddCorporateInstance;
      private B2BAddCorporatePage(){}

      public static B2BAddCorporatePage getInstance()
      {
            if(b2bAddCorporateInstance == null)
            {
                  b2bAddCorporateInstance = new B2BAddCorporatePage();
            }
            return b2bAddCorporateInstance;
      }
      public boolean CheckAddCorpDisplayed(String text_Add_corp_header)
      {
            return DriverManager.getDriver().getPageSource().contains(text_Add_corp_header);
      }
      @FindBy(xpath = "/html/body/div[3]/div[8]/div/div/div/div/div/button") private WebElement btnSave;
      public void clickOnSaveBtn() throws InterruptedException {

            JavascriptExecutor jsExecutor = (JavascriptExecutor) DriverManager.getDriver();
            jsExecutor.executeScript("arguments[0].scrollIntoView(true);", btnSave);
            Thread.sleep(3000);
            btnSave.click();
            Thread.sleep(3000);
      }
      @FindBy(id = "corporate-name-error") private WebElement textErrorCorpName;
      public String getErrorCorpNameText(){
            return Utils.getWebElementText(textErrorCorpName);
      }
      @FindBy(id = "no-select-addr-warn") private WebElement textErrorCorpAddress;
      public String getErrorCorpAddressText() {
            return Utils.getWebElementText(textErrorCorpAddress);
      }
      @FindBy(id = "corporate-country-error") private WebElement textErrorCorpCountry;
      public String getErrorCorpCountryText(){
            return Utils.getWebElementText(textErrorCorpCountry);
      }
      @FindBy(id = "corporate-city-error") private WebElement textErrorCorpCity;
      public String getErrorCorpCity()
      {
            return Utils.getWebElementText(textErrorCorpCity);
      }
      @FindBy(id = "corporate-admin-name-error") private WebElement textErrorCorpAdminName;
      public String getErrorCorpAdminName()
      {
            return Utils.getWebElementText(textErrorCorpAdminName);
      }
      @FindBy(id = "corporate-admin-email-error") private WebElement textErrorCorpAdminEmail;
      public String getErrorCorpAdminEmail()
      {
            return Utils.getWebElementText(textErrorCorpAdminEmail);
      }
      @FindBy(id = "corporate-admin-country-code-error") private WebElement textErrorCorpAdminCountryCode;
      public String getErrorCorpCountryCode()
      {
            return Utils.getWebElementText(textErrorCorpAdminCountryCode);
      }
      @FindBy(id = "corporate-admin-contact-number-error") private WebElement textErrorCorpAdminMobileNumber;
      public String getErrorCorpAdminMobileNumber()
      {
            return Utils.getWebElementText(textErrorCorpAdminMobileNumber);
      }
      @FindBy(id = "corporate-admin-password-error") private WebElement textErrorCorpAdminPassword;
      public String getErrorCorpAdminPassword()
      {
            return Utils.getWebElementText(textErrorCorpAdminPassword);
      }
      @FindBy(id = "corporate-name-input") private WebElement inputCorpName;
      public void enterCorpName(String corp_name)
      {
            Utils.setTextOnElement(inputCorpName, corp_name);
      }
      @FindBy(xpath = "/html/body/div[3]/div[8]/div/div/div/div/div/div[1]/div[3]/form/div/div[1]/input") private WebElement inputCorpAddress;
      public void enterCorpAddress(String corp_address)
      {
            Utils.setTextOnElement(inputCorpAddress, corp_address);
      }
      @FindBy(xpath = "//div[@id='input--dropdowns']//tr[@id='item-0']") private WebElement ddCorpCompanyAddress;
      public void selectCorpCompanyAddressFromDD()
      {
            Utils.clickOnElement(ddCorpCompanyAddress);
      }
      @FindBy(xpath = "//*[@id=\"primary-name-input\"]") private WebElement inputCorpAdminName;
      public void enterCorpAdminName(String corp_admin_name)
      {
            Utils.setTextOnElement(inputCorpAdminName, corp_admin_name);
      }
      @FindBy(id = "primary-email-input") private WebElement inputCorpAdminEmail;
      public void enterCorpAdminEmail(String corp_admin_email)
      {
            Utils.setTextOnElement(inputCorpAdminEmail, corp_admin_email);
      }
      @FindBy(xpath = "/html/body/div[3]/div[8]/div/div/div/div/div/div[2]/div[4]/div/div[1]/input") private WebElement inputCountryCode;
      public void enterCorpCountryCode(String corp_country_code)
      {
            Utils.setTextOnElement(inputCountryCode, corp_country_code);
      }
      @FindBy(xpath = "/html/body/div[3]/div[8]/div/div/div/div/div/div[2]/div[4]/div/div[1]/div/div[1]") private WebElement ddCorpCountryCode;
      public void selectCorpCountryCodeFromDD() throws InterruptedException {
            JavascriptExecutor jsExecutor = (JavascriptExecutor) DriverManager.getDriver();
            jsExecutor.executeScript("arguments[0].scrollIntoView(true);", ddCorpCountryCode);
            Thread.sleep(3000);
            ddCorpCountryCode.click();
            Thread.sleep(3000);
      }
      @FindBy(id = "primary-cell-number") private WebElement inputCorpCellNumber;
      public void enterCorpCellNumber(String corp_cell_number)
      {
            Utils.setTextOnElement(inputCorpCellNumber, corp_cell_number);
      }
      @FindBy(xpath = "//*[@id=\"password-generator-btn\"]/button") private WebElement btnGeneratePassword;
      public void clickOnGeneratePassword()
      {
            Utils.clickOnElement(btnGeneratePassword);
      }
      @FindBy(xpath = "/html/body/div[3]/div[1]/strong") private WebElement textSuccessMessage;
      public String getSuccessMessage()
      {
            return Utils.getWebElementText(textSuccessMessage);
      }
      @FindBy(xpath = "/html/body/div[3]/div[1]/strong") private WebElement textErrorMessage;
      public String getErrorMessage()
      {
            return Utils.getWebElementText(textErrorMessage);
      }
      @FindBy(xpath = "/html/body/div[3]/div[8]/div/div/div/div/div/div[2]/div[3]/span[2]") private WebElement textErrorMsgEmail;
      public String getErrorMsgForEmail()
      {
            return Utils.getWebElementText(textErrorMsgEmail);
      }
      @FindBy(xpath = "//*[@id=\"corporate-admin-contact-number-validation-error\"]") private WebElement textErrorMsgNumber;
      public String getErrorMsgForNumber()
      {
           return Utils.getWebElementText(textErrorMsgNumber);
      }


}
