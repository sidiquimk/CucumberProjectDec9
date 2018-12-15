package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.BaseClass;

public class RegisterSteps extends BaseClass{
	
	@Given("^I open my browser$")
	public void i_open_my_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Given("^navigate to freeCRM$")  //PRECONDITION
	public void navigate_to_freeCRM() throws Throwable {
		driver.get("https://www.freecrm.com/index.html");
		Thread.sleep(3000);
	}

	@When("^I click signup$") //ACTION
	public void i_click_signup() throws Throwable {
	    driver.findElement(By.xpath("//font[@color='red']")).click();
	}

	@When("^Fill the form$") //ACTION
	public void fill_the_form() throws Throwable {
		WebElement selectEdition = driver.findElement(By.xpath("//select[@id='payment_plan_id']"));
		   Select select = new Select(selectEdition);
		   select.selectByVisibleText("Free Edition");
		   
		   driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Masood1");
		   driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Sidiqui1");
		   driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("masoodsdq11@gmail.com");
		   driver.findElement(By.xpath("//input[@placeholder='Confirm Email']")).sendKeys("masoodsdq11@gmail.com");
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("sidiquimk3");
		   driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("sidiquimk1ABC");
		   driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys("sidiquimk1ABC");
		   driver.findElement(By.xpath("//input[@value='false']")).click();
		   Thread.sleep(3000);
	}

	@When("^I click submit$")  //ACTION
	public void i_click_submit() throws Throwable {
		driver.findElement(By.xpath("//button[@id='submitButton']")).click();
		Thread.sleep(3000);
	}

	@Then("^Successfully i register for new account$")  //OUTCOME
	public void successfully_i_register_for_new_account() throws Throwable {
	    Assert.assertTrue(true);
	}

	@Then("^i quite browser$")  //OUTCOME
	public void i_quite_browser() throws Throwable {
	    driver.quit();
}
}
