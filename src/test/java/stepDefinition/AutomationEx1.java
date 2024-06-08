package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationEx1 {
	WebDriver driver;
//	@Given("Launch browser")
//	public void launch_browser() {
//		WebDriverManager.firefoxdriver().setup();
//	    driver=new FirefoxDriver();
//	    driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	}
	@Given("Navigate to url {string}")
	public void navigate_to_url(String string) {
		WebDriverManager.edgedriver().setup();
	    driver=new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("https://automationexercise.com/");
	    
	}
	@When("Verify that home page is visible successfully")
	public void verify_that_home_page_is_visible_successfully() {
	    WebElement ele = driver.findElement(By.xpath("//i[@class='fa fa-home']"));
	    Assert.assertTrue(ele.isDisplayed());
	}
	@When("Scroll down page to bottom")
	public void scroll_down_page_to_bottom() {
	    JavascriptExecutor js=(JavascriptExecutor) driver;
	    WebElement element = driver.findElement(By.xpath("//h2[normalize-space()='Subscription']"));
	    js.executeScript("arguments[0].scrollIntoView();",element);
	}
	@When("Verify {string} is visible")
	public void verify_is_visible(String string) {
	    String verifyTest = driver.findElement(By.xpath("//h2[normalize-space()='Subscription']")).getText();
	    Assert.assertTrue(verifyTest.equalsIgnoreCase(string));
	}
	@Then("Click on arrow at bottom right side to move upward")
	public void click_on_arrow_at_bottom_right_side_to_move_upward() {
	    driver.findElement(By.xpath("//i[@class='fa fa-angle-up']")).click();
	}
	@Then("Verify that page is scrolled up and {string} text is visible on screen")
	public void verify_that_page_is_scrolled_up_and_text_is_visible_on_screen(String string) {
		System.out.println(string);
//	    String textVerification = driver.findElement(By.xpath("")).getText();
//	    System.out.println("Text on screen: "+textVerification);
//	    Assert.assertTrue(textVerification.contains(string));
	    driver.quit();
	}
}
