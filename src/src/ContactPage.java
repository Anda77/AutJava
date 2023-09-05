/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.contentspeed.automationtesting.Lider.org.contentspeed.automationtesting.Lider.src;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage extends AbstractPage {

    By linkContactPage = By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[2]/ul/li[5]/a");
    By contactTitlu = By.xpath("//*[@id=\"content\"]/div/div/div[1]/h2");
    By denumireSocietate = By.xpath("//*[@id=\"middle-column\"]/section/p[17]/span/span[2]");
    //*[@id="middle-column"]/section/p[17]/span/span[2]
    By CUI = By.xpath("//*[@id=\"middle-column\"]/section/p[17]/span/span[3]/span[3]");

    public ContactPage(WebDriver driver) {
        super(driver);
    }

    // as avrea nevoie de un parametru
    public void VerificaDetaliiComerciale(String denumireSocietateparam, String CUIparam) {
        System.out.println(driver.findElement(denumireSocietate).getText().trim().length());
        Assert.assertEquals(driver.findElement(denumireSocietate).getText().trim(), denumireSocietateparam);
        Assert.assertEquals(driver.findElement(CUI).getText().trim(), CUIparam);
    }

    public void VerificaLink() {

        driver.findElement(linkContactPage).click();
        Assert.assertEquals(driver.findElement(linkContactPage).getText().trim(), "Contact");

    }

    public void run(String denumireSocietateparam, String CUIparam) {
        VerificaLink();
        VerificaDetaliiComerciale(denumireSocietateparam, CUIparam);

    }

}
