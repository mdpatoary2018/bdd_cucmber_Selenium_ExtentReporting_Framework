package BDDTest;

/**
 * @author MdShohid H Patoary
 */

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
	
@RunWith(Cucumber.class)
@CucumberOptions(
			features="FeaturesTestCase",
			glue="Cucumber",
			plugin = {"html:target/cucumber-html-report"},
			tags= {"@loginTest"}
			)

	public class TC001LoginTest extends AbstractTestNGCucumberTests{
		

	}
	
