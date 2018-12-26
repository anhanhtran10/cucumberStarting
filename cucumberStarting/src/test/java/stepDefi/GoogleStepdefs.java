package stepDefi;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import pageObject.GoogleSearchPage;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleStepdefs {
	WebDriver driver;
	GoogleSearchPage googlePage;
	
	@Before
	public void StartScenario() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		driver = new ChromeDriver();
		googlePage = new GoogleSearchPage(driver);
	}
	@Given("^I am staying google\\.com\\.vn$")
	public void i_am_staying_google_com_vn() throws Exception {
		
		this.driver.get("https://www.google.com.vn");
		this.driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	  
	    throw new PendingException();
	}

	@When("^I provide \"([^\"]*)\" keyword into search box field$")
	public void i_provide_keyword_into_search_box_field(String arg1) throws Exception {
		googlePage.txtSearchbox.sendKeys(arg1);
	   
	    throw new PendingException();
	}

	@When("^I do search$")
	public void i_do_search() throws Exception {
		googlePage.btnSearch.submit();
	 
	    throw new PendingException();
	}

	@Then("^I show see the \"([^\"]*)\" on search result$")
	public void i_show_see_the_on_search_result(String arg1) throws Exception {
		Assert.assertEquals(arg1, googlePage.lbResult.getText());
	   
	    throw new PendingException();
	}



}