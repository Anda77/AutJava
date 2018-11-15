package org.contentspeed.automationtesting.Lider;

import frameworkcontentspeed.Lider.CreareContNouPage;
import frameworkcontentspeed.Lider.DetaliiContPage;
import frameworkcontentspeed.Lider.LoginPage;
import frameworkcontentspeed.Lider.UtilsSelenium;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import testngsamplebs.Constants;
import org.openqa.selenium.Cookie;
import org.testng.annotations.AfterSuite;

//@Listeners(frameworkcontentspeed.Lider.DotTestListener)
public class CreareContNouTest {

    CreareContNouPage objRegisterPage;

    LoginPage objLoginPage;

    DetaliiContPage objDetaliiCont;

    String filename = "E:\\PrjAutJava\\BrowserStack\\TestNGSampleBS\\test\\configuration\\BrowserStack\\Windows10Chrome62Login.properties";

    private WebDriver driver;

    public String getValueOfCookieNamed(String name) {

        return driver.manage().getCookieNamed(name).getValue();
    }

    
    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        try {

            //driver = UtilsSelenium.readPropBS(filename);

        } catch (Exception ex) {
            System.out.println("exceptie setUp");
            //ex.printStackTrace();
        }
    }

    @Test(dataProvider="SearchProvider")
    @Parameters({"url", "email", "parola"})
    public void LoginCont(String url, String email, String parola) throws Exception {

        driver.get(url);
        driver.navigate().refresh();

        objLoginPage = new LoginPage(driver);
        objLoginPage.LoginUser(email, parola);

        objDetaliiCont = new DetaliiContPage(driver);

        String result = objDetaliiCont.findPanouMsg();

        Assert.assertEquals(Constants.ExpecteddResultDetaliicontPage, result);

        Set<Cookie> allcookies = driver.manage().getCookies();

        for (Cookie c : allcookies) {
            //System.out.println(c.getName() + " " + c.toString());

        }

        System.out.println("clientul logat: "
                + getValueOfCookieNamed("cs_customer_email"));

    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();

    }

}
