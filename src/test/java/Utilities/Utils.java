package Utilities;

import PageComponent.AffiliateApp.AFForgotPasswordPage;
import PageComponent.AffiliateApp.AFSignInPage;
import PageComponent.AgencyApp.*;
import PageComponent.B2B.*;
import PageComponent.Backoffice.BackOfficeNavBarPage;
import PageComponent.Backoffice.BackofficeCreateNewRidePage;
import PageComponent.CorporateApp.CDashboardPage;
import PageComponent.CorporateApp.CForgotPasswordPage;
import PageComponent.CorporateApp.CRidesPage;
import PageComponent.CorporateApp.CSignInPage;
import PageComponent.PartnerApp.PForgotPasswordPage;
import PageComponent.PartnerApp.PSignInPage;
import StepDefinitions.B2B.Common_Step_Definitions;
import Web_Driver_Manager.DriverManager;
import io.cucumber.java.Scenario;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

public class Utils {
    public static String getGlobalValue(String key) throws IOException {
        Properties properties = new Properties();
        FileInputStream file = new FileInputStream("src/test/java/Utilities/Global_Config.properties");
        properties.load(file);
        return properties.getProperty(key);
    }

    public static void initWebElements()
    {
        //Add for B2B App
        PageFactory.initElements(DriverManager.getDriver(), B2BSignInPage.getInstance());
        PageFactory.initElements(DriverManager.getDriver(), B2BApplicationSelectionPage.getInstance());
        PageFactory.initElements(DriverManager.getDriver(), B2BNavBarPage.getInstance());
        PageFactory.initElements(DriverManager.getDriver(), B2BSearchCorporatePage.getInstance());
        PageFactory.initElements(DriverManager.getDriver(), B2BAgencyEAHPage.getInstance());
        PageFactory.initElements(DriverManager.getDriver(), B2BPartnerEAHPage.getInstance());
        PageFactory.initElements(DriverManager.getDriver(), B2BAffiliateEAHPage.getInstance());
        PageFactory.initElements(DriverManager.getDriver(), B2BCorporateEAHPage.getInstance());
        PageFactory.initElements(DriverManager.getDriver(), B2BEmployeeReportPage.getInstance());
        PageFactory.initElements(DriverManager.getDriver(), B2BSearchAgencyPage.getInstance());
        PageFactory.initElements(DriverManager.getDriver(), B2BSearchPartnerPage.getInstance());
        PageFactory.initElements(DriverManager.getDriver(), B2BSearchAffiliatePage.getInstance());
        PageFactory.initElements(DriverManager.getDriver(), B2BAssignRidePage.getInstance());
        PageFactory.initElements(DriverManager.getDriver(), B2BNotesPage.getInstance());
        PageFactory.initElements(DriverManager.getDriver(), B2BCorporateDetailsPage.getInstance());
        PageFactory.initElements(DriverManager.getDriver(), B2BAddCorporatePage.getInstance());
        PageFactory.initElements(DriverManager.getDriver(), B2BDashboardPage.getInstance());
        PageFactory.initElements(DriverManager.getDriver(), B2BPartnerDetailsPage.getInstance());

        //Add for BackOffice
        PageFactory.initElements(DriverManager.getDriver(), BackOfficeNavBarPage.getInstance());
        PageFactory.initElements(DriverManager.getDriver(), BackofficeCreateNewRidePage.getInstance());

        //Add for corporate app
        PageFactory.initElements(DriverManager.getDriver(), CSignInPage.getInstance());
        PageFactory.initElements(DriverManager.getDriver(), CDashboardPage.getInstance());
        PageFactory.initElements(DriverManager.getDriver(), CRidesPage.getInstance());
        PageFactory.initElements(DriverManager.getDriver(), CForgotPasswordPage.getInstance());

        //Add for Affiliate app
        PageFactory.initElements(DriverManager.getDriver(), AFSignInPage.getInstance());
        PageFactory.initElements(DriverManager.getDriver(), AFForgotPasswordPage.getInstance());

        //Add for Agency app
        PageFactory.initElements(DriverManager.getDriver(), ASignInPage.getInstance());
        PageFactory.initElements(DriverManager.getDriver(), AForgotPasswordPage.getInstance());
        PageFactory.initElements(DriverManager.getDriver(), ASignUpPage.getInstance());
        PageFactory.initElements(DriverManager.getDriver(), ADashboardPage.getInstance());
        PageFactory.initElements(DriverManager.getDriver(), ARidesPage.getInstance());

        //Add for Partners app
        PageFactory.initElements(DriverManager.getDriver(), PSignInPage.getInstance());
        PageFactory.initElements(DriverManager.getDriver(), PForgotPasswordPage.getInstance());
    }

    public static void takeScreenshot()
    {
        File screenshot = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File(Common_Step_Definitions.getScenarioName() +".png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

//    public static void highlightElement(WebElement element)
//    {
//        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
//        js.executeScript("arguments[0].setAttribute('style','border: 2px solid blue", element);
//    }

    public static void waitForVisibility(WebElement element){
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
    }






    public static boolean checkIfElementIsDisplayed(WebElement element){
        waitForVisibility(element);
        return element.isDisplayed();
    }

    public static boolean checkIfElementIsNotDisplayed(WebElement element){
        return element.isDisplayed();
    }

    public boolean verifyVisibilityOfElement(WebElement element){
        try{
            element.getSize();
            return true;
        }catch (org.openqa.selenium.NoSuchElementException e){
            return false;
        }
    }

    public static void checkIfElementIsSelected(WebElement element){
        Assert.assertTrue(element.isSelected());
    }

    public static void checkIfElementIsNotSelected(WebElement element){
        Assert.assertFalse(element.isSelected());
    }

    public static void clickOnElement(WebElement element){
        waitForVisibility(element);
        element.click();
    }

    public static void clearTextOnElement(WebElement element){
        element.clear();
    }

    public static void setTextOnElement(WebElement element, String text){
        waitForVisibility(element);
        element.clear();
        element.sendKeys(text);
        Assert.assertEquals(text,element.getAttribute("value"));
    }

//    public static void captureScreenShot(WebDriver driver, String ScreenShotName)
//    {
//        try {
//            File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//            FileUtils.copyFile(screenshot,new File("C:\\Users\\KarthikKokila\\WebAutomation\\src\\main\\java\\Utilities"+ScreenShotName+".jpg"));
//        } catch (Exception e)
//        {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
//    }

    public static void verifyTextOfElement(WebElement element, String text){
        Assert.assertTrue(element.getText().contains(text));
    }

    public static void navigateToElement(WebElement element){
        Actions action = new Actions(DriverManager.getDriver());
        action.moveToElement(element).build().perform();
    }

    public static void verifyDropDownOptions(WebElement element, List<String> expectedValue){
        Select select = new Select(element);
        List<WebElement> actualOptions = select.getOptions();
        List<String> actualValues = new ArrayList<>();
        for (WebElement opt: actualOptions) {
            actualValues.add(opt.getText());
        }
        Collections.sort(actualValues);
        Collections.sort(expectedValue);
        Assert.assertEquals(expectedValue,actualValues);
    }

    public static void selectByVisibleTextFromDropDown(WebElement element, String text){
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public static void selectByValueFromDropDown(WebElement element, String text){
        Select select = new Select(element);
        select.selectByValue(text);
    }

    public static void pageRefresh(){
        DriverManager.getDriver().navigate().refresh();
    }

    public boolean isElementPresent(String xpath){
        try{
            DriverManager.getDriver().findElement(By.xpath(xpath));
            return true;
        }catch (org.openqa.selenium.NoSuchElementException e){
            return false;
        }
    }

    public boolean isAttributePresent(WebElement element, String attribute) {
        boolean result = false;
        try {
            String value = element.getAttribute(attribute);
            if (!value.isEmpty())
                result = true;
        } catch (Exception e) {
        }
        return result;
    }

    public  static void verifySelectedOptionFromDropDown(WebElement element, String text){
        Select select = new Select(element);
        String selectedOptionInDropDown = select.getFirstSelectedOption().getText();
        Assert.assertEquals(selectedOptionInDropDown,text);
    }

    public static void verifyFieldRestrictionOnMoreThanMaxValue(WebElement element,String text){
        element.clear();
        element.sendKeys(text);
        Assert.assertEquals(text.length()-1,element.getAttribute("value").length());
    }

    public static void setNullValueOnElement(WebElement element){
        element.clear();
    }

    public static void verifyDefaultValueOfDropDown(WebElement element,String expectedValue){
        Select select = new Select(element);
        WebElement option = select.getFirstSelectedOption();
        Assert.assertEquals(option.getText(),expectedValue);
    }

    public static boolean checkIfElementIsEnabled(WebElement element){
        waitForVisibility(element);
        return element.isEnabled();
    }

    public static boolean checkIfElementIsNotEnabled(WebElement element){
        waitForVisibility(element);
        return element.isEnabled();
    }

    public static void selectByIndexFromDropDown(WebElement element, int index){
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public boolean isElementVisible(WebElement element){
        try{
            return element.isDisplayed();
        }catch (Exception NoSuchElementException){
            return false;
        }
    }

    public static String getWebElementText(WebElement element)
    {
        waitForVisibility(element);
        return element.getText();
    }

    public static void moveToElement(WebElement element)
    {
        Actions actions = new Actions(DriverManager.getDriver());
        actions.moveToElement(element);
    }

    public static void moveToElementByOffsetAndClick(WebElement element, int x, int y)
    {
        Actions actions = new Actions(DriverManager.getDriver());
        actions.moveToElement(element, x, y).click().build().perform();
    }



    public static void attachScreenshot(Scenario scenario) throws IOException {
        if(scenario.isFailed())
        {
            File screenshotTaken = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotTaken, new File("//Screenshot"));
            scenario.attach(String.valueOf(screenshotTaken), "image/png", scenario.getName());
        }
    }

    public static void scrollToElement(WebElement element)
    {
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static List<String> getDataFromCSV() throws IOException {
        String filePath = DriverManager.downloadFilepath;
        Reader reader = new FileReader(filePath);
        CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
        boolean isFirstRecord = true;

        List<String> CsvData = new ArrayList<>();
        for (CSVRecord csvRecord : csvParser){
            if (isFirstRecord) {
                isFirstRecord = false;
                continue; // Skip the header row
            }
            String name = csvRecord.get(1);
            String email  = csvRecord.get(2);
            String startDate  = csvRecord.get(3);
            String endDate  = csvRecord.get(4);

            CsvData.add(name);
            CsvData.add(email);
            CsvData.add(startDate);
            CsvData.add(endDate);
        }

        System.out.println(CsvData);
        return CsvData;
    }

      public static List<String> getDataFromCSVEmployeeReport(String name_app) throws IOException {
          String filePath = null;
          boolean isFirstRecord = true;
          if(name_app == "agency")
          {
              filePath = Utils.getGlobalValue("EMPLOYEE_REPORT_FILE_AGENCY");
          }
          else if(name_app == "partner")
          {
              filePath = Utils.getGlobalValue("EMPLOYEE_REPORT_FILE_PARTNER");
          }
          else if(name_app == "affiliate")
          {
              filePath = Utils.getGlobalValue("EMPLOYEE_REPORT_FILE_AFFILIATE");
          }
          else if(name_app == "corporate")
          {
              filePath = Utils.getGlobalValue("EMPLOYEE_REPORT_FILE_CORPORATE");
          }
          else if(name_app == "all")
          {
              filePath = Utils.getGlobalValue("EMPLOYEE_REPORT_FILE");
          }
          List<String> CsvData = new ArrayList<>();
          Reader reader = new FileReader(filePath);
          CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
          for (CSVRecord csvRecord : csvParser){
              if (isFirstRecord) {
                  isFirstRecord = false;
                  continue; // Skip the header row
              }
              String type = csvRecord.get(1);
              String name  = csvRecord.get(2);
              String address  = csvRecord.get(3);
              String adminName  = csvRecord.get(4);
              String adminEmail = csvRecord.get(5);
              String adminContact = csvRecord.get(6);
              String elifeManager = csvRecord.get(7);
              String KAM = csvRecord.get(8);
              String leadGenerator = csvRecord.get(9);
              String registerOn = csvRecord.get(10);

              CsvData.add(type.trim());
              CsvData.add(name.trim());
              CsvData.add(address.trim());
              CsvData.add(adminName.trim());
              CsvData.add(adminEmail.trim());
              //                  CsvData.add(adminContact);
              CsvData.add(elifeManager.trim());
              CsvData.add(KAM.trim());
              CsvData.add(leadGenerator.trim());
              CsvData.add(registerOn.trim());
          }

          //            System.out.println(CsvData);
          return CsvData;
      }

      public static List<String> getWebElementList(List<WebElement> WebElements, WebElement nextPageBtn) throws InterruptedException {
            List<String> WebElementsTextList = new ArrayList<>();
          while (true)
          {
              for (int i=0; i<=WebElements.size()-1; i++)
              {
                  WebElementsTextList.add(WebElements.get(i).getText());
              }
              if (nextPageBtn.isEnabled()) {
                  JavascriptExecutor jsExecutor = (JavascriptExecutor) DriverManager.getDriver();
                  jsExecutor.executeScript("arguments[0].scrollIntoView(true);", nextPageBtn);
                  Thread.sleep(3000);
                  nextPageBtn.click();
                  Thread.sleep(3000);
              } else {
                  // No more pages to process
                  break;
              }
          }
          //System.out.println(WebElementsTextList);
          return  WebElementsTextList;
      }

    public static List<String> checkCreditRideInAgencyRides() throws IOException {
        String filePath = DriverManager.downloadFilepath;
        Reader reader = new FileReader(filePath);
        CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
        boolean isFirstRecord = true;

        List<String> CsvData = new ArrayList<>();
        for (CSVRecord csvRecord : csvParser){
            if (isFirstRecord) {
                isFirstRecord = false;
                continue; // Skip the header row
            }


            CsvData.add("Is Credit Ride");
        }

        System.out.println(CsvData);
        return CsvData;
    }
}
