/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Firefox;

import org.contentspeed.automationtesting.Lider.src.src.Constants;
import contentspeed.ContactPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * @author andad
 */
public class ContactPageFirefox {

    static ContactPage objContactPage;
    static WebDriver driver;

    public ContactPageFirefox() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {

        System.setProperty("webdriver.gecko.driver", "D:\\Documentatie\\Selenium\\geckodriver\\geckodriver.exe");
        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.manage().window().maximize();

        driver.get(Constants.URLRoot);
    }

    @AfterClass
    public static void tearDownClass() throws Exception {

        driver.quit();
    }

    @Test
    public void verifyContactPage() {

        try {

            objContactPage = new ContactPage(driver);
            objContactPage.run("SC HEEEY INTERNATIONAL SRL", "36991028");

        } catch (WebDriverException ex) {

            ex.printStackTrace();
            //driver.quit();
        }

    }

}
