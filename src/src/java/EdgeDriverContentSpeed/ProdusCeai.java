/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contentspeededgedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class ProdusCeai {

    WebDriver driver;

    By produsArmonia = By.xpath("//*[@id=\"product_addToCart\"]");
    By finalizeazaComanda = By.xpath("//*[@id='popup-roo']/div[2]/div/a[3]");
    By cosComanda = By.xpath("//*[@id=\"header\"]/div[2]/div/div[1]/div[4]/a/span");

    public ProdusCeai(WebDriver driver) {
        this.driver = driver;
    }

    void clickAdaugaCos() {

        driver.findElement(produsArmonia).click();

    }

    void clickFinalizeaza() {
        try {

            String MainWindow = driver.getWindowHandle();

            // To handle all new opened window.				
            Set<String> s1 = driver.getWindowHandles();
            Iterator<String> i1 = s1.iterator();

            while (i1.hasNext()) {
                String ChildWindow = i1.next();

                driver.switchTo().window(ChildWindow);

                driver.findElement(By.partialLinkText("Finalizeaza comanda")).click();

            }
        } catch (WebDriverException ex) {
            ex.printStackTrace();
            //driver.quit();
        }

    }

    void CosClick() {
        //driver.findElement(cosComanda).click();

        Actions actions = new Actions(driver);
        actions.click(driver.findElement(cosComanda)).perform();
        String MainWindow = driver.getWindowHandle();

        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();

        //System.out.println(s1.size());

        while (i1.hasNext()) {
            String ChildWindow = i1.next();


            driver.switchTo().window(ChildWindow);

            driver.findElement(By.partialLinkText("Vezi cosul")).click();

        }
    }

    void Actions() {
        clickAdaugaCos();
        clickFinalizeaza();
        CosClick();
    }

}
