package StepDefinitions.B2B;

import PageComponent.B2B.B2BPartnerEAHPage;
import Utilities.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.io.IOException;

public class Download_Report_partner_steps {
      @And("I click on partners link")
      public void iClickOnPartnersLink() throws InterruptedException {
            B2BPartnerEAHPage.getInstance().clickOnPartnerLink();
      }

      @And("I enter elife partner id as {string}")
      public void iEnterElifePartnerIdAs(String partner_id) {
            B2BPartnerEAHPage.getInstance().enterPartnerID(partner_id);
      }

      @And("I click on search button in the partner EAH page")
      public void iClickOnSearchButtonInThePartnerEAHPage() throws InterruptedException {
            B2BPartnerEAHPage.getInstance().clickOnSearchBtn();
      }

      @And("I get All the B-B Manager details for partner from UI")
      public void iGetAllTheBBManagerDetailsForPartnerFromUI() {
            B2BPartnerEAHPage.getInstance().getB2BManagerDetails();
      }

      @And("I get all the B-B manager details for partner from CSV File")
      public void iGetAllTheBBManagerDetailsForPartnerFromCSVFile() throws IOException {
            Utils.getDataFromCSV();
      }
      @Then("I verify the B-B Manager details for partner from UI with B-B Manager details for partner from csv file")
      public void iVerifyTheBBManagerDetailsForPartnerFromUIWithBBManagerDetailsForPartnerFromCsvFile() throws IOException {
            Assert.assertEquals(B2BPartnerEAHPage.getInstance().getB2BManagerDetails(), Utils.getDataFromCSV());
      }

      @And("I click on the partners link")
      public void iClickOnThePartnersLink() throws InterruptedException {
            B2BPartnerEAHPage.getInstance().clickOnPartnerLink();
      }
      @And("I get All the B-B KAM details for partner from UI")
      public void iGetAllTheBBKAMDetailsForPartnerFromUI() {
            B2BPartnerEAHPage.getInstance().getB2BKAMDetails();
      }

      @And("I get all the B-B KAM details for partner from CSV File")
      public void iGetAllTheBBKAMDetailsForPartnerFromCSVFile() throws IOException {
            Utils.getDataFromCSV();
      }

      @Then("I verify the B-B KAM details for partner from UI with B-B KAM details for partner from csv file")
      public void iVerifyTheBBKAMDetailsForPartnerFromUIWithBBKAMDetailsForPartnerFromCsvFile() throws IOException {
            Assert.assertEquals(B2BPartnerEAHPage.getInstance().getB2BKAMDetails(), Utils.getDataFromCSV());
      }



}
