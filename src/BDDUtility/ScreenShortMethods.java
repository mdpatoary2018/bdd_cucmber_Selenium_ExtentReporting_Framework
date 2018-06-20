package BDDUtility;

/**
 * @author MdShohid H Patoary
 * This is an abstruc Class access only use interface 
 */

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import Cucumber.Hooks;




public class ScreenShortMethods implements BaseMain {
	
	WebDriver driver ;
	protected static final String Path = "C:\\Users\\mdpat\\workspace\\BDDMyWiproCucumberFrameworkFinalRelease\\main\\resources\\";
	
	public void Capture_Screen_Shot() {

		try {
			TakesScreenshot ts = (TakesScreenshot) Hooks.getDriver();

			File source = ts.getScreenshotAs(OutputType.FILE);
			
			DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
			Calendar cal = Calendar.getInstance();
			System.out.println(dateFormat.format(cal.getTime()));

			FileUtils.copyFile(source, new File(Path+dateFormat.format(cal.getTime())+ ".png"));

			System.out.println("Bingo I took Screenshort");

		} catch (Exception e) {

			System.out.println("opps! here is your exception " + e.getMessage());
		}
	}
	
	public void Fluantwait() {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(Hooks.getDriver()).withTimeout(500, TimeUnit.SECONDS);
			
	}
	public void iframe(){
		driver.switchTo().frame("divMainmyWiproPortalViewFrame");
	}
	
	
}
