package PageComponent.B2B;

import Utilities.Utils;
import Web_Driver_Manager.DriverManager;
import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class B2BPartnerDetailsPage {
      public static B2BPartnerDetailsPage b2bPartnerDetailsInstance;
      private B2BPartnerDetailsPage(){}

      public static B2BPartnerDetailsPage getInstance()
      {
            if(b2bPartnerDetailsInstance == null)
            {
                  b2bPartnerDetailsInstance = new B2BPartnerDetailsPage();
            }
            return b2bPartnerDetailsInstance;
      }
      @FindBy(id = "par-info") private WebElement linkPartnerDetails;
      public void  clickOnPartnerDetailsLink()
      {
            Utils.clickOnElement(linkPartnerDetails);
      }
      @FindBy(xpath = "//*[@id=\"employee-attachment-container\"]/div[2]/div/div/button") private WebElement ddEmployee;
      public void clickOnEmployeeDD()
      {
            Utils.clickOnElement(ddEmployee);
      }
      @FindBy(xpath = "//*[@id=\"employee-attachment-container\"]/div[2]/div/div/div/div[1]/input") private WebElement inputEmployee;
      public void enterEmployeeEmail(String employee_email)
      {
            Utils.setTextOnElement(inputEmployee, employee_email);
      }
      @FindBy(xpath = "//*[@id=\"bs-select-1-159\"]/span[2]") private WebElement textEmployeeEmail;
      public void clickOnEmployeeEmail()
      {
            Utils.clickOnElement(textEmployeeEmail);
      }
      @FindBy(xpath = "/html/body/div[3]/div[6]/div[2]/div/div[4]/div[1]/div/div/div[5]/div/div/div[2]/div/div/div[1]/div/div[3]/div/input") private WebElement inputEmployeeStartDate;
      public void clickOnEmployeeStartDateCalender()
      {
            Utils.clickOnElement(inputEmployeeStartDate);
      }
      @FindBy(xpath = "/html/body/div[3]/div[6]/div[2]/div/div[4]/div[1]/div/div/div[5]/div/div/div[2]/div/div/div[1]/div/div[3]/div/div/div/table/tbody/tr[5]/td[5]") private WebElement calEmployeeStartDate;
      public void enterEmployeeStartDate()
      {
            Utils.clickOnElement(calEmployeeStartDate);
      }
      @FindBy(xpath = "/html/body/div[3]/div[6]/div[2]/div/div[4]/div[1]/div/div/div[5]/div/div/div[2]/div/div/div[1]/div/div[4]/button") private WebElement btnSaveEmployee;
      public void clickOnSaveEmployeeBtn()
      {
            Utils.clickOnElement(btnSaveEmployee);
      }
      @FindBy(xpath = "/html/body/div[3]/div[1]/strong") private WebElement textSuccessMsg;
      public String getSuccessMessage()
      {
            return Utils.getWebElementText(textSuccessMsg);
      }
      @FindBy(xpath = "//*[@id=\"lead-attachment-container\"]/div[2]/div/div/button") private WebElement ddLeadGenerator;
      public void clickOnLeadGeneratorDD()
      {
            Utils.clickOnElement(ddLeadGenerator);
      }
      @FindBy(xpath = "//*[@id=\"lead-attachment-container\"]/div[2]/div/div/div/div[1]/input") private WebElement inputLeadGenerator;
      public void enterLeadGeneratorEmail(String lead_gen_email)
      {
            Utils.setTextOnElement(inputLeadGenerator, lead_gen_email);
      }
      @FindBy(xpath = "/html/body/div[3]/div[6]/div[2]/div/div[4]/div[1]/div/div/div[5]/div/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div[2]/ul/li/a/span[2]") private WebElement textLeadGenEmail;
      public void clickOnLeadGenEmail()
      {
            Utils.clickOnElement(textLeadGenEmail);
      }
      @FindBy(xpath = "/html/body/div[3]/div[6]/div[2]/div/div[4]/div[1]/div/div/div[5]/div/div/div[2]/div/div/div[2]/div/div[3]/div/input") private WebElement inputLeadGenStartDate;
      public void clickOnLeadGenStartDateInput()
      {
            Utils.clickOnElement(inputLeadGenStartDate);
      }
            @FindBy(xpath = "//*[@id=\"date-1\"]")
      private WebElement calLeadGenStartDate;
      public void clickOnLeadGenStartDate()
      {
            Utils.clickOnElement(calLeadGenStartDate);
      }
      @FindBy(xpath = "/html/body/div[3]/div[6]/div[2]/div/div[4]/div[1]/div/div/div[5]/div/div/div[2]/div/div/div[2]/div/div[4]/button") private WebElement btnLeadGenSave;
      public void clickOnLeadGenSaveBtn()
      {
            Utils.clickOnElement(btnLeadGenSave);
      }

      @FindBy(xpath = "//*[@id=\"kam-attachment-container\"]/div[2]/div/div/button") private WebElement ddKAM;
      public void clickOnKAMdd() throws InterruptedException {
            JavascriptExecutor jsExecutor = (JavascriptExecutor) DriverManager.getDriver();
            jsExecutor.executeScript("arguments[0].scrollIntoView(true);", ddKAM);
            Thread.sleep(3000);
            ddKAM.click();
            Thread.sleep(3000);
      }
      @FindBy(xpath = "//*[@id=\"kam-attachment-container\"]/div[2]/div/div/div/div[1]/input") private WebElement inputKAMEmail;
      public void enterKAMEmail(String kam_email)
      {
            Utils.setTextOnElement(inputKAMEmail, kam_email);
      }
      @FindBy(xpath = "//*[@id=\"bs-select-3-160\"]") private WebElement textKamEmail;
      public void clickOnKamEmail()
      {
            Utils.clickOnElement(textKamEmail);
      }
      @FindBy(xpath = "/html/body/div[3]/div[6]/div[2]/div/div[4]/div[1]/div/div/div[5]/div/div/div[2]/div/div/div[3]/div/div[3]/div/input")
      private WebElement inputKAMStartDate;
      public void clickOnKamStartDate()
      {
            Utils.clickOnElement(inputKAMStartDate);
      }
      @FindBy(xpath = "/html/body/div[3]/div[6]/div[2]/div/div[4]/div[1]/div/div/div[5]/div/div/div[2]/div/div/div[3]/div/div[3]/div/div/div/table/tbody/tr[6]/td[5]")
      private WebElement calKamStartDate;
      public void clickOnCalKamStartDate() throws InterruptedException {
            JavascriptExecutor jsExecutor = (JavascriptExecutor) DriverManager.getDriver();
            jsExecutor.executeScript("arguments[0].scrollIntoView(true);", calKamStartDate);
            Thread.sleep(3000);
            calKamStartDate.click();
            Thread.sleep(3000);
      }
      @FindBy(xpath = "/html/body/div[3]/div[6]/div[2]/div/div[4]/div[1]/div/div/div[5]/div/div/div[2]/div/div/div[3]/div/div[4]/button")
      private WebElement btnSaveKam;
      public void clickOnKamSaveBtn()
      {
            Utils.clickOnElement(btnSaveKam);
      }


}
