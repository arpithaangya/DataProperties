package CucumberProper.PropertiesTest1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDefinition {
	
	LoginPageActions obj = new LoginPageActions();
	Utility objUt = new Utility();
	@Given("User is on Login page Url")
	public void user_is_on_login_page_url() {
	  System.out.println("login page ");
//	  System.out.println("url "+objUt.strUrl);
	  
	  HelperClass.openPage(objUt.strUrl);
	}

	@When("User gives username and password")
	public void user_gives_username_and_password() {
		 System.out.println("username and password ");
		obj.login(objUt.strUserName, objUt.strPassword);
		 
	}

	@When("User clicks on login")
	public void user_clicks_on_login() {
		System.out.println("click ");
		obj.clicklogin();
	}

	@Then("User successfully logged in")
	public void user_successfully_logged_in() {
	 
	}



}
