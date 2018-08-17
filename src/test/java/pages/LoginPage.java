package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(id="email") WebElement emailId;
	@FindBy(id="pass") WebElement password;
	@FindBy(id="send2") WebElement loginButton;
	@FindBy(css="div.header.content > div.panel.header > ul.header.links > li.customer-welcome > span.customer-name > button.action.switch") WebElement dropdown;
	@FindBy(css="li.customer-welcome.active > div.customer-menu > ul.header.links > li.authorization-link > a") WebElement signOutLink;
	
	public LoginPage(WebDriver ldriver)
	{
		this.driver = ldriver;
	}
	
	public void read(String input)
	{
		
	}
	
	public void loginApplication(String userName, String pass)
	{
		emailId.sendKeys(userName);
		password.sendKeys(pass);
		loginButton.click();
	}
	
	public void logOutApplcation()
	{
		dropdown.click();
		signOutLink.click();
	}
	

}
