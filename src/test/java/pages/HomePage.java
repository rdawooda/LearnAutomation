package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage {

	
	WebDriver driver;
	
	public HomePage(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	@FindBy(css="div.header.content > div.panel.header > ul.header.links > li.authorization-link > a") WebElement signInLink;
	
	@FindBy(xpath="//span[text()='Welcome']") WebElement welcomeText;
	
	@FindBy(xpath="//a[text()='Create an Account']") WebElement createAnAccountLink;
	
	@FindBy(xpath="//span[text()='My Cart']") WebElement myCart;
	
	public void clickOnsigninLink()
	{
		signInLink.click();
	}
	
	public void clickcreateAnAccountLink()
	{
		createAnAccountLink.click();
	}
	
	public void verifyWelComeText()
	{
		Assert.assertEquals(welcomeText.getText(), "Welcome");
	}
	
	public void clickMyCartImage()
	{
		myCart.click();
	}
	
	public String getApplicationTitle()
	{
		return driver.getTitle();
	}
	
	public void waitForElementToBeVisible()
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		 
		signInLink = wait.until(ExpectedConditions.elementToBeClickable(signInLink));
	}
	
}
