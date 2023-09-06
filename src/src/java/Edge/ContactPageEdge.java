/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edge;

import org.contentspeed.automationtesting.Lider.org.contentspeed.automationtesting.Lider.src.Constants;
import contentspeed.ContactPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * @author andad
 */
public class ContactPageEdge {

    static ContactPage objContactPage;
    static WebDriver driver;

    public ContactPageEdge() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {

        System.setProperty("webdriver.edge.driver", "D:\\Documentatie\\Selenium\\MicrosoftWebDriver16299.exe");
        driver = new EdgeDriver();

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
