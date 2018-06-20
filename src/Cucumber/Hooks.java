package Cucumber;

/**
 * @author MdShohid H Patoary
 */

import java.net.MalformedURLException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import gherkin.formatter.model.Scenario;

public class Hooks{
    public static WebDriver driver;

    
    @Before
    /**
     * Delete all cookies at the start of each scenario to avoid
     * shared state between tests
     */
    public void openBrowser() throws MalformedURLException {
    	System.out.println("Called openBrowser");
    	driver=new FirefoxDriver();
    	driver.manage().deleteAllCookies();
    	driver.manage().window().maximize();
    }
    public static WebDriver getDriver() {
		return driver;
	}
     
    @After
    /**
     * Cucumber After Hooks
     */
    public void embedScreenshot() {
       
      driver.quit();
        
    }
    
}