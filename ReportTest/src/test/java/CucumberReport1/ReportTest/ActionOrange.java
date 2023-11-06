package CucumberReport1.ReportTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;

public class ActionOrange {
	WebDriver driver = new EdgeDriver();
	ActionLocators loc;
	//String strUserName,strPassword,strUrl;
	
	public ActionOrange()
	{
		this.loc = new ActionLocators();
		PageFactory.initElements(HelperClassOrange.getDriver(), loc);
	}

		public void setUserName(String strUserName) {
			loc.uname.sendKeys(strUserName);
		}
	
		public void setPassword(String strPassword) {
			loc.pass.sendKeys(strPassword);
		}
		//click on login button
		public void clicklogin() {
			loc.loginbtn.click();
		}
	
		
	public void login(String strUserName, String strPassword) {
		
		setUserName(strUserName);
		setPassword(strPassword);
		
		
	}
}
