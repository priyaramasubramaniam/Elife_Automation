package StepDefinitions.AgencyApp;

import PageComponent.AgencyApp.ADashboardPage;
import PageComponent.AgencyApp.ARidesPage;
import PageComponent.AgencyApp.ASignInPage;
import Utilities.Utils;
import Web_Driver_Manager.DriverManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;

public class Check_Credit_Ride_On_Agency_Ride_Csv_Steps {



      @And("I get credit ride colum from the agency rides report")
      public void iGetCreditRideColumFromTheAgencyRidesReport() throws IOException {
            Utils.checkCreditRideInAgencyRides();
      }


}
