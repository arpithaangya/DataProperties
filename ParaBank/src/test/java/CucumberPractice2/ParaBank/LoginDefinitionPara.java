package CucumberPractice2.ParaBank;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDefinitionPara {
		
	WebDriver driver;
	PropertyClass pro = new PropertyClass();
	LoginLocators loc = new LoginLocators();
	RegisterActions act;
	
	
	@Given("login page URL")
	public void login_page_url(String url) {
		System.out.println("Open website");
		driver.get(url);
	}

	
	
	@When("User enters username as {string}")
	public void user_enters_username_as() {
		
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String string) {
		
	}

	@When("User clicks login")
	public void user_clicks_login() {
	   
	}

	@Then("User will login or fails")
	public void user_will_login_or_fails() {
	    
	}



}
