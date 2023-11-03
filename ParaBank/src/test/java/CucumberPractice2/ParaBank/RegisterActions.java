package CucumberPractice2.ParaBank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class RegisterActions {
	WebDriver driver = new EdgeDriver();
	RegisterLocators loc;
	
	
	public RegisterActions() {
		this.loc = new RegisterLocators();
		PageFactory.initElements(HelperRegister.getdriver(), loc);
	}
	
	public void setfirstname(String fname) {
			loc.fname.sendKeys(fname);
	}
	
	public void setlastname(String lname) {
		loc.lname.sendKeys(lname);
	}
	
	public void setaddress(String add) {
		loc.address.sendKeys(add);
	}
	
	public void setcity(String city) {
		loc.city.sendKeys(city);
	}
	
	
	public void setstate(String state) {
		loc.state.sendKeys(state);
	}
	
	public void setzip(String zip) {
		loc.zipcode.sendKeys(zip);
	}
	
	
	public void setphone(String phone) {
		loc.phone.sendKeys(phone);
	}
	
	
	public void setssn(String ssn) {
		loc.ssn.sendKeys(ssn);
	}
	
	
	public void setuname(String uname) {
		loc.username.sendKeys(uname);
	}
	
	public void setpass(String uname) {
		loc.pass.sendKeys(uname);
	}
	
	
	public void setConfirm(String confirm) {
		loc.confirm.sendKeys(confirm);
	}
	
	public void click() {
	loc.register.click();
	}
	
	
	public void name(String strfirst, String strlast) {
		
	setfirstname(strfirst);
	setlastname(strlast);
	}

	public void city(String stradd, String strcity) {
	
	setaddress(stradd);
	setcity(strcity);
	
	}
	
	
	public void state(String strstate, String strzip) {
		
		setstate(strstate);
		setzip(strzip);
		
		}
	
	
	
	public void number(String strphone, String strssn) {
		
		setphone(strphone);
		setssn(strssn);
		
		}
	

	public void user(String struname, String strpass,String strconfirm) {
		
		setuname(struname);
		setpass(strpass);
		setConfirm(strconfirm);
		}
	
	
	public String error() {
		
		return loc.error.getText();
	}
	
	
}
