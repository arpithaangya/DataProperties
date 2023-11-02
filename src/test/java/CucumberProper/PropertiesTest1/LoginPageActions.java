package CucumberProper.PropertiesTest1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;



public class LoginPageActions {

	WebDriver driver = new EdgeDriver();
	LoginLocators loc;
	//String strUserName,strPassword,strUrl;
	
	public LoginPageActions()
	{
		this.loc = new LoginLocators();
		PageFactory.initElements(HelperClass.getDriver(), loc);
	}

		public void setUserName(String strUserName) {
			loc.username.sendKeys(strUserName);
		}
	
		public void setPassword(String strPassword) {
			loc.password.sendKeys(strPassword);
		}
		//click on login button
		public void clicklogin() {
			loc.login.click();
		}
	
		
		
	public void login(String strUserName, String strPassword) {
		
		setUserName(strUserName);
		setPassword(strPassword);
		
		
	}
	
	
	
}
