/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frameworkcontentspeed.Lider;

import databaseaccesscontentspeed.UtilsDatabase;
import frameworkcontentspeed.Utils.BaseTest;
import static frameworkcontentspeed.Utils.SendEmailAtachament.SendEmail;
import static frameworkcontentspeed.Utils.SendEmailAtachament.SendEmailPassed;
import static frameworkcontentspeed.Utils.SendEmailAtachament.SendEmailSephoraFailed;
import static frameworkcontentspeed.Utils.SendEmailAtachament.SendEmailSephoraPassed;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.IAlterSuiteListener;
import org.testng.IExecutionListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class DotTestListener implements IExecutionListener, ISuiteListener, ITestListener//, IAlterSuiteListener 
{

    private String URLClient;
    private String tema;
    private String host;
    private String databaseGeneric;
    private String userdatabaseGeneric;
    private String passdatabaseGeneric;

    String fisierConfigurari;
    String browser;
    String osversion;
    RemoteWebDriver driver;
    public String sessionId;
    String typeTest = "";
    String oosversion = "";
    int failedTests = 0;
    int totalFailedTests = 0;

    boolean resultsSuita = true;

    boolean resultsConfigurations = true;

    int testfailures;

    int testSucess;

    int testSkipped;

    int totalNumberOfPassedMethodsForSuite = 0;

    String deviceName = "";

    int totalfailedConfiguration = 0;

    String forSephora = "";

    BaseTest bt;

    int TotalTC = 0;

    public static List<String> l = null;

//    @Override
//    public void alter(List<XmlSuite> suites) {
//        XmlSuite suite = suites.get(0);
//        List<XmlTest> tests = suite.getTests();
//
//        System.out.println("size: " + tests.size());
//
//        for (XmlTest t : tests) {
//
//            t.addParameter("sessionId", sessionId);
//            System.out.println(sessionId);
//        }
//
////        XmlTest anotherTest = new XmlTest(suite);
////        anotherTest.setName("foo");
////        anotherTest.setClasses(test.getClasses());
//    }
    public void onStart(ITestContext context) {
        try {

            URLClient = context.getCurrentXmlTest().getParameter("urlClient");
            ISuite suite = context.getSuite();
            host = context.getCurrentXmlTest().getParameter("host");
            databaseGeneric = context.getCurrentXmlTest().getParameter("database");
            userdatabaseGeneric = context.getCurrentXmlTest().getParameter("userdatabase");
            passdatabaseGeneric = context.getCurrentXmlTest().getParameter("passdatabase");
            fisierConfigurari = context.getCurrentXmlTest().getParameter("filename");

            forSephora = context.getCurrentXmlTest().getParameter("forSephora");

            osversion = UtilsSelenium.readPropertyBS(fisierConfigurari, "os") + UtilsSelenium.readPropertyBS(fisierConfigurari, "os_version");

            typeTest = context.getCurrentXmlTest().getParameter("typetest");

            browser = UtilsSelenium.readPropertyBS(fisierConfigurari, "browser") + UtilsSelenium.readPropertyBS(fisierConfigurari, "browser_version") + " " + osversion;

            deviceName = UtilsSelenium.readPropertyBS(fisierConfigurari, "deviceName") != null ? UtilsSelenium.readPropertyBS(fisierConfigurari, "deviceName") : "";

            TotalTC = Integer.parseInt(UtilsSelenium.readPropertyBS(fisierConfigurari, "TotalTC"));

            System.out.println("TotalTC " + TotalTC);
            if (deviceName.isEmpty()) {
                browser = UtilsSelenium.readPropertyBS(fisierConfigurari, "browser") + UtilsSelenium.readPropertyBS(fisierConfigurari, "browser_version");
            } else {
                browser = UtilsSelenium.readPropertyBS(fisierConfigurari, "deviceName");
            }

            tema = UtilsDatabase.GetTemaCurenta(host, databaseGeneric, userdatabaseGeneric, passdatabaseGeneric);

        } catch (Throwable ex) {
            ex.printStackTrace();
            System.out.println("Eroare metoda onStart() suita " + ex.getLocalizedMessage());

        }

    }

//    @Override
//    public void alter(List<XmlSuite> suites) {
//        for (XmlSuite suite : suites) {
//            List<XmlTest> tests = new ArrayList<>();
//
//            System.out.println(tests.size());
////            //Integer[] datum = getData();
//            System.out.println(l.size());
//            for (String data : l) {
//                XmlTest test = new XmlTest(suite);
////                //test.setName("test_" + data);
//                test.addParameter("sessionId", data);
////                //test.getClasses().add(new XmlClass(StudentTest.class));
//            }
//        }
//    }
    public void onTestStart(ITestResult result) {
        bt = new BaseTest();

//        driver = UtilsSelenium.readPropBSByBrowserByType(fisierConfigurari, browser, typeTest);
//
//        bt.setWebDriver(driver);
        String sessionId = bt.getSessionIdBS();

    }

    //driver = UtilsSelenium.readPropBSByBrowserByType(filename, Browser, typetest);
//    @Override
//    public void alter(List<XmlSuite> suites) {
//        XmlSuite suite = suites.get(0);
//        List<XmlTest> tests = suite.getTests();
//
//        System.out.println("size: " + tests.size());
//
//        for (XmlTest t : tests) {
//
//            sessionId = bt.getSessionIdBS();
//            t.addParameter("sessionId", sessionId);
//            System.out.println(sessionId);
//        }
//
////        XmlTest anotherTest = new XmlTest(suite);
////        anotherTest.setName("foo");
////        anotherTest.setClasses(test.getClasses());
//    }
    public void onTestSuccess(ITestResult result) {

        testSucess += result.getTestContext().getPassedTests().size();

        System.out.println("testSucess " + testSucess);

    }

    public void onTestFailure(ITestResult result) {

        testfailures += result.getTestContext().getFailedTests().size();

        System.out.println("testfailures: " + testfailures);

    }

    public void onTestSkipped(ITestResult result) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    public void onFinish(ITestContext context) {

    }

    public void onExecutionStart() {
        try {
            System.out.println("onExecutionStart()");
            // l = new ArrayList<>();

        } catch (Throwable ex) {
            ex.printStackTrace();
        }

    }

    public void onStart(ISuite suite) {

        try {

            System.out.println("onStart(ISuite suite)");

            l = new ArrayList<>();

            System.out.println("dupa initilaizare lista onStart(ISuite suite) " + l.toString());
        } catch (Throwable ex) {
            ex.printStackTrace();
        }

        // suite.getXmlSuite()
    }

    public void onFinish(ISuite suite) {

        Map<String, ISuiteResult> tests = suite.getResults();

        ITestContext overview = null;

        for (ISuiteResult r : tests.values()) {
            overview = r.getTestContext();

            totalNumberOfPassedMethodsForSuite += overview.getPassedTests().getAllMethods().size();
            totalfailedConfiguration += overview.getFailedConfigurations().getAllMethods().size();
        }

        System.out.println("test cases passed: " + totalNumberOfPassedMethodsForSuite);

        System.out.println("totalfailedConfiguration: " + totalfailedConfiguration);

    }

    public void onExecutionFinish() {

        String msg = "";

        System.out.println("numarul de elemente din lista de SessionId este: " + l.size());

        for (String s : l) {
            System.out.println("sesiune Id este pentru testele din suita : " + s);
        }

        try {

            System.out.println("browser" + " " + browser);

            if ((totalfailedConfiguration > 0) && !(tema.equals("cs_sephora"))) {
                msg = "FAILED:" + " Raport Teste Automate pentru clientul " + URLClient + " cu tema:" + tema + " " + browser;
                System.out.println(totalfailedConfiguration);
                System.out.println(typeTest);
                System.out.println(msg);
                SendEmail("anda.cristea@contentspeed.ro", "dev@contentspeed.ro", "techsupport@contentspeed.ro", msg, "D:\\test-output\\emailable-report.html");
            } else if ((totalfailedConfiguration > 0) && (tema.equals("cs_sephora"))) {
                msg = "FAILED:" + " Raport Teste Automate pentru clientul " + URLClient + " cu tema:" + tema + " " + browser;
                System.out.println(totalfailedConfiguration + " Sephora");
                System.out.println(typeTest + " Sephora");
                System.out.println(msg + " Sephora");
                SendEmailSephoraFailed("anda.cristea@contentspeed.ro", "ggheorghe@sephora.ro", "dev@contentspeed.ro", "techsupport@contentspeed.ro", "test.sephora@contentspeed.ro", msg, "D:\\test-output\\emailable-report.html");

            } else if ((totalNumberOfPassedMethodsForSuite == TotalTC) && (typeTest.equals("PJ"))) {

                msg = "PASSED:" + " Raport Teste Automate pentru clientul " + URLClient + " cu tema:" + tema + " " + browser;
                System.out.println(totalNumberOfPassedMethodsForSuite);
                System.out.println(typeTest);
                System.out.println(msg);
                SendEmailPassed("anda.cristea@contentspeed.ro", "test@contentspeed.ro", msg, "D:\\test-output\\emailable-report.html");
            } else if ((totalNumberOfPassedMethodsForSuite == TotalTC) && (typeTest.equals("PF")) && (tema.equals("cs_sephora"))) {

                msg = "PASSED:" + " Raport Teste Automate pentru clientul " + URLClient + " cu tema:" + tema + " " + browser;
                System.out.println(totalNumberOfPassedMethodsForSuite);
                System.out.println(typeTest);
                System.out.println(msg);
                SendEmailSephoraPassed("anda.cristea@contentspeed.ro", "ggheorghe@sephora.ro", "test@contentspeed.ro", "test.sephora@contentspeed.ro", msg, "D:\\test-output\\emailable-report.html");
            } else if ((totalNumberOfPassedMethodsForSuite == TotalTC) && (typeTest.equals("PF"))) {

                msg = "PASSED:" + " Raport Teste Automate pentru clientul " + URLClient + " cu tema:" + tema + " " + browser;
                System.out.println(totalNumberOfPassedMethodsForSuite);
                System.out.println(typeTest);
                System.out.println(msg);
                SendEmailPassed("anda.cristea@contentspeed.ro", "test@contentspeed.ro", msg, "D:\\test-output\\emailable-report.html");
            } else if ((totalNumberOfPassedMethodsForSuite == TotalTC) && (typeTest.equals("PF")) && ((tema.equals("cs_sephora")))) {

                msg = "PASSED:" + " Raport Teste Automate pentru clientul " + URLClient + " cu tema:" + tema + " " + browser;

                System.out.println(msg + " Sephora ");
                SendEmailPassed("anda.cristea@contentspeed.ro", "test@contentspeed.ro", msg, "D:\\test-output\\emailable-report.html");
            } else if ((totalNumberOfPassedMethodsForSuite == TotalTC) && (typeTest.equals("PFPJ")) && (tema.equals("cs_sephora"))) {

                msg = "PASSED:" + " Raport Teste Automate pentru clientul " + URLClient + " cu tema:" + tema + " " + browser;
                System.out.println(totalNumberOfPassedMethodsForSuite);
                System.out.println(typeTest);
                SendEmailSephoraPassed("anda.cristea@contentspeed.ro", "ggheorghe@sephora.ro", "test@contentspeed.ro", "test.sephora@contentspeed.ro", msg, "D:\\test-output\\emailable-report.html");
            } else if ((totalNumberOfPassedMethodsForSuite == TotalTC) && (typeTest.equals("PFPJ")) && !tema.equals("cs_sephora")) {

                msg = "PASSED:" + " Raport Teste Automate pentru clientul " + URLClient + " cu tema:" + tema + " " + browser;
                System.out.println(totalNumberOfPassedMethodsForSuite);
                System.out.println(typeTest);
                SendEmailPassed("anda.cristea@contentspeed.ro", "test@contentspeed.ro", msg, "D:\\test-output\\emailable-report.html");
            } else if (tema.equals("cs_sephora")) {
                msg = "FAILED:" + " Raport Teste Automate pentru clientul " + URLClient + " cu tema:" + tema + " " + browser;
                System.out.println(totalNumberOfPassedMethodsForSuite);
                System.out.println(typeTest);
                System.out.println(msg);
                SendEmailSephoraFailed("anda.cristea@contentspeed.ro", "ggheorghe@sephora.ro", "dev@contentspeed.ro", "techsupport@contentspeed.ro", "test.sephora@contentspeed.ro", msg, "D:\\test-output\\emailable-report.html");

            } else {
                msg = "FAILED:" + " Raport Teste Automate pentru clientul " + URLClient + " cu tema:" + tema + " " + browser;
                System.out.println(totalNumberOfPassedMethodsForSuite);
                System.out.println(typeTest);
                System.out.println(msg);
                SendEmail("anda.cristea@contentspeed.ro", "dev@contentspeed.ro", "techsupport@contentspeed.ro", msg, "D:\\test-output\\emailable-report.html");

            }

        } catch (Throwable ex) {
            System.out.println("Eroare trimitere Raport Teste Automate " + ex.getMessage());

        }
    }

}
