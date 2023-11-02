package CucumberProper.PropertiesTest1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLocators {
	@FindBy(name="username")
	public WebElement username;
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(xpath="//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	public WebElement login;
	
}
