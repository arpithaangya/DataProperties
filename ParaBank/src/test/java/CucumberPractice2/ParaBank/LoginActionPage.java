package CucumberPractice2.ParaBank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginActionPage {
	WebDriver driver = new EdgeDriver();
	LoginLocators loc;
	
	
		public LoginActionPage() {
			this.loc = new LoginLocators();
			PageFactory.initElements(HelperRegister.getdriver(), loc);
		}
		
		
		public void setuname1(String uname) {
				loc.username.sendKeys(uname);
		}
		
		public void setpass1(String pass) {
			  loc.password.sendKeys(pass);
		}
		
		public void clicklogin() {
			loc.login.click();
		}
		
		public void cred(String uname,String pass) {
			setuname1(uname);
			setpass1(pass);
		}
}
