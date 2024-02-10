package stepDefinition;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Organization 
{
	WebDriver driver;
	@Given("Launch browser and login")
	public void launch_browser_and_login() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://localhost:8888");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
	}
	@Given("validate home page")
	public void validate_home_page() {
		System.out.println("*********"+driver.getTitle()+"*********");
	}
	@When("click on org and orhIcon")
	public void click_on_org_and_orh_icon() {
		driver.findElement(By.xpath("(//a[@href='index.php?module=Accounts&action=index'])[1]")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	}
	@When("give deatils and save")
	public void give_deatils_and_save() {
		driver.findElement(By.name("accountname")).sendKeys("ORGNAME");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("45454545");
		driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[2]")).click();
	}
	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		String header = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		Assert.assertTrue(header.contains("ORGNAME"));
		System.out.println(header); 
	}
	@Then("close browser")
	public void close_browser() {
		driver.close();
	}

}
