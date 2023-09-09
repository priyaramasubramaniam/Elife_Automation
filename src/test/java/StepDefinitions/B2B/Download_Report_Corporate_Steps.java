package StepDefinitions.B2B;

import PageComponent.B2B.B2BCorporateEAHPage;
import Utilities.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.io.IOException;

public class Download_Report_Corporate_Steps {

      @And("I click on corporates link")
      public void iClickOnCorporatesLink() {
            B2BCorporateEAHPage.getInstance().clickOnCorporateLink();
      }

      @And("I enter elife corporate id as {string}")
      public void iEnterElifeCorporateIdAs(String corporate_id) throws InterruptedException {
            B2BCorporateEAHPage.getInstance().enterCorporateID(corporate_id);
      }

      @And("I click on search button in the corporate EAH page")
      public void iClickOnSearchButtonInTheCorporateEAHPage() throws InterruptedException {
            B2BCorporateEAHPage.getInstance().clickOnSearchBtn();
            Thread.sleep(3000);
      }

      @And("I get All the B-B Manager details for corporate from UI")
      public void iGetAllTheBBManagerDetailsForCorporateFromUI() {
            B2BCorporateEAHPage.getInstance().getB2BManagerDetails();
      }

      @And("I get all the B-B manager details for corporate from CSV File")
      public void iGetAllTheBBManagerDetailsForCorporateFromCSVFile() throws IOException {
            Utils.getDataFromCSV();
      }

      @Then("I verify the B-B Manager details for corporate from UI with B-B Manager details for corporate from csv file")
      public void iVerifyTheBBManagerDetailsForCorporateFromUIWithBBManagerDetailsForCorporateFromCsvFile() throws IOException {
            Assert.assertEquals(B2BCorporateEAHPage.getInstance().getB2BManagerDetails(), Utils.getDataFromCSV());
      }

      @And("I get All the B-B KAM details for corporate from UI")
      public void iGetAllTheBBKAMDetailsForCorporateFromUI() {
            B2BCorporateEAHPage.getInstance().getB2BKAMDetails();
      }

      @And("I get all the B-B KAM details for corporate from CSV File")
      public void iGetAllTheBBKAMDetailsForCorporateFromCSVFile() throws IOException {
            Utils.getDataFromCSV();
      }


      @Then("I verify the B-B KAM details for corporate from UI with B-B KAM details for corporate from csv file")
      public void iVerifyTheBBKAMDetailsForCorporateFromUIWithBBKAMDetailsForCorporateFromCsvFile() throws IOException, InterruptedException {
            Thread.sleep(3000);
            Assert.assertEquals(B2BCorporateEAHPage.getInstance().getB2BKAMDetails(), Utils.getDataFromCSV());
      }
}
