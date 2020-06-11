package stepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abstraction {

	
	protected static WebDriver driver;
	
	protected WebDriver getDriver(){
		if (driver==null)
		{
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\RATHISH\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}
}
