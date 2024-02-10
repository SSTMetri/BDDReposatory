package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact 
{
	String lastName="Chotabheem";
	
	WebDriver driver;
	@Given("Launch browser")
	public void launch_browser() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://localhost:8888");
	}
	@Given("enter credentials")
	public void enter_credentials() {
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();

	}
	@When("validate home page is displayed or not") 
	public void validate_home_page_is_displayed_or_not() {
		System.out.println(driver.getTitle());
	}
	
	@When("i want click on contacts button and create contact lookup icon")
	public void i_want_click_on_contacts_button_and_create_contact_lookup_icon() {
		driver.findElement(By.xpath("//a[normalize-space()='Contacts']")).click();
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
	}
	@When("give all the details and click on save")
	public void give_all_the_details_and_click_on_save() {
		
		driver.findElement(By.name("lastname")).sendKeys(lastName);
		driver.findElement(By.xpath("//input[@class='crmbutton small save']")).click();
		
	}
	@Then("validate contact is created or not")
	public void validate_contact_is_created_or_not() {
		String text = driver.findElement(By.className("dvHeaderText")).getText();
		
		Assert.assertTrue(text.contains(lastName));
	}
	@Then("close the browser")
	public void close_the_browser() {
		driver.close();
	}


}
