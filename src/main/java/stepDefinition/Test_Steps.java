package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {
	
	public WebDriver driver;
	private String baseUrl;
	
	@Given("^User is on Google Search Page$")
	public void user_is_on_Google_Search_Page() throws Throwable {
		driver = new FirefoxDriver();
        baseUrl = "https://www.google.lk/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("^User enters TEST to Search Box$")
	public void user_enters_TEST_to_Search_Box() throws Throwable {
	    driver.get(baseUrl + "/?gws_rd=ssl");
	    driver.findElement(By.id("gbqfq")).clear();
	    driver.findElement(By.id("gbqfq")).sendKeys("TEST");
	    
	}

	@When("^User click on Google Search button$")
	public void user_click_on_Google_Search_button() throws Throwable {
		driver.findElement(By.id("gbqfq")).submit();
	}

	@Then("^Display results$")
	public void display_results() throws Throwable {
	    System.out.println("Results Successfully Displayed!");
	}

	@When("^User verifies results$")
	public void user_verifies_results() throws Throwable {
				
	}

	@Then("^Display success message$")
	public void display_success_message() throws Throwable {
	   
	}

	
}
