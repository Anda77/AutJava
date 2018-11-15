package org.contentspeed.automationtesting.Lider;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import databaseaccesscontentspeed.UtilsDatabase;
import frameworkcontentspeed.Lider.ComandaFinalizataPage;
import frameworkcontentspeed.Lider.CompletezAdresaMailsiParola;
import frameworkcontentspeed.Lider.DetaliiContPage;
import org.testng.annotations.Test;
import frameworkcontentspeed.Lider.ProdusGeneric;
import frameworkcontentspeed.Lider.IncheieComandaPage;
import frameworkcontentspeed.Lider.UtilsSelenium;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import testngsamplebs.Constants;

/**
 *
 * @author anda.cristea
 */
public class AdaugProdusCosPFNou {

    ProdusGeneric objProdus;

    IncheieComandaPage objIncheieComanda;

    DetaliiContPage objDetaliiCont;

    CompletezAdresaMailsiParola objCompletezAdresaMailPass;

    ComandaFinalizataPage objComandaFinalizata;

    String filename = "E:\\PrjAutJava\\BrowserStack\\TestNGSampleBS\\test\\configuration\\BrowserStack\\Windows10Chrome62PF.properties";

    private WebDriver driver;

    @BeforeSuite
    @Parameters({"host", "database", "userdatabase", "passdatabase", "tema", "newcart"})
    public void beforeSuite(String host, String database, String userdatabase, String passdatabase, String tema, String newcart) throws Exception {

        // verific daca tema este lider
        String temaCurenta = UtilsDatabase.GetTemaCurenta(host, database, userdatabase, passdatabase);

        if (!temaCurenta.equals(tema)) {

            Assert.fail("Tema nu este: " + tema);
        }


        // verific daca new cart este YES
        // test case will be failed
        String newCartSettings = UtilsDatabase.GetNewCartSettings(host, database, userdatabase, passdatabase);

        if (!newCartSettings.equals(newcart)) {

            Assert.fail("Setarea new cart nu este: " + newcart);
        }

    

    }

    @BeforeMethod(alwaysRun = true)
    public void setUp() throws Exception {
        try {

            driver = UtilsSelenium.readPropBS(filename);

        } catch (Exception ex) {
            System.out.println("exceptie setUp");
            ex.printStackTrace();
        }
    }

    @Test(enabled = false)
    @Parameters({"currierCode", "emailPF", "passPF", "observatii", "host", "database", "userdatabase", "passdatabase"})
    public void AdaugCosProdusFaraVarianteClientPJExistent(String currierCode, String emailPJ, String passPJ, String observatii, String host, String database, String userdatabase, String passdatabase) throws Exception {

        //System.out.println(driver.remote.sessionid);
        String costLivare = UtilsDatabase.GetCostLivrareByCurier(host, database, userdatabase, passdatabase);

        driver.get(Constants.URLProdusClientLiderfaraVarianteCostLivrareDiferitdeZero);
        driver.navigate().refresh();

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        objProdus = new ProdusGeneric(driver);

        objProdus.closeCookie();

        objProdus.clickAdaugaCos();
        objProdus.clickFinalizeaza();

        String pretLivareLabel = objProdus.getPretLivrare();

        String pretLivare = UtilsDatabase.getPriceZecimale(pretLivareLabel, host, database, userdatabase, passdatabase);

        //System.out.println("pret livrare corect: " + pretLivare);
        Assert.assertEquals(pretLivare, costLivare);

        objProdus.clickPasUrmator();

        objCompletezAdresaMailPass = new CompletezAdresaMailsiParola(driver);

        objCompletezAdresaMailPass.completezAdresaEmailAndEnter(emailPJ);

        objCompletezAdresaMailPass.completezPass(passPJ);

        objCompletezAdresaMailPass.clickCotinuaAdresaEmail();

        objIncheieComanda = new IncheieComandaPage(driver);

        objIncheieComanda.ActionsClientExistentPJ(observatii);

        objComandaFinalizata = new ComandaFinalizataPage(driver);

        String expectedComandaFinalizata = objComandaFinalizata.findPanouMsg();

        Assert.assertEquals(frameworkcontentspeed.Lider.ConstantsFramework.ExpectedComanadaFinalizata, expectedComandaFinalizata);

    }

    @Test(enabled = false)
    @Parameters({"currierCode", "emailPJ", "passPJ", "observatii", "host", "database", "userdatabase", "passdatabase"})
    public void AdaugCosProdusFaraVarianteClientFJExistentCostLivrareEgalZero(String currierCode, String emailPJ, String passPJ, String observatii, String host, String database, String userdatabase, String passdatabase) throws Exception {

        //verific daca clientul este PJ
        boolean isClientPJ = UtilsDatabase.IsClientPJ(emailPJ, host, database, userdatabase, passdatabase);

        if (!isClientPJ) {

            Assert.fail("Nu este client PJ: " + emailPJ);
        }

        driver.get(Constants.URLProdusClientLiderfaraVarianteCostLivrareEgalZero);
        driver.navigate().refresh();

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        objProdus = new ProdusGeneric(driver);

        objProdus.closeCookie();

        objProdus.clickAdaugaCos();
        objProdus.clickFinalizeaza();

        String pretLivareLabel = objProdus.getPretLivrare();

        String pretLivare = UtilsDatabase.getPriceZecimale(pretLivareLabel, host, database, userdatabase, passdatabase);

        Assert.assertEquals(pretLivare, "0.00");

        objProdus.clickPasUrmator();

        objCompletezAdresaMailPass = new CompletezAdresaMailsiParola(driver);

        objCompletezAdresaMailPass.completezAdresaEmailAndEnter(emailPJ);

        objCompletezAdresaMailPass.completezPass(passPJ);

        objCompletezAdresaMailPass.clickCotinuaAdresaEmail();

        objIncheieComanda = new IncheieComandaPage(driver);

        objIncheieComanda.ActionsClientExistentPJ(observatii);

        objComandaFinalizata = new ComandaFinalizataPage(driver);

        String expectedComandaFinalizata = objComandaFinalizata.findPanouMsg();

        Assert.assertEquals(frameworkcontentspeed.Lider.ConstantsFramework.ExpectedComanadaFinalizata, expectedComandaFinalizata);

    }

    @Test(enabled = false)
    @Parameters({"emailPJ", "passPJ", "observatii", "host", "database", "userDatabase", "passDatabase"})
    public void AdaugCosProdusFaraVarianteClientPJExistentCuponReducere(String emailPJ, String passPJ, String observatii, String host, String database, String userdatabase, String passdatabase) throws Exception {
        // instantiez locatia une se afla json-ul

        //verific daca clientul este PJ
        boolean isClientPJ = UtilsDatabase.IsClientPJ(emailPJ, host, database, userdatabase, passdatabase);

        if (!isClientPJ) {

            Assert.fail("Nu este client PJ ");
        }

        // verific daca clientul are cupon de reducere
        String CuponReducereClient = UtilsDatabase.SelectCuponReducereByEmail(emailPJ, host, database, userdatabase, passdatabase);

        if (CuponReducereClient.isEmpty()) {

            Assert.fail(emailPJ + " nu are cupon reducere ");
        }

        // verific daca produsul este fara variante
        driver.get(Constants.URLProdusClientLiderfaraVariante);
        driver.navigate().refresh();

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        objProdus = new ProdusGeneric(driver);
        objProdus.closeCookie();

        objProdus.clickAdaugaCos();
        objProdus.clickFinalizeaza();
        objProdus.openRegiuneCuponReducere();
        objProdus.completezCuponReducere(CuponReducereClient);
        objProdus.clickCuponReducere();
        objProdus.clickPasUrmator();

        objCompletezAdresaMailPass = new CompletezAdresaMailsiParola(driver);

        objCompletezAdresaMailPass.completezAdresaEmailAndEnter(emailPJ);
        objCompletezAdresaMailPass.completezPass(passPJ);
        objCompletezAdresaMailPass.clickCotinuaAdresaEmail();

        Assert.assertEquals(Constants.ExpectedIncheieComanda, objCompletezAdresaMailPass.expecetdMessageCompleteazaAdresaMail());

        objIncheieComanda = new IncheieComandaPage(driver);

        objIncheieComanda.ActionsClientExistentPJ(observatii);

        objDetaliiCont = new DetaliiContPage(driver);

        String expectedComandaFinalizata = objDetaliiCont.findPanouMsg();

        Assert.assertEquals(Constants.ExpectedComanadaFinalizata, expectedComandaFinalizata);

    }

    @Test(enabled = false)
    @Parameters({"emailPJ", "passPJ", "observatii", "host", "database", "userDatabase", "passDatabase"})
    public void AdaugCosProdusFaraVarianteClientPJExistent(String emailPJ, String passPJ, String observatii, String host, String database, String userdatabase, String passdatabase) throws Exception {

        //verific daca clientul este PJ
        boolean isClientPJ = UtilsDatabase.IsClientPJ(emailPJ, host, database, userdatabase, passdatabase);

        if (!isClientPJ) {

            Assert.fail("Nu este client PJ ");
        }

        //verific daca produsul este fara variante
        driver.get(Constants.URLProdusClientLiderfaraVariante);
        driver.navigate().refresh();

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        objProdus = new ProdusGeneric(driver);
        objProdus.closeCookie();

        objProdus.clickAdaugaCos();
        objProdus.clickFinalizeaza();

        objProdus.clickPasUrmator();

        objCompletezAdresaMailPass = new CompletezAdresaMailsiParola(driver);

        objCompletezAdresaMailPass.completezAdresaEmailAndEnter(emailPJ);

        objCompletezAdresaMailPass.completezPass(passPJ);

        objCompletezAdresaMailPass.clickCotinuaAdresaEmail();

        objIncheieComanda = new IncheieComandaPage(driver);

        objIncheieComanda.ActionsClientExistentPJ(observatii);

        objDetaliiCont = new DetaliiContPage(driver);

        String expectedComandaFinalizata = objDetaliiCont.findPanouMsg();

        Assert.assertEquals(frameworkcontentspeed.Lider.ConstantsFramework.ExpectedComanadaFinalizata, expectedComandaFinalizata);

    }

    @Test(enabled = false)
    @Parameters({"emailPJ", "passPJ", "varianta1", "observatii", "host", "database", "userDatabase", "passDatabase"})
    public void AdaugCosProduscuVarianteClientPJExistent(String emailPJ, String passPJ, String varianta1, String observatii, String host, String database, String userdatabase, String passdatabase) throws Exception {

        //verific daca clientul este PJ
        boolean isClientPJ = UtilsDatabase.IsClientPJ(emailPJ, host, database, userdatabase, passdatabase);

        if (!isClientPJ) {

            Assert.fail("Nu este client PJ ");
        }

        //verific daca produsul este cu variante
        driver.get(Constants.URLProdusClientLiderfaraVariante);
        driver.navigate().refresh();
        // nu inteleg de ce afiseaza -8
//
//        Point window = driver.manage().window().getPosition();
//        System.out.println("coordonata x " + window.x);
//        System.out.println("coordonata y " + window.y);
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        objProdus = new ProdusGeneric(driver);

        boolean isProdusVariante = objProdus.isProdusCuVariante();

        if (!isProdusVariante) {

            Assert.fail("Nu este produc cu variante " + objProdus.toString());
        }

        objProdus.closeCookie();

        objProdus.selectVarianta(varianta1);

        objProdus.clickAdaugaCos();
        objProdus.clickFinalizeaza();

        objProdus.clickPasUrmator();

        objCompletezAdresaMailPass = new CompletezAdresaMailsiParola(driver);

        objCompletezAdresaMailPass.completezAdresaEmailAndEnter(emailPJ);

        objCompletezAdresaMailPass.completezPass(passPJ);

        objCompletezAdresaMailPass.clickCotinuaAdresaEmail();

        objIncheieComanda = new IncheieComandaPage(driver);

        objIncheieComanda.ActionsClientExistentPJ("client existent PJ produs cu o varianta");

        objDetaliiCont = new DetaliiContPage(driver);

        String expectedComandaFinalizata = objDetaliiCont.findPanouMsg();

        Assert.assertEquals(frameworkcontentspeed.Lider.ConstantsFramework.ExpectedComanadaFinalizata, expectedComandaFinalizata);

    }

    @Test(enabled = false)
    @Parameters({"url", "firstnamePF", "lastnamePF", "emailPF", "telefonPF", "countyPF", "cityPF", "streeaddressPF", "host", "database", "userdatabase", "passdatabase"})
    public void AdaugCosProdusFaraVarianteClientPFNouAutentificarePasiYES(String url, String firstnamePF, String lastnamePF, String emailPF, String telefonPF, String countyPF, String cityPF, String streeaddressPF, String host, String database, String userdatabase, String passdatabase) throws Exception {

        driver.get(url);
        driver.navigate().refresh();

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        objProdus = new ProdusGeneric(driver);
        objProdus.closeCookie();
        objProdus.clickAdaugaCos();
        objProdus.clickFinalizeaza();
        objProdus.clickPasUrmator();

        objCompletezAdresaMailPass = new CompletezAdresaMailsiParola(driver);

        objCompletezAdresaMailPass.completezAdresaEmail(emailPF);

        objCompletezAdresaMailPass.clickCotinuaAdresaEmail();

        Assert.assertEquals(Constants.ExpectedIncheieComanda, objCompletezAdresaMailPass.expecetdMessageCompleteazaAdresaMail());

        objIncheieComanda = new IncheieComandaPage(driver);

        objIncheieComanda.ActionsClientNouPFAutentificareCosYES(firstnamePF, lastnamePF, telefonPF, countyPF, cityPF, streeaddressPF);

        objComandaFinalizata = new ComandaFinalizataPage(driver);

        String expectedComandaFinalizata = objComandaFinalizata.findPanouMsg();

        Assert.assertEquals(frameworkcontentspeed.Lider.ConstantsFramework.ExpectedComanadaFinalizata, expectedComandaFinalizata);

        //int valueOrderId = Integer.getInteger(UtilsSelenium.getValueOfCookieNamed("lastorder"));
        //System.out.println(UtilsSelenium.getValueOfCookieNamed("lastorder"));
        // verify database
        // voi verifica datele din tabela csshop_customers
    }

    @Test(enabled = false)
    @Parameters({"two_step_authentification", "url", "firstnamePF", "lastnamePF", "emailPF", "telefonPF", "countyPF", "cityPF", "streeaddressPF", "host", "database", "userdatabase", "passdatabase"})
    public void AdaugCosProdusFaraVarianteClientPFNouAutentificarePasiNO(String two_step_authentification, String url, String firstnamePF, String lastnamePF, String emailPF, String telefonPF, String countyPF, String cityPF, String streeaddressPF, String host, String database, String userdatabase, String passdatabase) throws Exception {

        // verific daca autentificarea este in doi pasi
        String autentificareinDoiPasiValue = UtilsDatabase.GetTwoStepAuthentificationSettings(host, database, userdatabase, passdatabase);

        if (!autentificareinDoiPasiValue.equals(two_step_authentification)) {

            Assert.fail("Autentificarea in doi pasi nu este: " + two_step_authentification);
        }

        if (two_step_authentification.equals(Constants.autentificareinDoiPasiYES)) {

            driver.get(url);
            driver.navigate().refresh();

            JavascriptExecutor jse = (JavascriptExecutor) driver;

            objProdus = new ProdusGeneric(driver);
            objProdus.closeCookie();
            objProdus.clickAdaugaCos();
            objProdus.clickFinalizeaza();
            objProdus.clickPasUrmator();

            objCompletezAdresaMailPass = new CompletezAdresaMailsiParola(driver);

            objCompletezAdresaMailPass.completezAdresaEmail(emailPF);

            objCompletezAdresaMailPass.clickCotinuaAdresaEmail();

            //Assert.assertEquals(Constants.ExpectedIncheieComanda, objCompletezAdresaMailPass.expecetdMessageCompleteazaAdresaMail());
            objIncheieComanda = new IncheieComandaPage(driver);

            objIncheieComanda.ActionsClientNouPFAutentificareCosYES(firstnamePF, lastnamePF, telefonPF, countyPF, cityPF, streeaddressPF);

            //System.out.println("sursa este: " + driver.getPageSource());
            objComandaFinalizata = new ComandaFinalizataPage(driver);

            String expectedComandaFinalizata = objComandaFinalizata.findPanouMsg();

            Assert.assertEquals(frameworkcontentspeed.Lider.ConstantsFramework.ExpectedComanadaFinalizata, expectedComandaFinalizata);

            //int valueOrderId = Integer.getInteger(UtilsSelenium.getValueOfCookieNamed("lastorder"));
            //System.out.println(UtilsSelenium.getValueOfCookieNamed("lastorder"));
            // verify database
            // voi verifica datele din tabela csshop_customers
        } else if (two_step_authentification.equals(Constants.autentificareinDoiPasiNO)) {
            driver.get(url);
            driver.navigate().refresh();

            JavascriptExecutor jse = (JavascriptExecutor) driver;

            objProdus = new ProdusGeneric(driver);
            objProdus.closeCookie();
            objProdus.clickAdaugaCos();
            objProdus.clickFinalizeaza();

            objIncheieComanda = new IncheieComandaPage(driver);

            objIncheieComanda.ActionsClientNouAutentificarePFCosNO(firstnamePF, lastnamePF, emailPF, telefonPF, countyPF, cityPF, streeaddressPF);

            objComandaFinalizata = new ComandaFinalizataPage(driver);

            String expectedComandaFinalizata = objComandaFinalizata.findPanouMsg();

            Assert.assertEquals(frameworkcontentspeed.Lider.ConstantsFramework.ExpectedComanadaFinalizata, expectedComandaFinalizata);

        }
    }
    
        @Test
    @Parameters({"two_step_authentification", "url", "firstnamePF", "lastnamePF", "emailPF", "telefonPF", "countyPF", "cityPF", "streeaddressPF", "host", "database", "userdatabase", "passdatabase"})
    public void AdaugCosProdusFaraVarianteClientPFNouAutentificarePasiNOAmigoRO(String two_step_authentification, String url, String firstnamePF, String lastnamePF, String emailPF, String telefonPF, String countyPF, String cityPF, String streeaddressPF, String host, String database, String userdatabase, String passdatabase) throws Exception {

        // verific daca autentificarea este in doi pasi
        String autentificareinDoiPasiValue = UtilsDatabase.GetTwoStepAuthentificationSettings(host, database, userdatabase, passdatabase);

        if (!autentificareinDoiPasiValue.equals(two_step_authentification)) {

            Assert.fail("Autentificarea in doi pasi nu este: " + two_step_authentification);
        }

        

            driver.get(url);
            driver.navigate().refresh();

            JavascriptExecutor jse = (JavascriptExecutor) driver;

            objProdus = new ProdusGeneric(driver);
            objProdus.closePopupVarsta();
            
            objProdus.closeCookie();
            jse.executeScript("window.scrollTo(0, 800)");
            objProdus.clickAdaugaCos();
            objProdus.clickFinalizeaza();
            jse.executeScript("window.scrollTo(0, 800)");
            objProdus.clickPasUrmator();

            objCompletezAdresaMailPass = new CompletezAdresaMailsiParola(driver);

            objCompletezAdresaMailPass.completezAdresaEmail(emailPF);

            objCompletezAdresaMailPass.clickCotinuaAdresaEmail();

            //Assert.assertEquals(Constants.ExpectedIncheieComanda, objCompletezAdresaMailPass.expecetdMessageCompleteazaAdresaMail());
            objIncheieComanda = new IncheieComandaPage(driver);

            objIncheieComanda.ActionsClientNouAutentificarePFCosAmigo(firstnamePF, lastnamePF, emailPF, telefonPF, countyPF, cityPF, streeaddressPF);

            //System.out.println("sursa este: " + driver.getPageSource());
            objComandaFinalizata = new ComandaFinalizataPage(driver);

            String expectedComandaFinalizata = objComandaFinalizata.findPanouMsg();

            Assert.assertEquals(frameworkcontentspeed.Lider.ConstantsFramework.ExpectedComanadaFinalizata, expectedComandaFinalizata);

            //int valueOrderId = Integer.getInteger(UtilsSelenium.getValueOfCookieNamed("lastorder"));
            //System.out.println(UtilsSelenium.getValueOfCookieNamed("lastorder"));
            // verify database
            // voi verifica datele din tabela csshop_customers
       
        
    }
    
    @Test
    @Parameters({"two_step_authentification", "url", "firstnamePF", "lastnamePF", "emailPF", "telefonPF", "countyPF", "cityPF", "streeaddressPF", "host", "database", "userdatabase", "passdatabase"})
    public void AdaugCosProdusFaraVarianteClientPFNouAutentificarePasiNOAmigo(String two_step_authentification, String url, String firstnamePF, String lastnamePF, String emailPF, String telefonPF, String countyPF, String cityPF, String streeaddressPF, String host, String database, String userdatabase, String passdatabase) throws Exception {

        // verific daca autentificarea este in doi pasi
        String autentificareinDoiPasiValue = UtilsDatabase.GetTwoStepAuthentificationSettings(host, database, userdatabase, passdatabase);

        if (!autentificareinDoiPasiValue.equals(two_step_authentification)) {

            Assert.fail("Autentificarea in doi pasi nu este: " + two_step_authentification);
        }

        

            driver.get(url);
            driver.navigate().refresh();

            JavascriptExecutor jse = (JavascriptExecutor) driver;

            objProdus = new ProdusGeneric(driver);
            objProdus.closeCookie();
            jse.executeScript("window.scrollTo(0, 800)");
            objProdus.clickAdaugaCos();
            objProdus.clickFinalizeaza();
            jse.executeScript("window.scrollTo(0, 800)");
            objProdus.clickPasUrmator();

            objCompletezAdresaMailPass = new CompletezAdresaMailsiParola(driver);

            objCompletezAdresaMailPass.completezAdresaEmail(emailPF);

            objCompletezAdresaMailPass.clickCotinuaAdresaEmail();

            //Assert.assertEquals(Constants.ExpectedIncheieComanda, objCompletezAdresaMailPass.expecetdMessageCompleteazaAdresaMail());
            objIncheieComanda = new IncheieComandaPage(driver);

            objIncheieComanda.ActionsClientNouAutentificarePFCosAmigo(firstnamePF, lastnamePF, emailPF, telefonPF, countyPF, cityPF, streeaddressPF);

            //System.out.println("sursa este: " + driver.getPageSource());
            objComandaFinalizata = new ComandaFinalizataPage(driver);

            String expectedComandaFinalizata = objComandaFinalizata.findPanouMsg();

            Assert.assertEquals(frameworkcontentspeed.Lider.ConstantsFramework.ExpectedComanadaFinalizata, expectedComandaFinalizata);

            //int valueOrderId = Integer.getInteger(UtilsSelenium.getValueOfCookieNamed("lastorder"));
            //System.out.println(UtilsSelenium.getValueOfCookieNamed("lastorder"));
            // verify database
            // voi verifica datele din tabela csshop_customers
       
        
    }


    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();

    }

    @AfterSuite
    public void afterSuite() throws Exception {
        System.out.println("after suite");
    }

}
