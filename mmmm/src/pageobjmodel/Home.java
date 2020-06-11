package pageobjmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {
	
	WebDriver driver;
	
	
	@FindBy(xpath="//li[@class='menu-cell'][1]")
	WebElement bankAndSave;
	
	@FindBy(xpath="//div[@class='column-inner-tab-cell']//span[text()='Personal Savings']")
	WebElement personalSaving;
	
	@FindBy(xpath="//h6[text()='Savings Maximiser']")
	WebElement savingMax;
	
	@FindBy(xpath="//div[@class='savings-main']//a[text()='Open now' and @aria-role='button']")
	WebElement openNow;
	
	@FindBy(xpath="//a[@tabindex='2']")
	WebElement newCust;
	
	
	public void click_on_bankAndSave(){
		bankAndSave.click();
	}
	
	public void click_on_personalSaving(){
		personalSaving.click();
	}
	public void click_on_savingMax(){
		savingMax.click();
	}
	public void click_on_openNow(){
		openNow.click();
	}
	public void click_on_newCust(){
		newCust.click();
	}
}
