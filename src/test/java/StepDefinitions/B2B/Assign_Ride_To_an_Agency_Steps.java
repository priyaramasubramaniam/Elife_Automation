package StepDefinitions.B2B;

import PageComponent.B2B.B2BApplicationSelectionPage;
import PageComponent.B2B.B2BAssignRidePage;
import PageComponent.B2B.B2BSearchAgencyPage;
import PageComponent.Backoffice.BackOfficeNavBarPage;
import PageComponent.Backoffice.BackofficeCreateNewRidePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Assign_Ride_To_an_Agency_Steps {
      public String ride_id;
      @Given("I click on Backoffice link")
      public void iClickOnBackofficeLink() {
            B2BApplicationSelectionPage.getInstance().clickOnBackofficeLink();
      }

      @And("I click on Create new ride on Backoffice nav bar")
      public void iClickOnCreateNewRideOnBackofficeNavBar() {
            BackOfficeNavBarPage.getInstance().clickOnCreateNewRideLink();
      }

      @And("I enter partner as {string}")
      public void iEnterPartnerAs(String partner_name) {
            BackofficeCreateNewRidePage.getInstance().enterPartnerName(partner_name);
      }

      @And("I select partner name from dropdown")
      public void iSelectPartnerNameFromDropdown() {
            BackofficeCreateNewRidePage.getInstance().clickOnPartnerNameDD();
      }

      @And("I enter Reference as {string}")
      public void iEnterReferenceAs(String ref_name) {
            BackofficeCreateNewRidePage.getInstance().enterRideReference(ref_name);
      }

      @And("I enter amount as {string}")
      public void iEnterAmountAs(String ride_amount) {
            BackofficeCreateNewRidePage.getInstance().enterRideAmount(ride_amount);
      }

      @And("I enter pickup location as {string}")
      public void iEnterPickupLocationAs(String pickup_location) {
            BackofficeCreateNewRidePage.getInstance().enterPickupLocation(pickup_location);
      }

      @And("I select pickup location from dropdown")
      public void iSelectPickupLocationFromDropdown() throws InterruptedException {
            BackofficeCreateNewRidePage.getInstance().clickOnPickupLocationDD();
      }

      @And("I enter Date as {string}")
      public void iEnterDateAs(String date) {
            BackofficeCreateNewRidePage.getInstance().enterFromDate(date);
      }

      @And("I enter time hour as {string} and time minutes as {string}")
      public void iEnterTimeHourAsAndTimeMinutesAs(String from_hour, String from_minute) throws InterruptedException {
            BackofficeCreateNewRidePage.getInstance().enterFromHour(from_hour);
            Thread.sleep(3000);
            BackofficeCreateNewRidePage.getInstance().enterFromMinute(from_minute);
      }

      @And("I enter dropoff location as {string}")
      public void iEnterDropoffLocationAs(String dropoff_location) {
            BackofficeCreateNewRidePage.getInstance().enterDropoffLocation(dropoff_location);
      }

      @And("I select dropoff location from dropdown")
      public void iSelectDropoffLocationFromDropdown() {
            BackofficeCreateNewRidePage.getInstance().selectDropofflocationDD();
      }

      @And("I enter passenger count as {string}")
      public void iEnterPassengerCountAs(String passenger_count) {
            BackofficeCreateNewRidePage.getInstance().enterPassengerCount(passenger_count);
      }

      @And("I select vehicle type")
      public void iSelectVehicleType() {
            BackofficeCreateNewRidePage.getInstance().clickOnVehicleDD();
            BackofficeCreateNewRidePage.getInstance().clickOnVehicleName();
            BackofficeCreateNewRidePage.getInstance().clickOnVehicleSedan();
      }

      @And("I enter firstname as {string}")
      public void iEnterFirstnameAs(String first_name) {
            BackofficeCreateNewRidePage.getInstance().enterFirstname(first_name);
      }

      @And("I enter lastname as {string}")
      public void iEnterLastnameAs(String last_name) {
            BackofficeCreateNewRidePage.getInstance().enterLastname(last_name);
      }

      @And("I enter email as {string}")
      public void iEnterEmailAs(String email) {
            BackofficeCreateNewRidePage.getInstance().enterEmail(email);
      }

      @And("I enter mobile number as {string}")
      public void iEnterMobileNumberAs(String mobile_number) {
            BackofficeCreateNewRidePage.getInstance().enterMobileNumber(mobile_number);
      }

      @And("I click on save customer")
      public void iClickOnSaveCustomer() {
            BackofficeCreateNewRidePage.getInstance().clickOnSaveCustomerBtn();
      }

      @And("I click on save button")
      public void iClickOnSaveButton() {
            BackofficeCreateNewRidePage.getInstance().clickOnSaveBtn();
      }

      @And("I get Ride id from the page")
      public void iGetRideIdFromThePage() {
             ride_id = BackofficeCreateNewRidePage.getInstance().getRideID();
      }

//      @And("I enter agency name as {string}")
//      public void iEnterAgencyNameAs(String agency_name) {
//            B2BSearchAgencyPage.getInstance().enterAgencyName(agency_name);
//      }

      @And("I click on the agency id link")
      public void iClickOnTheAgencyIdLink() {
            B2BSearchAgencyPage.getInstance().clickOnAgencyId();
      }

      @And("I click on assign ride link")
      public void iClickOnAssignRideLink() {
            B2BAssignRidePage.getInstance().clickOnAssignRideLink();
      }

      @And("I enter ride id")
      public void iEnterRideId() {
            B2BAssignRidePage.getInstance().enterRideId(ride_id);
      }

      @And("I click on Search button in the assign ride page")
      public void iClickOnSearchButtonInTheAssignRidePage() {
            B2BAssignRidePage.getInstance().clickOnSearchBtnInAssignRidePage();
      }

      @And("I click on assign ride button")
      public void iClickOnAssignRideButton() {
            B2BAssignRidePage.getInstance().clickOnAssignRideBtn();
      }

      @And("I enter {string} in the input field")
      public void iEnterInTheInputField(String confirm_msg) {
            B2BAssignRidePage.getInstance().enterConfirmationText(confirm_msg);
      }

      @And("I click on confirm button")
      public void iClickOnConfirmButton() {
            B2BAssignRidePage.getInstance().clickOnConfirmBtn();
      }
}
