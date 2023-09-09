package Web_Driver_Manager;
import Utilities.Utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
import java.util.HashMap;

public class DriverManager {
      private static final Logger LOGGER = LogManager.getLogger(DriverManager.class);

      public static WebDriver driver = null;

      public static WebDriver getDriver() {
            return driver;
      }

      public static String downloadFilepath;


      //launchBrowser
      public static void launchBrowser()
      {
            ChromeOptions options = new ChromeOptions();
            HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
            chromePrefs.put("profile.default_content_settings.popups", 0);

            downloadFilepath = System.getProperty("user.dir");
            File file = new File(downloadFilepath);
            chromePrefs.put("download.default_directory", downloadFilepath);
            options.setExperimentalOption("prefs",chromePrefs);

            try {
                  switch (Utils.getGlobalValue("BROWSER"))
                  {
                        case "chrome":
                              WebDriverManager.chromedriver().setup();
                              LOGGER.info("Launching "+Utils.getGlobalValue("BROWSER")+ "...........");
                              driver = new ChromeDriver(options);
                              driver.manage().window().maximize();
                              break;
                        case "firefox":
                              WebDriverManager.firefoxdriver().setup();
                              LOGGER.info("Launching "+Utils.getGlobalValue("BROWSER")+ "...........");
                              driver = new FirefoxDriver();
                              driver.manage().window().maximize();
                              break;
                        case "ie":
                              WebDriverManager.iedriver().setup();
                              LOGGER.info("Launching "+Utils.getGlobalValue("BROWSER")+ "...........");
                              driver = new InternetExplorerDriver();
                              driver.manage().window().maximize();
                              break;
                        default:
                              WebDriverManager.chromedriver().setup();
                              LOGGER.info("Launching "+Utils.getGlobalValue("BROWSER")+ "...........");
                              driver = new ChromeDriver();
                              break;
                  }
            }
            catch (Exception e)
            {
                  e.printStackTrace();
            }

      }
}
