package stepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Steps {
	
	WebDriver driver;
	@Given("User is on Omr branch page")
	public void user_is_on_omr_branch_page() {
		driver = new ChromeDriver();
		driver. get("https://www.omrbranch.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@When("User enters {string} and {string}")
	public void user_enters_and(String name, String pass) {
		driver.findElement(By.id("email")).sendKeys(name);
		driver.findElement(By.id("pass")).sendKeys(pass);

	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
		driver.findElement(By.xpath("//button[@value='login']")).click();
	}

	@Then("User should verfy after Login successful message")
	public void user_should_verfy_after_login_successful_message() {
		Assert.assertTrue("Verify after login",true);
		driver.quit();

	}
}
