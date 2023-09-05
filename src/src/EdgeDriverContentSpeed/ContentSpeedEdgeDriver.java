/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contentspeededgedriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/**
 * @author andad
 */
public class ContentSpeedEdgeDriver {

    static WebDriver driver;

    static ProdusCeai objProdus;

    public static void main(String[] args) {
        try {
            System.setProperty("webdriver.edge.driver",
                    "D:\\Documentatie\\Selenium\\MicrosoftWebDriver.exe");

            DesiredCapabilities capabilities = DesiredCapabilities.edge();

            capabilities.setCapability(
                    CapabilityType.SUPPORTS_APPLICATION_CACHE, false);

            LoggingPreferences logPrefs = new LoggingPreferences();
            logPrefs.enable(LogType.BROWSER, Level.ALL);
            logPrefs.enable(LogType.CLIENT, Level.ALL);
            logPrefs.enable(LogType.DRIVER, Level.ALL);
            logPrefs.enable(LogType.SERVER, Level.ALL);
            logPrefs.enable(LogType.PERFORMANCE, Level.ALL);

            capabilities.setCapability(CapabilityType.LOGGING_PREFS,
                    logPrefs);

            capabilities.setCapability("browser", "Edge");
            capabilities.setCapability("acceptSslCerts", true);
            capabilities.setCapability(CapabilityType.PAGE_LOAD_STRATEGY,
                    "eager");

            capabilities.setCapability("os", "Windows");
            capabilities.setCapability("os_version", "10");

            driver = new EdgeDriver(capabilities);

            driver.manage().window().maximize();
            //  driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            driver.get("https://www.armonianaturii.ro/ceaiuri-naturale/ceaiuri-medicinale-simple/ceai-conuri-de-hamei-50g-plafar-plaf-00025.html");

            objProdus = new ProdusCeai(driver);

            objProdus.Actions();

            driver.quit();
        } catch (WebDriverException ex) {

            ex.printStackTrace();
            driver.quit();
        }
    }

}
