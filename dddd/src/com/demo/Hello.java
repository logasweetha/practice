package com.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hello {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\RATHISH\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.ing.com.au/");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//li[@class='menu-cell'][1]")).click();
	
	driver.findElement(By.xpath("//div[@class='column-inner-tab-cell']//span[text()='Personal Savings']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//h6[text()='Savings Maximiser']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@class='savings-main']//a[text()='Open now' and @aria-role='button']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@tabindex='2']")).click();
	
	
	WebDriverWait wait=new WebDriverWait(driver, 100);
	WebElement singleradio=driver.findElement(By.xpath("//label[@class='style-scope ing-radio-button-group' and @for='singleOrJointButtons-0']"));
	wait.until(ExpectedConditions.visibilityOf(singleradio));
	wait.until(ExpectedConditions.elementToBeClickable(singleradio));
	JavascriptExecutor executor=(JavascriptExecutor)driver;
	executor.executeScript("argument[0].click();",singleradio);
	
	
	
	
	driver.findElement(By.xpath("//ing-field[@class='filter-input style-scope ing-input ']")).click();
	
	
	WebElement nationality=driver.findElement(By.xpath("//ing-field[@class='filter-input style-scope ing-input ']"));
	
	nationality.click();
	nationality.sendKeys("INDIA");
	nationality.sendKeys(Keys.DOWN);
	nationality.sendKeys(Keys.ENTER);
	
	
	WebElement title=driver.findElement(By.xpath("//input[@id='titleDropdown_targetInput']"));
	title.click();
	title.sendKeys("Mr");
	title.sendKeys(Keys.DOWN);
	title.sendKeys(Keys.ENTER);
	
	
	driver.findElement(By.xpath("//label[@for='female']")).click();
	
	driver.findElement(By.xpath("//input[@aria-label='Given name']")).sendKeys("loga");

	driver.findElement(By.xpath("//input[@aria-label='Middle name (if you have one)']")).sendKeys("swee");
	
	driver.findElement(By.xpath("//input[@aria-label='Family name']")).sendKeys("hello");
	//driver.findElement(By.xpath("//input[@pattern='^(\\d{1,2}[\/|\\| |-]\\d{1,2}[\/|\\| |-]\\d{4})$|^\\d{8}$']")).sendKeys("24/08/1997");
	
	
}
}