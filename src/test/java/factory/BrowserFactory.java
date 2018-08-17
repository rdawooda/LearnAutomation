package factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dataProvider.ConfigDataProvider;

public class BrowserFactory {

	static WebDriver driver;
	
	public static WebDriver getBrowser(String browserName)
	{
		//ConfigDataProvider config = new ConfigDataProvider();
		if(browserName.equalsIgnoreCase("fireFox"))
		{
			System.setProperty("webdriver.firefox.marionette",DataProviderFactory.getConfig().getChromePath());	
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("chrome"))
			{
			
			System.setProperty("webdriver.chrome.driver",DataProviderFactory.getConfig().getFireFoxPath());
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
	}
	
	public static void closeBrowser(WebDriver ldriver)
	{
		ldriver.quit();
		
	}
}
