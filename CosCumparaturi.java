/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contentspeed;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CosCumparaturi {

    WebDriver driver;

    By prenume = By.xpath("//*[@id=\"firstname\"]");
    By telefon = By.xpath("//*[@id=\"phone\"]");
    By nume = By.xpath("//*[@id=\"lastname\"]");

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

    By comandaFinalizata = By.xpath("//*[@id='middle-column']/h1");

    public CosCumparaturi(WebDriver driver) {
        this.driver = driver;
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
        driver.findElement(oras).isEnabled();
        driver.findElement(oras).sendKeys(oras1);
        driver.findElement(adresa).sendKeys(adresa1);
    }

    public void findclikFinalizeaza() {

        WebElement elementtobeClicked = driver.findElement(btnFinalizeaza);

        JavascriptExecutor jsDriver = (JavascriptExecutor) driver;
        jsDriver.executeScript("arguments[0].scrollIntoView(false);", elementtobeClicked);

        jsDriver.executeScript("arguments[0].click();", elementtobeClicked);

    }

    public void Completeaza(String prenume, String nume, String email, String telefon, String observatii, String judet, String oras, String adresa) {
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
        
      
        
        Assert.assertEquals("Comanda finalizata", driver.findElement(comandaFinalizata).getText());

        System.out.println(driver.findElement(comandaFinalizata).getText());

    }

}
