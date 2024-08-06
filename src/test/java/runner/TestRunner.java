package runner;

	

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;	



@CucumberOptions(tags = "", features = {"src/test/java/Features/login.feature"}, glue = {"stepdefinition"},
plugin = {})
public class TestRunner extends AbstractTestNGCucumberTests {

					

}

	

