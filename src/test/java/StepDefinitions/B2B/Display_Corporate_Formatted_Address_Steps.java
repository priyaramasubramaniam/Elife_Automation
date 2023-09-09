package StepDefinitions.B2B;

import Database.Corporate_App_DB;
import PageComponent.B2B.B2BCorporateDetailsPage;
import PageComponent.B2B.B2BSearchCorporatePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.io.IOException;
import java.sql.SQLException;

public class Display_Corporate_Formatted_Address_Steps {
      String corpAddress;
      String corpAddressUI;

      @And("I verify the corporate formatted address in db should be equal to the address shown in search corp page")
      public void iVerifyTheCorporateFormattedAddressInDbShouldBeEqualToTheAddressShownInSearchCorpPage() throws SQLException, IOException {
            Assert.assertEquals(B2BSearchCorporatePage.getInstance().getCorpAddress(), corpAddress);
      }

      @Then("I verify the corporate address for the corp {string} in the corporate search page should be same as formatted address in the DB")
      public void iVerifyTheCorporateAddressInTheCorpInTheCorporateSearchPageShouldBeSameAsFormattedAddressInTheDB(String corp_name) throws SQLException, IOException {
            Assert.assertEquals(B2BSearchCorporatePage.getInstance().getCorpAddress(), Corporate_App_DB.getCorporateFormattedAddress(corp_name));
      }


      @And("I click on the corporate id link in the search page")
      public void iClickOnTheCorporateIdLinkInTheSearchPage() {
            B2BSearchCorporatePage.getInstance().clickOnCorporateId();
      }

      @And("I click on the details link in the corporate details page")
      public void iClickOnTheDetailsLinkInTheCorporateDetailsPage() {
            B2BCorporateDetailsPage.getInstance().clickOnCorpDetailsLink();
      }

      @Then("I verify the corporate address for the corp {string} in the corporate details page should be same as formatted address in the DB")
      public void iVerifyTheCorporateAddressForTheCorpInTheCorporateDetailsPageShouldBeSameAsFormattedAddressInTheDB(String corp_name) throws SQLException, IOException {
            Assert.assertEquals(B2BCorporateDetailsPage.getInstance().getCorporateAddress(), Corporate_App_DB.getCorporateFormattedAddress(corp_name));
      }






}
