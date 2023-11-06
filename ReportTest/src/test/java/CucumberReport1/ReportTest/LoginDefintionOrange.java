package CucumberReport1.ReportTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDefintionOrange {
	
	ActionOrange obj = new ActionOrange();
	Utility2 objUt = new Utility2();
	ActionLocators loc = new ActionLocators();
	
	@Given("User is on Login  Url")
	public void user_is_on_login_url() {
		 System.out.println("login page ");
	  System.out.println("url "+objUt.strUrl);
	  
	  HelperClassOrange.openPage(objUt.strUrl);
	}

	@When("User gives username , password")
	public void user_gives_username_password() {
		 System.out.println("username and password ");
		obj.login(objUt.strUserName, objUt.strPassword);
	}

	@When("User clicks  login")
	public void user_clicks_login() {
		System.out.println("click ");
		obj.clicklogin();
	}

	@Then("User successfully logged")
	public void user_successfully_logged() {
	  Assert.assertFalse(loc.error.isDisplayed(),"INvalid ");
	}


	  

}
