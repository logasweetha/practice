package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement submenu = driver.findElement(By.xpath("//a[text()='STORES & PLAYSCHOOLS']"));
		js.executeScript("arguments[0].mouseOver", submenu);
		action.moveToElement(submenu).perform();
		WebElement playschool = driver.findElement(By.cssSelector("li[id='allsubmenu2-18']"));
		js.executeScript("arguments[0].mouseOver", playschool);
		action.moveToElement(playschool).perform();*/
		//home.validate_bangalore();
		
		WebElement girlFashion=driver.findElement(By.xpath("//a[@class='M13_75'][contains(text(),'GIRL FASHION')]"));
		action.moveToElement(girlFashion).perform();
		
		Home home=PageFactory.initElements(driver, Home.class);
		home.click_on_frocks();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,1000)");
		
		//home.select_dress();
		
		Thread.sleep(500);
		//WebElement addToCart=driver.findElement(By.xpath("//div[@class='btn btn-add-cart add-cart']//span[@class='step1 M16_white']"));

		
		/*Thread.sleep(1000);
		if(addToCart.isDisplayed()){
			System.out.println("add to cart dislayed");
		}
		else{
			System.out.println("add to cart is not dislayed");
		}*/
		
	}

	@Then("^validated the correct details$")
	public void validated_the_correct_details() throws Throwable {
	}

}
