package StepDefinitions.PartnerApp;

import Utilities.Utils;
import Web_Driver_Manager.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Common_Step_Definitions {

      private static String scenarioName = null;

      public static String getScenarioName() {
            return scenarioName;
      }

      private static final Logger LOGGER = LogManager.getLogger(Common_Step_Definitions.class);

      @Before
      public void beforeScenario(Scenario scenario) {
            LOGGER.info("Execution started......");
            try {
                  scenarioName = scenario.getName();
                  LOGGER.info("Checking the driver is null or not.........");
                  DriverManager.launchBrowser();
                  Utils.initWebElements();
            } catch (Exception e) {
                  e.printStackTrace();
            }


            /* If you want to run entire feature in one browser use this
            LOGGER.info("Execution started......");
            try {
                  LOGGER.info("Checking the driver is null or not.........");
                  if(driver == null)
                  {
                        DriverManager.launchBrowser();
                        Utils.initWebElements();
                  }

            }catch (Exception e)
            {
                  e.printStackTrace();
            }
      } */

      }

      @After
      public void afterScenario()
      {
            DriverManager.getDriver().quit();
      }
}
