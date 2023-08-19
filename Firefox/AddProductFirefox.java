/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Firefox;

import contentspeed.Constants;
import contentspeed.CosCumparaturi;
import contentspeed.ProdusCeai;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddProductFirefox {

    static ProdusCeai objProdus;

    static CosCumparaturi objCos;

    static WebDriver driver;

    @Test
    public void AdaugProdusLaCos() {

        try {

            objProdus = new ProdusCeai(driver);

            objProdus.Actions("Anda", "Cristea", "andadeacu11@yahoo.com", "0741010736", "observatii test      ", "Bucuresti", "Bucuresti", "strada Fericirii nr. 9");

         
        } catch (WebDriverException ex) {

            ex.printStackTrace();
            //driver.quit();
        }
    }

    @BeforeClass
    public static void setUpClass() throws Exception {

        System.setProperty("webdriver.gecko.driver", "D:\\Documentatie\\Selenium\\geckodriver\\geckodriver.exe");
        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        driver.manage().window().maximize();

        driver.get(Constants.URLProdus);
    }

    @AfterClass
    public static void tearDownClass() throws Exception {

        driver.quit();
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
