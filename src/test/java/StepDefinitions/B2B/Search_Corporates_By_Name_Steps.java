package StepDefinitions.B2B;

import Database.Corporate_App_DB;
import PageComponent.B2B.B2BNavBarPage;
import PageComponent.B2B.B2BSearchCorporatePage;
import io.cucumber.java.en.And;
import org.junit.Assert;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Search_Corporates_By_Name_Steps {
      List<String> corporateNames;
      @And("I click on search corporate from nav bar")
      public void iClickOnSearchCorporateFromNavBar() throws InterruptedException {
            B2BNavBarPage.getInstance().clickOnSearchCorporateLink();
      }

      @And("I enter corporate name as {string}")
      public void liEnterCorporateNameAs(String corporate_name) {
            B2BSearchCorporatePage.getInstance().enterSearchCorporateName(corporate_name);
      }

      @And("I click on search button in the search corporate page")
      public void iClickOnSearchButtonInTheSearchCorporatePage() throws InterruptedException {
            B2BSearchCorporatePage.getInstance().clickOnSearchCorporateBtn();
            Thread.sleep(3000);
      }

      @And("I verify the search corporate result should contains corporate name {string}")
      public void iVerifyTheSearchCorporateResultShouldContainsCorporateName(String corporate_name) throws InterruptedException {
            corporateNames = B2BSearchCorporatePage.getInstance().getAllCorporateNames();
            for (String corporateName:B2BSearchCorporatePage.getInstance().getAllCorporateNames())
            {
                  if(corporateName.toUpperCase().contains(corporate_name))
                  {
                        Assert.assertTrue(true);
                  }
                  else {
                        Assert.fail();
                  }
            }
      }

      @And("I verify the corporate db result data should be equal to the corporate UI result data")
      public void iVerifyTheCorporateDbResultDataShouldBeEqualToTheCorporateUIResultData() throws SQLException, IOException {
            Assert.assertEquals(corporateNames, Corporate_App_DB.getCorporateByName());
      }

      @And("I verify the valid corporate db result data should be equal to the valid corporate UI result data")
      public void iVerifyTheValidCorporateDbResultDataShouldBeEqualToTheValidCorporateUIResultData() {

      }
}
