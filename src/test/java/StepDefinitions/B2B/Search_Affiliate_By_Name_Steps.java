package StepDefinitions.B2B;

import Database.Affiliate_App_DB;
import PageComponent.B2B.B2BNavBarPage;
import PageComponent.B2B.B2BSearchAffiliatePage;
import PageComponent.B2B.B2BSearchAgencyPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Search_Affiliate_By_Name_Steps {
      public List<String>affiliateNames;

      @And("I click on search affiliate from nav bar")
      public void iClickOnSearchAffiliateFromNavBar() {
            B2BNavBarPage.getInstance().clickOnSearchAffiliateLink();
      }

      @And("I enter affiliate name as {string}")
      public void iEnterAffiliateNameAs(String affiliate_name) {
            B2BSearchAffiliatePage.getInstance().
                    enterAffiliateName(affiliate_name);
      }

      @And("I click on search button in the search affiliate page")
      public void iClickOnSearchButtonInTheSearchAffiliatePage() throws InterruptedException {
            B2BSearchAffiliatePage.getInstance().clickOnSearchBtn();
            Thread.sleep(3000);
      }

      @And("I verify the search affiliate result should contains affiliate name {string}")
      public void iVerifyTheSearchAffiliateResultShouldContainsAffiliateName(String affiliate_name) throws InterruptedException {
            affiliateNames = B2BSearchAffiliatePage.getInstance().getAllAffiliateNames();
            for(String affiliateName: B2BSearchAffiliatePage.getInstance().getAllAffiliateNames())
            {
                  if(affiliateName.toUpperCase().contains(affiliate_name))
                  {
                        Assert.assertTrue(true);
                  }
                  else
                  {
                        Assert.assertTrue(false);
                  }
            }
      }

      @And("I verify the affiliate db result data should be equal to the affiliate UI result data")
      public void iVerifyTheAffiliateDbResultDataShouldBeEqualToTheAffiliateUIResultData() throws SQLException, IOException {
            Assert.assertEquals(affiliateNames, Affiliate_App_DB.getAffiliateByName());
      }


}
