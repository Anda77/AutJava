/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contentspeed;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class RunSiteTest {

    static WebDriver driver;

    static ProdusCeai objProdus;

    static CosCumparaturi objCos;

    public static void main(String[] args) {

        try {

            System.setProperty("webdriver.chrome.driver", "D:\\Documentatie\\Selenium\\ChromeDriver\\chromedriver234.exe");

            ChromeOptions optionsChrome = new ChromeOptions();

            optionsChrome.addArguments("--start-maximized");

            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("browser", "Chrome");
            caps.setCapability("chrome.switches", "--start-maximized");

            caps.setCapability("os", "Windows");
            caps.setCapability("os_version", "10");
            caps.setCapability("resolution", "1366x768");
            caps.setCapability(ChromeOptions.CAPABILITY, optionsChrome);

            driver = new ChromeDriver(caps);

            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            driver.get(Constants.URLProdus);

            objProdus = new ProdusCeai(driver);
            

            objProdus.Actions("Anda", "Cristea", "andadeacu2@yahoo.com", "0741010736", "Bucuresti", "Bucuresti", "strada Fericirii nr. 9", "observatii test      ");

            //driver.quit();

        } catch (WebDriverException ex) {

            ex.printStackTrace();

            //driver.quit();

        }
    }
}
