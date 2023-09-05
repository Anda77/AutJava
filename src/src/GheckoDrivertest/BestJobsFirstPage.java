/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gheckodrivertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.logging.*;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.logging.Level;

/**
 * @author andad
 */
public class BestJobsFirstPage {

    private static WebDriver driver;

    public static void main(String[] args) // TODO code application logic here
    {
        try {
            //System.setProperty("webdriver.gecko.driver", "D:\\Documentatie\\Selenium\\geckodriver\\geckodriver.exe");
            System.setProperty("webdriver.gecko.driver", "D:\\gdrwrapper.bat");
            System.setProperty("webdriver.gecko.logfile", "D:\\geckodriver.log");
            WebDriver driver = new FirefoxDriver();

            DesiredCapabilities capabilities = DesiredCapabilities.firefox();

            LoggingPreferences logPrefs = new LoggingPreferences();
            logPrefs.enable(LogType.BROWSER, Level.ALL);
            logPrefs.enable(LogType.CLIENT, Level.ALL);
            logPrefs.enable(LogType.DRIVER, Level.ALL);
            logPrefs.enable(LogType.SERVER, Level.ALL);
            logPrefs.enable(LogType.PERFORMANCE, Level.ALL);

            capabilities.setCapability(CapabilityType.LOGGING_PREFS,
                    logPrefs);

            driver.get("http:\\bestjobs.eu");

            WebElement btnEnter = driver.findElement(By.xpath("html/body/div[1]/div/div/div/div/div[2]/a/button"));
            btnEnter.click();
            //driver.manage().timeouts().wait(30);
            System.out.println(driver.getTitle());
            /**
             * <li
             * class="sign-up-switch amplitude" data - key = "sign_up_email_started"
             * > <a
             * href = "/en/register" > Register <  / a
             * > < / li
             * >
             */
            // WebElement liSignIn = driver.findElement(By.className("sign-up-switch amplitude"));
            By btnRegister = By.linkText("Register");
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.presenceOfElementLocated(btnRegister));

            WebElement anchSignIn = driver.findElement(By.linkText("Register"));
            anchSignIn.click();
            //driver.manage().timeouts().wait(30);
            Logs logs = driver.manage().logs();
            LogEntries logEntries = logs.get(LogType.BROWSER);

            for (LogEntry logEntry : logEntries) {
                System.out.println("browser entry: " + logEntry.getMessage());
            }

            //driver.quit();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
