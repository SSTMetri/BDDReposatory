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

public class CreateOrg 
{
	WebDriver driver;
	@Given("I want to launch browser")
	public void i_want_to_launch_browser() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://localhost:8888");
	}
	@Given("Login to application with valid credentials admin and admin")
	public void login_to_application_with_valid_credentials_admin_and_admin(String uName,String pwd) {
		driver.findElement(By.name("user_name")).sendKeys(uName); 
		driver.findElement(By.name("user_password")).sendKeys(pwd);
		driver.findElement(By.id("submitButton")).click();
	}
	@When("Home page is displayed")
	public void home_page_is_displayed() {
		System.out.println("*********"+driver.getTitle()+"*********");
	}
	@When("Click on organization button and org lookup icon")
	public void click_on_organization_button_and_org_lookup_icon() {
		driver.findElement(By.xpath("(//a[@href='index.php?module=Accounts&action=index'])[1]")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	}
	@When("give CaptinaMArvel and {int} and click on save button")
	public void give_captina_m_arvel_and_and_click_on_save_button(String orgN,String phone) {
		driver.findElement(By.name("accountname")).sendKeys(orgN);
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(phone);
	}
	@Then("validate org is created or not with CaptinaMArvel")
	public void validate_org_is_created_or_not_with_captina_m_arvel(String orgN) {
		String header = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		Assert.assertTrue(header.contains(orgN));
	}
	
	
	
	
	

}
