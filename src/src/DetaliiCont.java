/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.contentspeed.automationtesting.Lider.src.src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DetaliiCont extends AbstractPage {

    By headerPanou = By.xpath("//*[@id='middle-column']/h1");

    public DetaliiCont(WebDriver driver) {
        super(driver);
    }

    public String findPanouMsg() {
        return driver.findElement(headerPanou).getText();

    }

}
