package CucumberPractice2.ParaBank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLocators {
	
	@FindBy(name="username") WebElement username;
	@FindBy(name="password") WebElement password;
	@FindBy(xpath="//*[@id=\"loginPanel\"]/form/div[3]/input") WebElement login;
}
