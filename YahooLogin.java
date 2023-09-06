package org.contentspeed.automationtesting.Lider;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class YahooLogin {

    public static WebDriver driver = null;

    @Given("Yahoo url opened$")
    public void url_opened() {
        System.setProperty(
                "webdriver.chrome.driver",
                "D:\\Proiecte\\selenium-java-2.47.1\\selenium-2.47.1\\chromedriver_win32\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://mail.yahoo.com");
        driver.manage().window().maximize();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("test-type");
        options.addArguments("--start-maximized");
        options.addArguments("--disable-web-security");
        options.addArguments("--no-proxy-server");
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-plug-in");
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
    }

    @Then("^fill the user id$")
    public void enter_user_id_and_click_next() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='login-username']")).sendKeys("andadeacu@yahoo.com");
        driver.findElement(By.xpath("//*[@id='login-signin']")).click();
        Thread.sleep(2000);
    }

    @Then("^fill the password$")
    public void enter_password() {
        driver.findElement(By.xpath("//*[@name='password']")).sendKeys("marisel#~~~25");
    }

    @Then("^click on Login$")
    public void click_login() throws InterruptedException {
        driver.findElement(By.xpath("//*[@name='verifyPassword']")).click();
        Thread.sleep(6000);
    }

}
