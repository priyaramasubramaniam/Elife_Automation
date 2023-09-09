package StepDefinitions.B2B;

import PageComponent.B2B.B2BEmployeeReportPage;
import PageComponent.B2B.B2BNavBarPage;
import Utilities.Utils;
import io.cucumber.java.en.And;
import org.junit.Assert;

import javax.rmi.CORBA.Util;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Download_Employee_Report_Steps {
      List<String> allDetails;
      List<String> affiliateNames;
      List<String> corporateDetails;
      List<String> agencyDetails;
      List<String> partnerDetails;
      @And("I click on Employee report link")
      public void iClickOnEmployeeReportLink() {
            B2BNavBarPage.getInstance().clickOnEmployeeReportLink();
      }

      @And("I click on agency, partner, affiliate and corporate links")
      public void iClickOnAgencyPartnerAffiliateAndCorporateLinks() throws InterruptedException {
            B2BEmployeeReportPage.getInstance().clickOnAgencyCheckbox();
            B2BEmployeeReportPage.getInstance().clickOnPartnerCheckbox();
            B2BEmployeeReportPage.getInstance().clickOnAffiliateCheckbox();
            B2BEmployeeReportPage.getInstance().clickOnCorporateCheckbox();
            Thread.sleep(3000);
      }
      @And("I click on search button in the employee reports page")
      public void iClickOnSearchButtonInTheEmployeeReportsPage() throws InterruptedException {
            B2BEmployeeReportPage.getInstance().clickOnSearchBtn();
            Thread.sleep(3000);
      }
      @And("I get all the data from UI")
      public void iGetAllTheDataFromUI() throws InterruptedException {
            allDetails = B2BEmployeeReportPage.getInstance().getEmployeeData();
      }

      @And("I get all the data from csv file {string}")
      public void iGetAllTheDataFromCsvFile(String all) throws IOException {
            Utils.getDataFromCSVEmployeeReport(all);
      }

      @And("I verify the employee report in the UI and CSV file")
      public void iVerifyTheEmployeeReportInTheUIAndCSVFile() {
      }

      @And("I verify the employee report in the UI and CSV file {string}")
      public void iVerifyTheEmployeeReportInTheUIAndCSVFile(String all) throws InterruptedException, IOException {
            Assert.assertEquals(allDetails, Utils.getDataFromCSVEmployeeReport(all));
      }

      @And("I click on agency link")
      public void iClickOnAgencyLink() {
            B2BEmployeeReportPage.getInstance().clickOnAgencyCheckbox();
      }
      @And("I get all the agency data from UI")
      public void iGetAllTheAgencyDataFromUI() throws InterruptedException {
             agencyDetails = B2BEmployeeReportPage.getInstance().getEmployeeData();
      }
      @And("I get all the agency data from csv file {string}")
      public void iGetAllTheAgencyDataFromCsvFile(String app_name) throws IOException {
            Utils.getDataFromCSVEmployeeReport(app_name);
      }
      @And("I verify the employee report of agency in the UI and CSV file {string}")
      public void iVerifyTheEmployeeReportOfAgencyInTheUIAndCSVFile(String app_name) throws InterruptedException, IOException {
            Assert.assertEquals(agencyDetails, Utils.getDataFromCSVEmployeeReport(app_name));
      }

      @And("I click on partner link")
      public void iClickOnPartnerLink() {
            B2BEmployeeReportPage.getInstance().clickOnPartnerCheckbox();
      }

      @And("I get all the partner data from UI")
      public void iGetAllThePartnerDataFromUI() throws InterruptedException {
            partnerDetails = B2BEmployeeReportPage.getInstance().getEmployeeData();
      }

      @And("I get all the partner data from csv file {string}")
      public void iGetAllThePartnerDataFromCsvFile(String app_name) throws IOException {
            Utils.getDataFromCSVEmployeeReport(app_name);
      }

      @And("I verify the employee report of partner in the UI and CSV file {string}")
      public void iVerifyTheEmployeeReportOfPartnerInTheUIAndCSVFile(String app_name) throws IOException {
            Assert.assertEquals(partnerDetails, Utils.getDataFromCSVEmployeeReport(app_name));
      }

      @And("I click on corporate link")
      public void iClickOnCorporateLink() {
            B2BEmployeeReportPage.getInstance().clickOnCorporateCheckbox();
      }

      @And("I get all the corporate data from UI")
      public void iGetAllTheCorporateDataFromUI() throws InterruptedException {
            corporateDetails = B2BEmployeeReportPage.getInstance().getEmployeeData();
      }

      @And("I get all the corporate data from csv file {string}")
      public void iGetAllTheCorporateDataFromCsvFile(String app_name) throws IOException {
            Utils.getDataFromCSVEmployeeReport(app_name);
      }

      @And("I verify the employee report of corporate in the UI and CSV file {string}")
      public void iVerifyTheEmployeeReportOfCorporateInTheUIAndCSVFile(String app_name) throws InterruptedException, IOException {
            Assert.assertEquals(corporateDetails, Utils.getDataFromCSVEmployeeReport(app_name));
      }

      @And("I click on affiliate link")
      public void iClickOnAffiliateLink() {
            B2BEmployeeReportPage.getInstance().clickOnAffiliateCheckbox();
      }
      @And("I get all the affiliate data from UI")
      public void iGetAllTheAffiliateDataFromUI() throws InterruptedException {
            affiliateNames = B2BEmployeeReportPage.getInstance().getEmployeeData();

      }
      @And("I get all the affiliate data from csv file {string}")
      public void iGetAllTheAffiliateDataFromCsvFile(String app_name) throws IOException {
            Utils.getDataFromCSVEmployeeReport(app_name);
      }

      @And("I verify the employee report of affiliate in the UI and CSV file {string}")
      public void iVerifyTheEmployeeReportOfAffiliateInTheUIAndCSVFile(String app_name) throws IOException, InterruptedException {
            Assert.assertEquals(affiliateNames, Utils.getDataFromCSVEmployeeReport(app_name));
      }



}
