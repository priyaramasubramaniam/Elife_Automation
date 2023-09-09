package StepDefinitions.B2B;

import Database.Affiliate_App_DB;
import Database.Agency_App_DB;
import Database.Corporate_App_DB;
import Database.Partner_App_DB;
import PageComponent.B2B.B2BAddCorporatePage;
import PageComponent.B2B.B2BDashboardPage;
import com.beust.ah.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Dashboard_Get_Count_Steps {
      String agencyCountUI;
      String agencyCountDB;
      String partnerCountUI;
      String partnerCountDB;

      String affiliateCountUI;
      String affiliateCountDB;

      String corporateCountUI;
      String corporateCountDB;

      @And("I verify the count of agency in db should be equal to count of agency in the UI")
      public void iVerifyTheCountOfAgencyInDbShouldBeEqualToCountOfAgencyInTheUI() throws SQLException, IOException {
            Assert.assertEquals(B2BDashboardPage.getInstance().getAgencyCount(), Agency_App_DB.getAgencyCount());
      }
      @And("I verify the count of partner in db should be equal to count of partner in the UI")
      public void iVerifyTheCountOfPartnerInDbShouldBeEqualToCountOfPartnerInTheUI() throws SQLException, IOException {
            Assert.assertEquals(B2BDashboardPage.getInstance().getPartnerCount(), Partner_App_DB.getPartnerCount());
      }

      @And("I verify the count of affiliate in db should be equal to count of affiliate in the UI")
      public void iVerifyTheCountOfAffiliateInDbShouldBeEqualToCountOfAffiliateInTheUI() throws SQLException, IOException {
            Assert.assertEquals(B2BDashboardPage.getInstance().getAffiliateCount(), Affiliate_App_DB.getAffiliateCount());
      }


      @And("I verify the count of corporate in db should be equal to count of corporate in the UI")
      public void iVerifyTheCountOfCorporateInDbShouldBeEqualToCountOfCorporateInTheUI() throws SQLException, IOException {
            Assert.assertEquals(B2BDashboardPage.getInstance().getCorporateCount(), Corporate_App_DB.getCorporateCount());
      }


      @And("I verify the count of recent agencies in db should be equal to count of recent agencies in the UI {string}")
      public void iVerifyTheCountOfRecentAgenciesInDbShouldBeEqualToCountOfRecentAgenciesInTheUI(String days) throws SQLException, IOException {
            Assert.assertEquals(B2BDashboardPage.getInstance().getRecentAgenciesCount(), Agency_App_DB.getRecentAgenciesCount(days));
      }


      @And("I verify the count of recent partners in db should be equal to count of recent partners in the UI {string}")
      public void iVerifyTheCountOfRecentPartnersInDbShouldBeEqualToCountOfRecentPartnersInTheUI(String days) throws SQLException, IOException {
            Assert.assertEquals(B2BDashboardPage.getInstance().getRecentPartnersCount(), Partner_App_DB.getRecentPartnersCount(days));
      }


      @And("I verify the count of recent affiliates in db should be equal to count of recent affiliates in the UI {string}")
      public void iVerifyTheCountOfRecentAffiliatesInDbShouldBeEqualToCountOfRecentAffiliatesInTheUI(String days) throws SQLException, IOException {
            Assert.assertEquals(B2BDashboardPage.getInstance().getRecentAffiliatesCount(), Affiliate_App_DB.getRecentAffiliatesCount(days));
      }

      @And("I verify the count of recent corporates in db should be equal to count of recent corporates in the UI {string}")
      public void iVerifyTheCountOfRecentCorporatesInDbShouldBeEqualToCountOfRecentCorporatesInTheUI(String days) throws SQLException, IOException {
            Assert.assertEquals(B2BDashboardPage.getInstance().getRecentCorporatesCount(), Corporate_App_DB.getRecentCorporatesCount(days));
      }

      @And("I verify the recent agencies in DB should be equal to recent agencies in UI {string}")
      public void iVerifyTheRecentAgenciesInDBShouldBeEqualToRecentAgenciesInUI(String days) throws SQLException, IOException {
            Assert.assertEquals(B2BDashboardPage.getInstance().getRecentAgencies(), Agency_App_DB.getRecentAgencies(days));
      }


      @And("I verify the recent partners in DB should be equal to recent partners in UI {string}")
      public void iVerifyTheRecentPartnersInDBShouldBeEqualToRecentPartnersInUI(String days) throws SQLException, IOException {
            Assert.assertEquals(B2BDashboardPage.getInstance().getRecentPartners(), Partner_App_DB.getRecentPartners(days));
      }



      @And("I verify the recent affiliates in DB should be equal to recent affiliates in UI {string}")
      public void iVerifyTheRecentAffiliatesInDBShouldBeEqualToRecentAffiliatesInUI(String days) throws SQLException, IOException {
            Assert.assertEquals(B2BDashboardPage.getInstance().getRecentAffiliates(), Affiliate_App_DB.getRecentAffiliates(days));
      }

      @And("I verify the recent corporates in DB should be equal to recent corporates in UI {string}")
      public void iVerifyTheRecentCorporatesInDBShouldBeEqualToRecentCorporatesInUI(String days) throws SQLException, IOException {
            Assert.assertEquals(B2BDashboardPage.getInstance().getRecentCorporates(), Corporate_App_DB.getRecentCorporates(days));
      }

      @And("I click on the last month link in the dashboard page")
      public void iClickOnTheLastMonthLinkInTheDashboardPage() throws InterruptedException {
            Thread.sleep(3000);
            B2BDashboardPage.getInstance().clickOnLastMonthLink();
            Thread.sleep(3000);
      }

      @And("I get the agency name and I click on the agency name")
      public void iGetTheAgencyNameAndIClickOnTheAgencyName() {

      }

      @And("I get the agency name from details page and compare it with my agency name")
      public void iGetTheAgencyNameFromDetailsPageAndCompareItWithMyAgencyName() {
      }
}
