/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.contentspeed.automationtesting.Lider.org.contentspeed.automationtesting.Lider.src;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreareContNou extends AbstractPage {

    By linkRegister = By.xpath("//*[@id='login-link']/span");

    By doamnaCheck = By.xpath("//*[@id=\"register\"]/form/div[1]/div/label[1]/span");

    By domnulCheck = By.xpath("//*[@id=\"register\"]/form/div[1]/div/label[3]");

    By domnnisoaraCheck = By.xpath("//*[@id=\"register\"]/form/div[1]/div/label[2]/span");

    By email = By.xpath("//*[@id=\"register\"]/form/div[4]/div/input");
    By nume = By.xpath("//*[@id=\"register\"]/form/div[3]/div/input");

    By password = By.xpath("//*[@id='register']/form/div[5]/div/input");

    By prenume = By.xpath("//*[@id='register']/form/div[2]/div/input"); // am adaugat 1 dupa input astfel incat sa crape testul

    By confirmParola = By.xpath("//*[@id='register']/form/div[6]/div/input");

    By checkTermeniConditii = By.xpath("//*[@id='register']/form/div[7]/label[2]");

    By btnRegister = By.xpath("//*[@id='register']/form/div[8]/button");

    public CreareContNou(WebDriver driver) {
        super(driver);
    }

    void ClickRegister() {
        driver.findElement(linkRegister).click();

        String MainWindow = driver.getWindowHandle();

        System.out.println(MainWindow);

        driver.switchTo().window(MainWindow);

        driver.findElement(By.partialLinkText("Finalizeaza comanda")).click();
        driver.switchTo().defaultContent();
    }

    void Selectezapelativ(String apelativ) {

        switch (apelativ) {
            case "Doamna":
                driver.findElement(doamnaCheck).click();
                break;
            case "Domnul":
                driver.findElement(domnulCheck).click();
                break;
            case "Domnisoara":
                driver.findElement(domnnisoaraCheck).click();
                break;
        }

    }

    void CompletezaPrenume(String param) {

        driver.findElement(prenume).sendKeys(param);

    }

    void CompletezaNume(String param) {

        driver.findElement(nume).sendKeys(param);

    }

    void CompletezaEmail(String param) {

        driver.findElement(email).sendKeys(param);

    }

    void CompletezaParola(String param) {

        driver.findElement(password).sendKeys(param);

    }

    void ConfirmParola(String param) {

        driver.findElement(confirmParola).sendKeys(param);

    }

    void CheckTermeniConditii() {

        driver.findElement(checkTermeniConditii).click();
    }

    void clickRegister() {
        driver.findElement(btnRegister).click();
    }

    public void CreareContNou(String apelativ, String nume, String prenume, String email, String parola, String confirmParola) {
        //ClickRegister();
        Selectezapelativ(apelativ);
        CompletezaPrenume(prenume);
        CompletezaNume(nume);
        CompletezaEmail(email);
        CompletezaParola(parola);
        ConfirmParola(confirmParola);
        CheckTermeniConditii();
        clickRegister();

    }

}
