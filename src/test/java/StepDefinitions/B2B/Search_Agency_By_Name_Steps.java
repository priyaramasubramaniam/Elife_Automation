package StepDefinitions.B2B;

import Database.Agency_App_DB;
import PageComponent.B2B.B2BAgencyEAHPage;
import PageComponent.B2B.B2BNavBarPage;
import PageComponent.B2B.B2BSearchAgencyPage;
import io.cucumber.java.en.And;
import org.junit.Assert;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Search_Agency_By_Name_Steps {
      List<String> agencyNames;
      @And("I click on search agency from nav bar")
      public void iClickOnSearchAgencyFromNavBar() {
            B2BNavBarPage.getInstance().clickOnSearchAgencyLink();
      }

      @And("I enter agency name as {string}")
      public void iEnterAgencyNameAs(String agency_name) {
            B2BSearchAgencyPage.getInstance().enterAgencyName(agency_name);
      }

      @And("I click on search button in the search agency page")
      public void iClickOnSearchButtonInTheSearchAgencyPage() throws InterruptedException {
            B2BSearchAgencyPage.getInstance().clickOnSearchBtn();
            Thread.sleep(3000);
      }

      @And("I verify the search agency result should contains agency name {string}")
      public void iVerifyTheSearchAgencyResultShouldContainsAgencyName(String agency_name) throws InterruptedException {
            agencyNames = B2BSearchAgencyPage.getInstance().getAllAgencyNames();
            for (String agencyName : agencyNames)
            {
                  if(agencyName.toUpperCase().contains(agency_name))
                  {
                        Assert.assertTrue(true);
                  }
                  else {
                        Assert.assertTrue(false);
                  }
            }
      }

      @And("I get the agency result from db")
      public void iGetTheAgencyResultFromDb() throws SQLException, IOException {
            Agency_App_DB.getAgencyByName();
      }

      @And("I verify the agency db result data should be equal to the agency UI result data")
      public void iVerifyTheAgencyDbResultDataShouldBeEqualToTheAgencyUIResultData() throws InterruptedException, SQLException, IOException {
            Assert.assertEquals(agencyNames, Agency_App_DB.getAgencyByName());
      }


}
