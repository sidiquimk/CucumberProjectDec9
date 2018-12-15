package testRunners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.BaseClass;

public class Sample extends BaseClass{
	
	
/*	@Given("^I open browser (\\d+)$")
	public void i_open_browser(int arg1) throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Given("^I navagate to the FreeCrm (\\d+)$")
	public void i_navagate_to_the_FreeCrm(int arg1) throws Throwable {
		driver.get("https://www.freecrm.com/index.html");
		Thread.sleep(3000);
	}

	@Given("^I click on SignUp (\\d+)$")
	public void i_click_on_SignUp(int arg1) throws Throwable {
		driver.findElement(By.xpath("//font[@color='red']")).click();
	}

	@Given("^I select Free Edition (\\d+)$")
	public void i_select_Free_Edition(int arg1) throws Throwable {
		WebElement edition = driver.findElement(By.xpath("//select[@id='payment_plan_id']"));
	    Select select = new Select(edition);
	    select.selectByVisibleText("Free Edition");
	}

	@When("^I enter \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" (\\d+)$")
	public void i_enter_and_and_and(String firstName, String lastName, String email, String confirmEmail) throws Throwable {
		    driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(firstName);
		    driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lastName);
		    driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(email);
		    driver.findElement(By.xpath("//input[@placeholder='Confirm Email']")).sendKeys(confirmEmail);
	}

	@When("^I enter credentials \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" (\\d+)$")
	public void i_enter_credentials_and_and(String userName, String Password, String confirmPassword) throws Throwable {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(userName);
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Password);
	    driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys(confirmPassword);
	}

	@When("^I check conditions and click submit (\\d+)$")
	public void i_check_conditions_and_click_submit(int arg1) throws Throwable {
		driver.findElement(By.xpath("//input[@value='false']")).click();
	    driver.findElement(By.xpath("//div[@class='myButton']")).click();
	}

	@Then("^I enter company information \"([^\"]*)\" and \"([^\"]*)\" (\\d+)$")
	public void i_enter_company_information_and(String company, String phone) throws Throwable {
		driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys(company);
	    driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(phone);
	}

	@Then("^I click on continue (\\d+)$")
	public void i_click_on_continue(int arg1) throws Throwable {
		driver.findElement(By.xpath("//button[@name='btnSubmit']")).click();
	}

	@Then("^I click on complete registration (\\d+)$")
	public void i_click_on_complete_registration(int arg1) throws Throwable {
		driver.findElement(By.xpath("//button[@name='finish']")).click();
	}

	@Then("^I close browser (\\d+)$")
	public void i_close_browser(int arg1) throws Throwable {
		driver.quit();
	}*/

}
