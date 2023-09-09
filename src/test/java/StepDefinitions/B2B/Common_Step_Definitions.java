package StepDefinitions.B2B;

import Utilities.Utils;
import Web_Driver_Manager.DriverManager;
import com.sun.org.apache.bcel.internal.generic.LOOKUPSWITCH;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.sql.Driver;

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
