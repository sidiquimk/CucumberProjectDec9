package com.syntax.cucumberProject.test.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	WebDriver driver;
	
	@Given("^I open browser$")
	public void i_open_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}

	@Given("^I navagate to the FreeCrm$")
	public void i_navagate_to_the_FreeCrm() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.freecrm.com/index.html");
	}

	@When("^I enter valid username and password$")
	public void i_enter_valid_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("sidiquimk");
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("sidiquimk@123");
	   
	}

	@When("^I click login button$")
	public void i_click_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("^I successfully logged in$")
	public void i_successfully_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		boolean assert1=driver.findElement(By.xpath("//a[@title = 'Home']")).isDisplayed();
	    Assert.assertTrue(assert1);
	    System.out.println("this is  valid user id and  password: "+assert1);
	}
	
	@When("^I enter invalid username and password$")
	public void i_enter_invalid_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("sidiqui");
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("sidiquimk@123");
	    driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("^i see error message$")
	public void i_see_error_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		boolean assert2 = driver.findElement(By.xpath("//input[@value='Login']")).isDisplayed();
		Assert.assertTrue(assert2);
		System.out.println("this is invalid user id or password: "+assert2);
	}





}
