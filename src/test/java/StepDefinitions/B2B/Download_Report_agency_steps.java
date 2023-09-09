package StepDefinitions.B2B;

import PageComponent.B2B.B2BAgencyEAHPage;
import PageComponent.B2B.B2BNavBarPage;
import Utilities.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.io.IOException;

public class Download_Report_agency_steps {
      @And("I click on Reports dropdown in the nav bar")
      public void iClickOnReportsDropdownInTheNavBar() {
            B2BNavBarPage.getInstance().clickOnReportsLinkDD();
      }

      @And("I click on Employee assignment history link")
      public void iClickOnEmployeeAssignmentHistoryLink() {
            B2BNavBarPage.getInstance().clickOnEAHLink();
      }

      @And("I enter elife agency id as {string}")
      public void iEnterElifeAgencyIdAs(String agency_id) {
            B2BAgencyEAHPage.getInstance().enterAgencyID(agency_id);
      }

      @And("I click on search button in the agency EAH page")
      public void iClickOnSearchButtonInTheAgencyEAHPage() throws InterruptedException {
            B2BAgencyEAHPage.getInstance().clickOnSearchBtn();
            Thread.sleep(5000);
      }

      @And("I get All the B-B Manager details for agency from UI")
      public void iGetAllTheBBManagerDetailsForAgencyFromUI() throws InterruptedException {
            B2BAgencyEAHPage.getInstance().getB2BManagerDetails();
      }

      @And("I get all the B-B manager details for agency from CSV File")
      public void iGetAllTheBBManagerDetailsForAgencyFromCSVFile() throws IOException {
            Utils.getDataFromCSV();
      }


      @Then("I verify the B-B Manager details for agency from UI with B-B Manager details for agency from csv file")
      public void iVerifyTheBBManagerDetailsForAgencyFromUIWithBBManagerDetailsForAgencyFromCsvFile() throws IOException {
            Assert.assertEquals(B2BAgencyEAHPage.getInstance().getB2BManagerDetails(), Utils.getDataFromCSV());
//            Assert.assertEquals(B2BAgencyEAHPage.getInstance().getB2BManagerDetails(), Agency_App_DB.getB2BManagerListForAgency());
//            Assert.assertEquals(Utils.getDataFromCSV(), Agency_App_DB.getB2BManagerListForAgency());

      }


      @And("I get All the B-B KAM details from UI")
      public void iGetAllTheBBKAMDetailsFromUI() throws IOException {
            Utils.getDataFromCSV();
      }

      @And("I get all the B-B KAM details from CSV File")
      public void iGetAllTheBBKAMDetailsFromCSVFile() {
            B2BAgencyEAHPage.getInstance().getB2BKAMDetails();
      }

      @Then("I verify the B-B KAM details for agency from UI with B-B KAM details for agency from csv file")
      public void iVerifyTheBBKAMDetailsForAgencyFromUIWithBBKAMDetailsForAgencyFromCsvFile() throws IOException {
            Assert.assertEquals(Utils.getDataFromCSV(), B2BAgencyEAHPage.getInstance().getB2BKAMDetails());
      }


}
