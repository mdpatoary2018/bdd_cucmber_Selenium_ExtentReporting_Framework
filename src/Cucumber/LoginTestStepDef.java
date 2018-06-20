package Cucumber;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import BDDUtility.BaseMain;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author MdShohid H Patoary
 * Make sure you will connect Hooks befor step defenation
 */
public class LoginTestStepDef implements BaseMain {
	
	public WebDriver driver;
	/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String id = null;
    String pass=null;*/  
    
    public LoginTestStepDef()
    {
    	driver = Hooks.driver;
    }
	
    @Given("^Open firefox and start application$")
	public void open_firefox_and_start_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver.get("https://mywipro.wipro.com");
		 driver.manage().timeouts().implicitlyWait(40,  TimeUnit.SECONDS);
		 rm.Capture_Screen_Shot();
	}

	@When("^I Click my account$")
	public void i_Click_my_account() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id='bySelection']/div[2]/div/span")).click();
		//log.ValidLoginlink().click();
		
	}

	@When("^Enter Valid User Id$")
	public void enter_Valid_User_Id() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("UserName")).clear();
		driver.findElement(By.name("UserName")).sendKeys("");
		//System.out.println("Please Enter the user ID ::");
        //id= br.readLine();
        //rm.Fluantwait();
		
	}

	@When("^Enter Valid Password$")
	public void enter_Valid_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("Password")).clear();
		driver.findElement(By.name("Password")).sendKeys("");
		//System.out.println("Please Enter the user ID ::");
        //pass= br.readLine();
		rm.Fluantwait();
	}

	@When("^I click Login Btn$")
	public void i_click_Login_Btn() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("submitButton")).click();
		rm.Fluantwait();
		//rm Key is reusable method 
		
	}

	@Then("^I should be able to see Homepage$")
	public void i_should_be_able_to_see_Homepage() throws Throwable {
		rm.Capture_Screen_Shot();
		//int size = driver.findElements(By.tagName("iframe")).size();
		//System.out.println("total frames"+size);

	    // Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.xpath("/html/body/div[14]/div/span")).click();
		//log.ValidPopup().click();
		System.out.println("I am in My Wipro Home Page");
	}

}
