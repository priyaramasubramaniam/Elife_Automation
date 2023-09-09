package PageComponent.AgencyApp;

import Utilities.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ASignUpPage {
      private static ASignUpPage ASignUpInstance;

      public ASignUpPage(){}

      public static ASignUpPage getInstance()
      {
            if(ASignUpInstance == null)
            {
                  ASignUpInstance = new ASignUpPage();
            }
            return ASignUpInstance;
      }
      @FindBy(xpath = "//div[@id='agency-name-box']//input[@id='input-']") private WebElement inputAgencyName;
      public void enterAgencyName(String agency_name){
            Utils.setTextOnElement(inputAgencyName, agency_name);
      }
      @FindBy(xpath = "//div[@id='agency-addr-box']//input[@id='input-']") private WebElement inputAgencyAddress;
      public void enterAgencyAddress(String agency_address){
            Utils.setTextOnElement(inputAgencyAddress, agency_address);
      }
      @FindBy(xpath = "/html/body/div[2]/div[4]/div[1]/div/div[2]/div/div/div/div[4]/div[1]/div/div/div[1]/div[4]/form/div[2]/table/tbody/tr[4]")
      private WebElement textAgencyAddress;
      public void clickOnAgencyAddress(){Utils.clickOnElement(textAgencyAddress);}
      @FindBy(xpath = "//div[@id='user-name-box']//input[@id='input-']") private WebElement inputCompanyRepresentative;
      public void enterCompanyRep(String company_rep){ Utils.setTextOnElement(inputCompanyRepresentative, company_rep);}
      @FindBy(xpath = "//input[@id='cell-country']") private WebElement inputCountryCode;
      public void enterCountryCode(String agency_countrycode){ Utils.setTextOnElement(inputCountryCode, agency_countrycode);}
      @FindBy(xpath = "//div[@id='cell-country-dropdowns']//div[@id='item-0']") private WebElement DDAgencyCountryCode;
      public void selectCountryCodeFromDD(){Utils.clickOnElement(DDAgencyCountryCode);}
      @FindBy(xpath = "//input[@id='cell-num-box']") private WebElement inputCellNumber;
      public void enterCellNumber(String agency_cellnumber){ Utils.setTextOnElement(inputCellNumber, agency_cellnumber);}
      @FindBy(xpath = "//div[@id='account-eml-box']//input[@id='input-']") private WebElement inputAgencyEmail;
      public void enterEmail(String agency_email){Utils.setTextOnElement(inputAgencyEmail, agency_email);}
      @FindBy(xpath = "//span[@id='eml-verify-code-send']") private WebElement btnGetCode;
      public void clickOnGetCodeBtn(){Utils.clickOnElement(btnGetCode);}
      @FindBy(xpath = "//div[@id='pwd-box']//input[@id='input-']") private WebElement inputAgencyPassword;
      public void enterAGencyPassword(String agency_password){ Utils.setTextOnElement(inputAgencyPassword, agency_password);}
      @FindBy(xpath = "//div[@id='signup-finish']") private WebElement btnSignUp;
      public void clickOnSignUpBtn(){Utils.clickOnElement(btnSignUp);}


}
