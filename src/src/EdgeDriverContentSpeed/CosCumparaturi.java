/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contentspeededgedriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CosCumparaturi {

    WebDriver driver;

    By prenume = By.xpath("//*[@id=\"product_addToCart\"]");
    By telefon = By.xpath("//*[@id='popup-roo']/div[2]/div/a[3]");
    By nume = By.xpath("//*[@id='popup-roo']/div[2]/div/a[3]");

    By persoanaFizica = By.xpath(null);

    By delivery = By.xpath("//*[@id='delivery']/label/span");

    By termeni = By.xpath("//*[@id='cartForm']/div/div[7]/div[2]/div/label");

    By btnFinalizeaza = By.xpath("//*[@id='finish-order']");

    By observatii = By.xpath("//*[@id='cartForm']/div/div[6]/div[3]/div/textarea");

    By modPlata = By.xpath("//*[@id=\"ui-id-3-button\"]/span[2]");

    public CosCumparaturi(WebDriver driver) {
        this.driver = driver;
    }

    public void findPrenume(String param) {

        driver.findElement(prenume).sendKeys(param);

    }

    public void findObservatii(String param) {

        driver.findElement(observatii).sendKeys(param);

    }

    public void selectPlata(String param) {
        driver.findElement(modPlata).sendKeys(param);
    }

    public void findtelefon(String param) {

        driver.findElement(telefon).sendKeys(param);

    }

    public void findNume(String param) {

        driver.findElement(nume).sendKeys(param);

    }

    public void findPF() {

        driver.findElement(persoanaFizica).click();

    }

    public void findDelivery() {

        driver.findElement(delivery).click();

    }

    public void findTermeni() {

        driver.findElement(termeni).click();

    }

    public void findclikFinalizeaza() {

        driver.findElement(btnFinalizeaza).click();

    }

}
