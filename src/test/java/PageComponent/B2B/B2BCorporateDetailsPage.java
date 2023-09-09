package PageComponent.B2B;

import Utilities.Utils;
import Web_Driver_Manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.rmi.CORBA.Util;
import java.util.ArrayList;
import java.util.List;

public class B2BCorporateDetailsPage {
      public static B2BCorporateDetailsPage b2bCorpDetailsInstance;
      private B2BCorporateDetailsPage(){}

      public static B2BCorporateDetailsPage getInstance()
      {
            if(b2bCorpDetailsInstance == null)
            {
                  b2bCorpDetailsInstance = new B2BCorporateDetailsPage();
            }
            return b2bCorpDetailsInstance;
      }

      @FindBy(xpath = "//*[@id=\"corp-info\"]") private WebElement linkCorpDetails;
      public void clickOnCorpDetailsLink() {
            Utils.clickOnElement(linkCorpDetails);}

      public boolean checkPageContainsCorpName(String corp_name)
      {
            return DriverManager.getDriver().getPageSource().contains(corp_name);
      }
      @FindBy(id = "details-corporate-id") private WebElement textCorpId;
      public String getCorpId()
      {
            return Utils.getWebElementText(textCorpId);
      }
      @FindBy(id = "details-corporate-name-label") private WebElement textCorpName;
      public String getCorpName()
      {
            return Utils.getWebElementText(textCorpName);
      }
      @FindBy(id = "details-corporate-address") private WebElement textCorporateAddress;
      public String getCorporateAddress()
      {
            return Utils.getWebElementText(textCorporateAddress);
      }
      @FindBy(id = "details-corporate-admin-name") private WebElement textCorporateAdminName;
      public String getCorporateAdminName()
      {
            return Utils.getWebElementText(textCorporateAdminName);
      }
      @FindBy(id = "details-corporate-admin-email") private WebElement textCorporateAdminEmail;
      public String getCorporateAdminEmail()
      {
            return Utils.getWebElementText(textCorporateAdminEmail);
      }
      @FindBy(id = "details-corporate-admin-cellphone") private WebElement textCorporateAdminNumber;
      public String getCorporateAdminNumber()
      {
            return Utils.getWebElementText(textCorporateAdminNumber);
      }
      public List<String> getCorporateDetails()
      {
            List<String> corporateDetails = new ArrayList<>();
            corporateDetails.add(textCorpId.getText());
            corporateDetails.add(textCorpName.getText());
            corporateDetails.add(textCorporateAddress.getText());
            corporateDetails.add(textCorporateAdminName.getText());
            corporateDetails.add(textCorporateAdminEmail.getText());
            return corporateDetails;
      }
      @FindBy(xpath = "//*[@id=\"employee-attachment-container\"]/div[2]/div/div/button") private WebElement ddCorporateEmployee;
      public void clickOnCorporateEmployeeDD()
      {
            Utils.clickOnElement(ddCorporateEmployee);
      }
      @FindBy(xpath = "//*[@id=\"employee-attachment-container\"]/div[2]/div/div/div/div[1]/input") private WebElement inputCorporateEmployee;
      public void enterCorporateEmpEmail(String corp_emp_email)
      {
            Utils.setTextOnElement(inputCorporateEmployee, corp_emp_email);
      }
      @FindBy(xpath = "/html/body/div[3]/div[4]/div[2]/div[1]/div[4]/div[2]/div/div[5]/div/div/div[2]/div/div/div[1]/div/div[2]/div/div/div/div[2]/ul/li/a")
      private WebElement textCorpEmployeeEmail;
      public void clickOnCorpEmpEmail()
      {
            Utils.clickOnElement(textCorpEmployeeEmail);
      }
      @FindBy(xpath = "/html/body/div[3]/div[4]/div[2]/div[1]/div[4]/div[2]/div/div[5]/div/div/div[2]/div/div/div[1]/div/div[3]/div/input") private WebElement calStartDate;
      public void clickOnStartDateCal()
      {
            Utils.clickOnElement(calStartDate);
      }
      @FindBy(xpath = "/html/body/div[3]/div[4]/div[2]/div[1]/div[4]/div[2]/div/div[5]/div/div/div[2]/div/div/div[1]/div/div[3]/div/div/div/table/tbody/tr[6]/td[2]")
      private WebElement textStartDate;
      public void clickOnStartDate()
      {
            Utils.clickOnElement(textStartDate);
      }
      @FindBy(xpath = "//*[@id=\"attach-employee-to-ag\"]") private WebElement btnSaveEmployee;
      public void clickOnSaveEmployeeBtn()
      {
            Utils.clickOnElement(btnSaveEmployee);
      }
      @FindBy(xpath = "/html/body/div[3]/div[1]/strong") private WebElement textSuccessMsg;
      public String getSuccessMsg()
      {
            return Utils.getWebElementText(textSuccessMsg);
      }
      @FindBy(xpath = "//*[@id=\"lead-attachment-container\"]/div[2]/div/div/button") private WebElement ddCorpLead;
      public void clickOnDDCorpLead()
      {
            Utils.clickOnElement(ddCorpLead);
      }
      @FindBy(xpath = "//*[@id=\"lead-attachment-container\"]/div[2]/div/div/div/div[1]/input") private WebElement inputCorpLeadEmail;
      public void enterCorpLeadEmail(String corp_lead_email)
      {
            Utils.setTextOnElement(inputCorpLeadEmail, corp_lead_email);
      }
      @FindBy(xpath = "/html/body/div[3]/div[4]/div[2]/div[1]/div[4]/div[2]/div/div[5]/div/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div[2]/ul/li/a")
      private WebElement textCorpLeadEmail;
      public void clickOnCorpLeadEmail()
      {
            Utils.clickOnElement(textCorpLeadEmail);
      }
      @FindBy(xpath = "/html/body/div[3]/div[4]/div[2]/div[1]/div[4]/div[2]/div/div[5]/div/div/div[2]/div/div/div[2]/div/div[3]/div/input")
      private WebElement calStartDateLead;
      public void clickOnLeadStartDate()
      {
            Utils.clickOnElement(calStartDateLead);
      }
      @FindBy(xpath = "/html/body/div[3]/div[4]/div[2]/div[1]/div[4]/div[2]/div/div[5]/div/div/div[2]/div/div/div[2]/div/div[3]/div/div/div/table/tbody/tr[6]/td[3]")
      private WebElement textStartDateLead;
      public void clickOnLeadStartDateText()
      {
            Utils.clickOnElement(textStartDateLead);
      }
      @FindBy(xpath = "/html/body/div[3]/div[4]/div[2]/div[1]/div[4]/div[2]/div/div[5]/div/div/div[2]/div/div/div[2]/div/div[4]/button")
      private WebElement btnSaveLead;
      public void clickOnLeadSaveBtn()
      {
            Utils.clickOnElement(btnSaveLead);
      }
      @FindBy(xpath = "//*[@id=\"kam-attachment-container\"]/div[2]/div/div/button") private WebElement ddCorporateKam;
      public void clickOnDDCorporateKAM()
      {
            Utils.clickOnElement(ddCorporateKam);
      }
      @FindBy(xpath = "//*[@id=\"kam-attachment-container\"]/div[2]/div/div/div/div[1]/input") private WebElement inputCorporateKamEmail;
      public void enterCorpKamEmail(String corp_kam_email)
      {
            Utils.setTextOnElement(inputCorporateKamEmail, corp_kam_email);
      }
      @FindBy(xpath = "/html/body/div[3]/div[4]/div[2]/div[1]/div[4]/div[2]/div/div[5]/div/div/div[2]/div/div/div[3]/div/div[2]/div/div/div/div[2]/ul/li/a")
      private WebElement textCorpKamEmail;
      public void clickOnCorpKamEmailText()
      {
            Utils.clickOnElement(textCorpKamEmail);
      }
      @FindBy(xpath = "/html/body/div[3]/div[4]/div[2]/div[1]/div[4]/div[2]/div/div[5]/div/div/div[2]/div/div/div[3]/div/div[3]/div/input")
      private WebElement calStartDateKAM;
      public void clickOnStartDateKamCal()
      {
            Utils.clickOnElement(calStartDateKAM);
      }
      @FindBy(xpath = "/html/body/div[3]/div[4]/div[2]/div[1]/div[4]/div[2]/div/div[5]/div/div/div[2]/div/div/div[3]/div/div[3]/div/div/div/table/tbody/tr[6]/td[4]")
      private WebElement textStartDateKam;
      public void clickOnStartDateKamText()
      {
            Utils.clickOnElement(textStartDateKam);
      }
      @FindBy(xpath = "/html/body/div[3]/div[4]/div[2]/div[1]/div[4]/div[2]/div/div[5]/div/div/div[2]/div/div/div[3]/div/div[4]/button")
      private WebElement btnSaveKam;
      public void clickOnKamSaveBtn()
      {
            Utils.clickOnElement(btnSaveKam);
      }


}
