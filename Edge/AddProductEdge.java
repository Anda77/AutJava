/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edge;

import contentspeed.Constants;
import contentspeed.CosCumparaturi;
import contentspeed.ProdusCeaiIE11;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddProductEdge {

    static ProdusCeaiIE11 objProdus;

    static CosCumparaturi objCos;

    static WebDriver driver;

    @Test
    public void AdaugProdusLaCos() {

        try {

            objProdus = new ProdusCeaiIE11(driver);

            objProdus.Actions("Anda", "Cristea", "andadeacu11@yahoo.com", "0741010736", "observatii test      ", "Bucuresti", "Bucuresti", "strada Fericirii nr. 9");

           // objCos = new CosCumparaturi(driver);
            //  objCos.Completeaza("Anda", "Cristea", "andadeacu11@yahoo.com", "0741010736", "observatii test      ", "Bucuresti", "Bucuresti", "strada Fericirii nr. 9");
        } catch (WebDriverException ex) {

            ex.printStackTrace();
            //driver.quit();
        }
    }

    @BeforeClass
    public static void setUpClass() throws Exception {

        System.setProperty("webdriver.edge.driver", "D:\\Documentatie\\Selenium\\MicrosoftWebDriver16299.exe");
        driver = new EdgeDriver();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        driver.get(Constants.URLProdus);
    }

    @AfterClass
    public static void tearDownClass() throws Exception {

        driver.quit();
    }

  
}
