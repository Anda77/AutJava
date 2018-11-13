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

public class ContentSpeedTest {

    static WebDriver driver;

    static ProdusCeai objProdus;

    static CosCumparaturi objCos;

    public static void main(String[] args) {

        try {
            System.setProperty("webdriver.chrome.driver", "D:\\Proiecte\\selenium-java-2.47.1\\selenium-2.47.1\\chromedriver_win32\\chromedriver.exe");

            ChromeOptions options = new ChromeOptions();

            options.addArguments("--start-maximized");
            
            driver = new ChromeDriver(options);

        
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            driver.get("https://www.armonianaturii.ro/ceaiuri-naturale/ceaiuri-medicinale-simple/ceai-conuri-de-hamei-50g-plafar-plaf-00025.html");

            objProdus = new ProdusCeai(driver);

            objProdus.Actions();

            objCos = new CosCumparaturi(driver);

            objCos.Completeaza("Anda", "Cristea", "andadeacu2@yahoo.com", "0741010736", "observatii test      ", "Bucuresti", "Bucuresti", "strada Fericirii nr. 9");

            driver.quit();
        } catch (WebDriverException ex) {

            ex.printStackTrace();
            driver.quit();
        }

    }

}
