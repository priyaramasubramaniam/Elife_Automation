package PageComponent.B2B;

import Utilities.Utils;
import Web_Driver_Manager.DriverManager;
import io.cucumber.java.sl.In;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class B2BEmployeeReportPage {

      public static B2BEmployeeReportPage b2bEmployeeReportInstance;
      private B2BEmployeeReportPage(){}

      public static B2BEmployeeReportPage getInstance()
      {
            if(b2bEmployeeReportInstance == null)
            {
                  b2bEmployeeReportInstance = new B2BEmployeeReportPage();
            }
            return b2bEmployeeReportInstance;
      }

      @FindBy(id = "only-agency") private WebElement checkboxAgency;
      public void clickOnAgencyCheckbox() {Utils.clickOnElement(checkboxAgency);}

      @FindBy(id = "only-partner") private WebElement checkboxPartner;
      public void clickOnPartnerCheckbox() {Utils.clickOnElement(checkboxPartner);}

      @FindBy(id = "only-affiliate") private WebElement checkboxAffiliate;
      public void clickOnAffiliateCheckbox() {Utils.clickOnElement(checkboxAffiliate);}

      @FindBy(id = "only-corporate") private WebElement checkboxCorporate;
      public void clickOnCorporateCheckbox() {Utils.clickOnElement(checkboxCorporate);}

      @FindBy(xpath = "/html/body/div[3]/div[7]/div[1]/div/div[2]/div/div/div/div[2]/div[1]/button[2]") private WebElement btnSearch;
      public void clickOnSearchBtn(){Utils.clickOnElement(btnSearch);}

      @FindBy(xpath = "//td[@name='entity-type']") private List<WebElement> textType;
      @FindBy(xpath = "//td[@name='entity-name']") private List<WebElement> textName;
      @FindBy(xpath = "//tr[@name='employee-report-page-list-row']//td[@name='address']")
      private List<WebElement> textAddress;
      @FindBy(xpath = "//tr[@name='employee-report-page-list-row']//td[@name='admin']//i")
      private List<WebElement> textAdminName;
      @FindBy(xpath = "//tr[@name='employee-report-page-list-row']//td[@name='admin']//a")
      private List<WebElement> textAdminEmail;
      @FindBy(xpath = "//tr[@name='employee-report-page-list-row']//td[@name='elife-manager']")
      private List<WebElement> textManagerDetails;
      @FindBy(xpath = "//tr[@name='employee-report-page-list-row']//td[@name='key-account-manager']")
      private List<WebElement> textKAMDetails;
      @FindBy(xpath = "//tr[@name='employee-report-page-list-row']//td[@name='lead-generator']")
      private List<WebElement> textLeadGeneratorDetails;
      @FindBy(xpath = "//tr[@name='employee-report-page-list-row']//td[@name='registration-date']")
      private List<WebElement> textRegisteredOn;
      @FindBy(css = "#employee-report-page-list-next-btn") private WebElement btnNext;

      public List<String> getEmployeeData() throws InterruptedException {
            List<String> employeeData = new ArrayList<>();

            while (true)
            {
                  for (int i=0; i<=textType.size()-1;i++)
                  {
                        employeeData.add(textType.get(i).getText().trim());
                        employeeData.add(textName.get(i).getText().trim());
                        employeeData.add(textAddress.get(i).getText().trim());
                        employeeData.add(textAdminName.get(i).getText().trim());
                        employeeData.add(textAdminEmail.get(i).getText().trim());
                        employeeData.add(textManagerDetails.get(i).getText().trim());
                        employeeData.add(textKAMDetails.get(i).getText().trim());
                        employeeData.add(textLeadGeneratorDetails.get(i).getText().trim());
                        employeeData.add(textRegisteredOn.get(i).getText().trim());
                  }
                  if (btnNext.isEnabled()) {
                        JavascriptExecutor jsExecutor = (JavascriptExecutor) DriverManager.getDriver();
                        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", btnNext);
                        Thread.sleep(2000);
                        btnNext.click();
                        Thread.sleep(3000);
                  } else {
                        // No more pages to process
                        break;
                  }

            }
            System.out.println(employeeData);
            return employeeData;
      }




      /*
      @FindBy(xpath = "//tr[@name='employee-report-page-list-row']") private List<WebElement> rowElements;
      @FindBy(xpath = "//tr[@name='employee-report-page-list-row']//td") private List<WebElement> cellElements;

      public List<String[]> getEmployeeData1()
      {
            List<String[]> tableData = new ArrayList<>();
            for(WebElement row : rowElements)
            {
                  String[] rowData = new String[cellElements.size()];
                  for(int i = 0; i< cellElements.size(); i++)
                  {
                        rowData[i] = cellElements.get(i).getText();
                  }
                  tableData.add(rowData);
            }
            return tableData;
      }
       */










}
