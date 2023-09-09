package StepDefinitions.CorporateApp;

import PageComponent.CorporateApp.CDashboardPage;
import PageComponent.CorporateApp.CRideBookingPage;
import PageComponent.CorporateApp.CRidesPage;
import PageComponent.CorporateApp.CSignInPage;
import Utilities.Utils;
import Web_Driver_Manager.DriverManager;
import io.cucumber.java.en.*;
import org.junit.Assert;

import javax.swing.*;
import java.io.IOException;

public class Admin_Role_Steps {
      @Given("I open corporate app website")
      public void i_open_corporate_app_website() throws IOException {
            DriverManager.getDriver().get(Utils.getGlobalValue("CORPORATE_APP_URL"));
      }
      @When("I enter username as {string}")
      public void i_enter_username_as(String email) {
            CSignInPage.getInstance().enterEmail(email);
      }
      @When("I enter password as {string}")
      public void i_enter_password_as(String password) {
            CSignInPage.getInstance().enterPassword(password);
      }
      @When("I click on sign in button")
      public void i_click_on_sign_in_button() throws InterruptedException {
            CSignInPage.getInstance().clickOnSigninBtn();
            Thread.sleep(10000);
      }

      @And("Verify admin can access corporate dashboard")
      public void verifyAdminCanAccessCorporateDashboard() {
            Assert.assertTrue("Dashboard link is not displayed", CDashboardPage.getInstance().getDashboardLinkText());
      }

      @And("Verify admin can access corporate rides")
      public void verifyAdminCanAccessCorporateRides() {
            Assert.assertTrue("Rides link is not displayed", CDashboardPage.getInstance().getRidesLinkText());
      }

      @And("Verify admin can access corporate employee")
      public void verifyAdminCanAccessCorporateEmployee() {
            Assert.assertTrue("Employee link is not displayed", CDashboardPage.getInstance().getEmployeeLinkText());
      }

      @And("Verify admin can access corporate settings")
      public void verifyAdminCanAccessCorporateSettings() {
            Assert.assertTrue("Settings link is not displayed", CDashboardPage.getInstance().getSettingsLinkText());
      }





      @And("I enter the from location as {string} and select from dropdown")
      public void iEnterTheFromLocationAsAndSelectFromDropdown(String arg0) {
      }

      @And("I enter to location as {string} and select from dropdown")
      public void iEnterToLocationAsAndSelectFromDropdown(String arg0) {
      }

      @And("I select date")
      public void iSelectDate() {
      }

      @And("I select time from dropdown")
      public void iSelectTimeFromDropdown() {
      }

      @And("I click on the choose vehicle button")
      public void iClickOnTheChooseVehicleButton() {
      }

      @When("I click on dashboard link")
      public void i_click_on_dashboard_link() {
            CDashboardPage.getInstance().clickOnDashboardLink();
      }
      @And("I click on last month link")
      public void iClickOnLastMonthLink() {
            CDashboardPage.getInstance().clickOnLastMonthLink();
      }
      @When("I verify admin can see paid rides details for last  month")
      public void i_verify_admin_can_see_paid_rides_details_for_last_month() {
            Assert.assertTrue("Paid Ride is not displaying", CDashboardPage.getInstance().getPaidRideText());
      }
      @And("I verify admin can see unpaid rides details for last month")
      public void iVerifyAdminCanSeeUnpaidRidesDetailsForLastMonth() {
            Assert.assertTrue("Unpaid Ride is not displaying", CDashboardPage.getInstance().getUnpaidRideText());
      }

      @And("I verify admin can see cancelled rides details for last month")
      public void iVerifyAdminCanSeeCancelledRidesDetailsForLastMonth() {
            Assert.assertTrue("Cancelled Ride is not displaying", CDashboardPage.getInstance().getCancelledRideText());
      }

      @And("I click on the current month link")
      public void iClickOnTheCurrentMonthLink() throws InterruptedException {
            CDashboardPage.getInstance().clickOnCurrentMonthLink();
            Thread.sleep(3000);
      }

      @And("I verify admin can see paid rides details for current  month")
      public void iVerifyAdminCanSeePaidRidesDetailsForCurrentMonth() {
            Assert.assertTrue("Paid Ride is not displaying", CDashboardPage.getInstance().getPaidRideText());
      }

      @And("I verify admin can see unpaid rides details for current month")
      public void iVerifyAdminCanSeeUnpaidRidesDetailsForCurrentMonth() {
            Assert.assertTrue("Unpaid Ride is not displaying", CDashboardPage.getInstance().getUnpaidRideText());
      }

      @And("I verify admin can see cancelled rides details for current month")
      public void iVerifyAdminCanSeeCancelledRidesDetailsForCurrentMonth() {
            Assert.assertTrue("Cancelled Ride is not displaying", CDashboardPage.getInstance().getCancelledRideText());
      }

      @And("I click on the next month button")
      public void iClickOnTheNextMonthButton() throws InterruptedException {
            CDashboardPage.getInstance().clickOnNextMonthLink();
            Thread.sleep(3000);
      }

      @And("I click on the custom button")
      public void iClickOnTheCustomButton() {
            CDashboardPage.getInstance().clickOnCustomDateLink();
      }

      @And("I enter from start date and to end date")
      public void iEnterFromStartDateAndToEndDate() {
            CDashboardPage.getInstance().enterCustomDates();
      }
      @And("I verify admin can see paid rides details for next  month")
      public void iVerifyAdminCanSeePaidRidesDetailsForNextMonth() {
            Assert.assertTrue("Paid Ride is not displaying", CDashboardPage.getInstance().getPaidRideText());
      }

      @And("I verify admin can see unpaid rides details for next month")
      public void iVerifyAdminCanSeeUnpaidRidesDetailsForNextMonth() {
            Assert.assertTrue("Unpaid Ride is not displaying", CDashboardPage.getInstance().getUnpaidRideText());
      }

      @And("I verify admin can see cancelled rides details for next month")
      public void iVerifyAdminCanSeeCancelledRidesDetailsForNextMonth() {
            Assert.assertTrue("Cancelled Ride is not displaying", CDashboardPage.getInstance().getCancelledRideText());
      }


      @And("I click on the rides sub menu")
      public void iClickOnTheRidesSubMenu() throws InterruptedException {
            CDashboardPage.getInstance().clickOnRidesMenu();
            Thread.sleep(5000);
      }

      @And("I enter ride id as {string}")
      public void iEnterRideIdAs(String ride_id) {
            CRidesPage.getInstance().enterRideID(ride_id);
      }
      @And("I click on search button")
      public void iClickOnSearchButton() throws InterruptedException {
            CRidesPage.getInstance().clickOnSearchBtn();
            Thread.sleep(3000);
      }
      @And("I verify admin can view the ride details")
      public void iVerifyAdminCanViewTheRideDetails() {
            Assert.assertEquals("139939", CRidesPage.getInstance().getRideId());
            Assert.assertEquals("Unpaid", CRidesPage.getInstance().getRideStatus());
            Assert.assertEquals("Emporium San Francisco 616 Divisadero St, San Francisco, CA 94117, USA", CRidesPage.getInstance().getFromLocation());
            Assert.assertEquals("San Francisco", CRidesPage.getInstance().getToLocation());
            Assert.assertEquals("Strategy Corp.", CRidesPage.getInstance().getCorpName());
            Assert.assertEquals("EDGARTEST163173-139939", CRidesPage.getInstance().getCorpRefName());
            Assert.assertEquals("lion3@gmail.com", CRidesPage.getInstance().getEmployeeEmail());
            Assert.assertEquals("USD 60.00", CRidesPage.getInstance().getRideAmount());
      }


      @And("I verify admin can view all ride details")
      public void iVerifyAdminCanViewAllRideDetails() {
            CRidesPage.getInstance().getAllRideIds();
      }


}
