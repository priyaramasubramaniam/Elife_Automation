package StepDefinitions.B2B;

import PageComponent.B2B.B2BAffiliateEAHPage;
import Utilities.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.io.IOException;

public class Download_Report_Affiliate_Steps {
      @And("I click on affiliates link")
      public void iClickOnAffiliatesLink() {
            B2BAffiliateEAHPage.getInstance().clickOnAffiliateLink();
      }

      @And("I enter elife affiliate id as {string}")
      public void iEnterElifeAffiliateIdAs(String affiliate_id) {
            B2BAffiliateEAHPage.getInstance().enterAffiliateID(affiliate_id);
      }

      @And("I click on search button in the affiliate EAH page")
      public void iClickOnSearchButtonInTheAffiliateEAHPage() throws InterruptedException {
            B2BAffiliateEAHPage.getInstance().clickOnSearchBtn();
            Thread.sleep(3000);
      }

      @And("I get All the B-B Manager details for affiliate from UI")
      public void iGetAllTheBBManagerDetailsForAffiliateFromUI(){
            B2BAffiliateEAHPage.getInstance().getB2BManagerDetails();
      }

      @And("I get all the B-B manager details for affiliate from CSV File")
      public void iGetAllTheBBManagerDetailsForAffiliateFromCSVFile() throws IOException {
            Utils.getDataFromCSV();
      }

      @Then("I verify the B-B Manager details for affiliate from UI with B-B Manager details for affiliate from csv file")
      public void iVerifyTheBBManagerDetailsForAffiliateFromUIWithBBManagerDetailsForAffiliateFromCsvFile() throws IOException {
            Assert.assertEquals(B2BAffiliateEAHPage.getInstance().getB2BManagerDetails(), Utils.getDataFromCSV());
      }


      @And("I get All the B-B KAM details for affiliate from UI")
      public void iGetAllTheBBKAMDetailsForAffiliateFromUI() {
            B2BAffiliateEAHPage.getInstance().getB2BKAMDetails();
      }

      @And("I get all the B-B KAM details for affiliate from CSV File")
      public void iGetAllTheBBKAMDetailsForAffiliateFromCSVFile() throws IOException {
            Utils.getDataFromCSV();
      }

      @Then("I verify the B-B KAM details for affiliate from UI with B-B KAM details for partner from csv file")
      public void iVerifyTheBBKAMDetailsForAffiliateFromUIWithBBKAMDetailsForPartnerFromCsvFile() throws IOException {
            Assert.assertEquals(B2BAffiliateEAHPage.getInstance().getB2BKAMDetails(), Utils.getDataFromCSV());
      }



}
