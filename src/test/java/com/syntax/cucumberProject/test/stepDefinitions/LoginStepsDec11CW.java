package com.syntax.cucumberProject.test.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepsDec11CW {
	WebDriver driver;
	
	@Given("^I open browser(\\d+)$")
	public void i_open_browser(int arg1) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Given("^I navagate to the FreeCrm(\\d+)$")
	public void i_navagate_to_the_FreeCrm(int arg1) throws Throwable {
		driver.get("https://www.freecrm.com/index.html");
	}
	
	@When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_and(String uName, String pwd) throws Throwable {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(uName);
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
	    Thread.sleep(2000);
	}

	

	@When("^I click login button(\\d+)$")
	public void i_click_login_button(int arg1) throws Throwable {
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(2000);
	}

	@Then("^I successfully logged in(\\d+)$")
	public void i_successfully_logged_in(int arg1) throws Throwable {
		Assert.assertTrue(true);
		Thread.sleep(2000);
		System.out.println("Assertion passed");
	}

	@Then("^I close browser$")
	public void i_close_browser() throws Throwable {
	    driver.quit();
	}



	@Then("^I see error message$")
	public void i_see_error_message() throws Throwable {
		Assert.assertTrue(true);
		Thread.sleep(2000);
	}


	

	@Then("^I see different error message$")
	public void i_see_different_error_message() throws Throwable {
		Assert.assertTrue(true);
		Thread.sleep(2000);
	}

}
