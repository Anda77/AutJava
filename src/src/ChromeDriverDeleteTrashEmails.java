/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.contentspeed.automationtesting.Lider.src.src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @author andad
 */
public class ChromeDriverDeleteTrashEmails {

    /**
     * @param args the command line arguments
     */
    private static WebDriver driver;

    public static void main(String[] args) {
        try {

            Integer pozSpam = 0;
            Integer pozTrash = 0;
            Integer pozHelp = 0;
            Integer pozCompose = 0;
            Integer pozNewFolder = 0;

            System.setProperty("webdriver.chrome.driver", "D:\\Proiecte\\selenium-java-2.47.1\\selenium-2.47.1\\chromedriver_win32\\chromedriver.exe");
            System.setProperty("webdriver.chrome.logfile", "D:\\prjAutJava\\YahooLogin\\ChromeDriverDeleteSpam.log");
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

            options.setExperimentalOption("prefs", prefs);

            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            capabilities.setCapability(ChromeOptions.CAPABILITY, options);
            capabilities.setCapability(CapabilityType.SUPPORTS_APPLICATION_CACHE, true);
            capabilities.setCapability(CapabilityType.SUPPORTS_FINDING_BY_CSS, true);
            capabilities.setCapability(CapabilityType.SUPPORTS_LOCATION_CONTEXT, true);
            capabilities.setCapability(CapabilityType.SUPPORTS_ALERTS, true);
            capabilities.setCapability(CapabilityType.PLATFORM, "WIN10");

            driver = new ChromeDriver(capabilities);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.get("https://mail.yahoo.com");
            driver.manage().window().maximize();
            WebElement usernameElem = driver.findElement(By
                    .id("login-username"));
            usernameElem.sendKeys("andadeacu@yahoo.com");

            WebElement Next = driver.findElement(By
                    .name("signin"));
            Next.click();

            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            WebElement passwordElem = driver.findElement(By
                    .xpath("//input[@id='login-passwd']"));
            boolean selected = passwordElem.isSelected();

            CharSequence password = "";
            passwordElem.sendKeys(password);

            WebElement login = driver.findElement(By.id("login-signin"));

            login.click();
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

            driver.switchTo().activeElement();

            WebElement tooltipElem = driver.findElement(By
                    .xpath("//div[@class='Pos(r) M(0) TooltipContent']"));

            List<WebElement> childs = tooltipElem.findElements(By
                    .xpath("//ul/li"));

            for (int j = 0; j < childs.size(); j++) {

                WebElement spamElem = childs.get(j);
                /*
                 * System.out.println("ancorele " + j + " " + " tag " +
                 * childs.get(j).getTagName() + " " + childs.get(j).getText() +
                 * " " + childs.get(j).getAttribute("innerHTML"));
                 */
                if (spamElem.getText().startsWith(("Spam"))) {

                    pozSpam = j;

                }
                if (spamElem.getText().startsWith(("Help"))) {

                    pozHelp = j;

                }
                if (spamElem.getText().startsWith(("Compose"))) {

                    pozCompose = j;

                }
                if (spamElem.getText().startsWith(("New"))) {

                    pozNewFolder = j;

                }

                if (spamElem.getText().startsWith(("Trash"))) {
                    System.out.println(j + " Trash is " + spamElem.getTagName()
                            + " " + spamElem.getText());
                    pozTrash = j;
                    break;
                }

            }
            System.out.println(pozTrash);

            WebElement trashElem = childs.get(pozTrash);

            /*
             * System.out.println("trashElem " + trashElem.getTagName() +
             * " text " + trashElem.getText() + " class_atribute " +
             * trashElem.getAttribute("class") + " data_action " +
             * trashElem.getAttribute("data_action"));
             */
            WebElement trashFolderEmpty = trashElem
                    .findElement(By
                            .xpath("//a[@class='x-gap btn btn-trash']/span/span[@class='btn icon  icon-delete']"));

            /*
             * System.out.println("spamEmptyFolder " +
             * spamFolderEmpty.getTagName() + " text " +
             * spamFolderEmpty.getText() + " location " +
             * spamFolderEmpty.isEnabled());
             */
            trashFolderEmpty.click();

            int timeOut = 5;

            WebDriverWait wait = new WebDriverWait(driver, timeOut);

            driver.switchTo().alert();

            /* for Chrome is not working 
            WebElement modalPopUp = driver.findElement(By
                    .className("modal-hd yui3-widget-hd"));
            
            */

            WebElement btnDeleteSpamEmails = driver.findElement(By
                    .className("btn left right default"));

            /*
             * <button id="okayModalOverlay" class="btn left right default"
             * title="OK" role="button" data-action="ok">OK</button>
             */
            btnDeleteSpamEmails.click();

            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

            driver.switchTo().activeElement();

            // verify msg after you delete spam emails
            System.out.println(driver.getCurrentUrl());

            driver.quit();
        } catch (Exception ex) {

            ex.printStackTrace();
            driver.quit();
        }

    }

}
