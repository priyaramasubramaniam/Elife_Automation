package StepDefinitions.B2B;

import Database.Partner_App_DB;
import PageComponent.B2B.B2BNavBarPage;
import PageComponent.B2B.B2BSearchAgencyPage;
import PageComponent.B2B.B2BSearchPartnerPage;
import io.cucumber.java.en.And;
import org.junit.Assert;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Search_Partner_By_Name_Steps {
      List<String> partnersName;
      @And("I click on search partner from nav bar")
      public void iClickOnSearchPartnerFromNavBar() {
            B2BNavBarPage.getInstance().clickOnSearchPartnersLink();
      }

      @And("I enter partner name as {string}")
      public void iEnterPartnerNameAs(String partner_name) {
            B2BSearchPartnerPage.getInstance().enterPartnerName(partner_name);
      }

      @And("I click on search button in the search partner page")
      public void iClickOnSearchButtonInTheSearchPartnerPage() throws InterruptedException {
            B2BSearchPartnerPage.getInstance().clickOnSearchBtn();
            Thread.sleep(3000);
      }

      @And("I verify the search partner result should contains partner name {string}")
      public void iVerifyTheSearchPartnerResultShouldContainsPartnerName(String partner_name) throws InterruptedException {
            partnersName = B2BSearchPartnerPage.getInstance().getAllPartnerNames();
            for (String agencyName : partnersName)
            {
                  if(agencyName.toUpperCase().contains(partner_name))
                  {
                        Assert.assertTrue(true);
                  }
                  else {
                        Assert.assertTrue(false);
                  }
            }
      }


      @And("I verify the partner db result data should be equal to the partner UI result data")
      public void iVerifyThePartnerDbResultDataShouldBeEqualToThePartnerUIResultData() throws SQLException, IOException {
            Assert.assertEquals(partnersName, Partner_App_DB.getPartnerByName());
      }
}
