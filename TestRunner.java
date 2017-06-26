import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "features/YahooLogin.feature", format = {
		"pretty", "html:src" })
public class TestRunner extends AbstractTestNGCucumberTests{
	

}
