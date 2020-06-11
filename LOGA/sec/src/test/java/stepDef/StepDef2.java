package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.Home;
import utils.ReaData_Property;

public class StepDef2 extends Abstraction {

	WebDriver driver = getDriver();

	@Given("^launch the browser$")
	public void launch_the_browser() throws Throwable {
		String envUrl = ReaData_Property.getproper("url");
		driver.get(envUrl);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	}

	@When("^find the required details$")
	public void find_the_required_details() throws Throwable {

		WebElement allCatogory = driver.findElement(By.cssSelector("li[class='B14_42 allcat']"));
		Actions action = new Actions(driver);
		action.moveToElement(allCatogory).perform();

		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement submenu = driver.findElement(By.xpath("//a[text()='STORES & PLAYSCHOOLS']"));
		js.executeScript("arguments[0].mouseOver", submenu);
		action.moveToElement(submenu).perform();
		WebElement playschool = driver.findElement(By.cssSelector("li[id='allsubmenu2-18']"));
		js.executeScript("arguments[0].mouseOver", playschool);
		action.moveToElement(playschool).perform();
		Home home=PageFactory.initElements(driver, Home.class);
		home.validate_bangalore();
		
		//WebElement girlFashion=driver.findElement(By.cssSelector("li[class='categry inactive hactive']"));
		//action.moveToElement(girlFashion).perform();
		
	}

	@Then("^validated the correct details$")
	public void validated_the_correct_details() throws Throwable {
	}

}
