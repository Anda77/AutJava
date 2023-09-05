package org.contentspeed.automationtesting.Lider.src.src;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class ProdusCeaiIE11 extends AbstractPage {

    By produsArmonia = By.xpath("//*[@id=\"product_addToCart\"]");
    By finalizeazaComanda = By.xpath("//*[@id='popup-root']/div[2]/div/a[3]");
    By cosComanda = By.xpath("//*[@id=\"header\"]/div[2]/div/div[1]/div[4]/a/span[2]");

    By cookieDIV = By.xpath("//*[@id='cookie-bar']");

    By acordCookie = By.xpath("//*[@id='cookie-bar']");

    By prenume = By.xpath("//*[@id=\"cart-element-4\"]");
    By telefon = By.xpath("//*[@id=\"phone\"]");


    By nume = By.xpath("//*[@id='cart-element-5']");

    By email = By.xpath("//*[@id=\"customer\"]/div[2]/div[1]/input");

    By persoanaFizica = By.xpath("//*[@id='customer-type']/div/label[1]/span");

    By delivery = By.xpath("//*[@id='delivery']/label/span");

    By termeni = By.xpath("//*[@id=\"terms\"]");

    By btnFinalizeaza = By.xpath("//*[@id='finish-order']");

    By observatii = By.xpath("//*[@id='cartForm']/div/div[6]/div[3]/div/textarea");

    By modPlata = By.xpath("//*[@id=\"ui-id-3-button\"]/span[2]");

    By judet = By.xpath("//*[@id='county']");

    By oras = By.xpath("//*[@id='city']");

    By adresa = By.xpath("//*[@id=\"streetaddress\"]");

    By comandaFinalizata = By.xpath("//*[@id=\"middle-column\"]/h1");

    By errorDuplicateEmail = By.xpath("//*[@id='customer']/div[3]");

    public ProdusCeaiIE11(WebDriver driver) {
        super(driver);
    }

    void CompleteazaPrenume(String param) {

        driver.findElement(prenume).sendKeys(param);

    }

    void CompleteazaObservatii(String param) {

        driver.findElement(observatii).sendKeys(param);

    }

    void selectPlata(String param) {
        driver.findElement(modPlata).sendKeys(param);
    }

    void CompleteazaTelefon(String param) {

        driver.findElement(telefon).sendKeys(param);

    }

    void CompleteazaEmail(String param) {

        driver.findElement(email).sendKeys(param);

    }

    void CompleteazaNume(String param) {

        driver.findElement(nume).sendKeys(param);

    }

    void findPF() {

        driver.findElement(persoanaFizica).click();

    }

    void findDelivery() {

        driver.findElement(delivery).click();

    }

    void findClickTermeni() {

        driver.findElement(termeni).sendKeys(Keys.SPACE);

    }

    public void CompleteazaAdresa(String judet1, String oras1, String adresa1) {
        driver.findElement(judet).sendKeys(judet1);
        //driver.findElement(oras).isEnabled(); sometimes don't work
        driver.findElement(oras).sendKeys(Keys.ENTER);
        driver.findElement(oras).sendKeys(oras1);
        driver.findElement(adresa).sendKeys(adresa1);
    }

    public void findclikFinalizeaza() {

        WebElement elementtobeClicked = driver.findElement(btnFinalizeaza);

        JavascriptExecutor jsDriver = (JavascriptExecutor) driver;
        jsDriver.executeScript("arguments[0].scrollIntoView(false);", elementtobeClicked);

        jsDriver.executeScript("arguments[0].click();", elementtobeClicked);

    }

    boolean ExistsErrorEmail() {
        boolean result = false;
        try {

            WebElement divExistsEmail = driver.findElement(errorDuplicateEmail);
            System.out.println(divExistsEmail.getText());
            result = divExistsEmail.isDisplayed();

        } catch (Exception ex) {

            ex.getMessage();
            return false;

        }
        return result;
    }

    public void Completeaza(String prenume, String nume, String email, String telefon, String observatii, String judet, String oras, String adresa) {

        try {

            JavascriptExecutor js = ((JavascriptExecutor) driver);
            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
            CompleteazaPrenume(prenume);
            CompleteazaNume(nume);
            CompleteazaEmail(email);
            CompleteazaTelefon(telefon);
            CompleteazaObservatii(observatii);
            CompleteazaAdresa(judet, oras, adresa);
            //selectPlata(plata);
            //findPF();
            //findDelivery();
            findClickTermeni();
            findclikFinalizeaza();

            if (!ExistsErrorEmail()) {

                System.out.println(driver.findElement(comandaFinalizata).getText());

                Assert.assertEquals("Comanda finalizata", driver.findElement(comandaFinalizata).getText());

                //System.out.println("check if message is displayed: " + driver.findElement(comandaFinalizata).isDisplayed());
            }

        } catch (WebDriverException ex) {
            ex.getMessage();
            driver.quit();

        }
    }

    public void clickAdaugaCos() {

        WebElement elementtobeClicked = driver.findElement(produsArmonia);

        JavascriptExecutor jsDriver = (JavascriptExecutor) driver;
        jsDriver.executeScript("arguments[0].scrollIntoView(false);", elementtobeClicked);

        jsDriver.executeScript("arguments[0].click();", elementtobeClicked);

    }

    public void clickFinalizeaza() {
        try {

            String MainWindow = driver.getWindowHandle();

            System.out.println(MainWindow);

            driver.switchTo().window(MainWindow);

            driver.findElement(By.partialLinkText("Finalizeaza comanda")).click();
            driver.switchTo().defaultContent();
        } catch (WebDriverException ex) {
            System.out.println("Exceptie");
            //ex.printStackTrace();
            //driver.quit();
        }

    }

    void closeCookie() {
        String textDIV = driver.findElement(cookieDIV).getText();
        String cookie = driver.getWindowHandle();

        driver.switchTo().window(cookie);

        driver.findElement(By.partialLinkText("Sunt de acord")).click();

        /*System.out.println(textDIV); */
        driver.switchTo().defaultContent();
    }

    void CosClick() {

        Actions actions = new Actions(driver);
        actions.click(driver.findElement(cosComanda)).perform();

    }

    public void Actions(String prenume, String nume, String email, String telefon, String observatii, String judet, String oras, String adresa) {
        //closeCookie();
        clickAdaugaCos();
        clickFinalizeaza();

        CompleteazaPrenume(prenume);
        CompleteazaNume(nume);
        CompleteazaEmail(email);
        CompleteazaTelefon(telefon);
        CompleteazaObservatii(observatii);
        CompleteazaAdresa(judet, oras, adresa);
        //selectPlata(plata);
        //findPF();
        //findDelivery();
        findClickTermeni();
        findclikFinalizeaza();

        if (!ExistsErrorEmail()) {

            System.out.println(driver.findElement(comandaFinalizata).getText());

            Assert.assertEquals("Comanda finalizata", driver.findElement(comandaFinalizata).getText());

            //System.out.println("check if message is displayed: " + driver.findElement(comandaFinalizata).isDisplayed());
        }
        //CosClick();
    }

}
