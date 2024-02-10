package stepDefinition;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login 
{
	WebDriver driver;
	@Given("i want to launch the browser")
	public void i_want_to_launch_the_browser() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	@Given("enter the url")
	public void enter_the_url() {
		driver.get("http://localhost:8888");
	}
	@When("login page is displayed enter valid credentials")
	public void login_page_is_displayed_enter_valid_credentials() {
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		
	}
	@When("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.id("submitButton")).click();
		
		
	}
	@Then("validate if home page is displayed or not")
	public void validate_if_home_page_is_displayed_or_not() {
		
		System.out.println(driver.getTitle()+"*************************");
	}
}
