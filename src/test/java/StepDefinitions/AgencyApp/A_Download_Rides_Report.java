package StepDefinitions.AgencyApp;

import PageComponent.AgencyApp.ADashboardPage;
import PageComponent.AgencyApp.ARidesPage;
import Utilities.Utils;
import io.cucumber.java.en.And;

import java.io.IOException;

public class A_Download_Rides_Report {

      @And("I click on the agency rides sub menu")
      public void iClickOnTheAgencyRidesSubMenu() throws InterruptedException {
            Thread.sleep(3000);
            ADashboardPage.getInstance().clickOnAgencyRideSubmenu();
      }
      @And("I click on download report button")
      public void iClickOnDownloadReportButton() throws InterruptedException {
            Thread.sleep(3000);
            ARidesPage.getInstance().clickOnDownloadReportBtn();
            Thread.sleep(3000);
      }


      @And("I read data from downloaded report")
      public void iReadDataFromDownloadedReport() throws IOException, InterruptedException {
            Thread.sleep(3000);
            Utils.getDataFromCSV();
            Thread.sleep(3000);
      }
}
