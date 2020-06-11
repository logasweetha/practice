package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import junit.framework.Assert;

public class Home {

	/*@FindBy(css="area[alt='Bengaluru']")
	WebElement bangalore;
	
	@FindBy(css="area[alt='Hyderabad']")
	WebElement hydrabad;
	
	public void validate_bangalore(){
		if(bangalore.isDisplayed()){
			System.out.println("bangalore is displayed");
		}
		else{
			System.out.println("bangalore is not displayed");
		}
		
		if(hydrabad.isDisplayed()){
			System.out.println("hydrabad is displayed");
		}
		else{
			System.out.println("hydrabad is not displayed");
		}
		
		bangalore.click();
	}*/
	WebDriver driver;
	
	@FindBy(xpath="//div[@class='option-container allsubmenu1-2']//a[@class='M13_75'][contains(text(),'Frocks & Dresses')]")
	WebElement frocks;
	
	@FindBy(xpath="//div[@class='list_img wifi']//img[@title='Babyhug Sleeveless Frock Butterfly Print - Navy Blue & White']")
	WebElement selectDress;
	
	
	
	public void click_on_frocks(){
		if(frocks.isDisplayed()){
			System.out.println("frocks & dreses displayed");
		}
		else{
			System.out.println("frocks not displayed");
		}
		frocks.click();
	}
	public void select_dress(){
		
		
		selectDress.click();
		
			}
			
	
	
	
}
