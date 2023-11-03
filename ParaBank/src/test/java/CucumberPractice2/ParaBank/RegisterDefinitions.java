package CucumberPractice2.ParaBank;


import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterDefinitions {
	
	RegisterActions act = new RegisterActions();
	PropertyClass pro = new PropertyClass();
	RegisterLocators loc = new RegisterLocators();
	@Given("Give Url")
	public void give_url() {
		 HelperRegister.openUrl(pro.strUrl);
	}

	@When("Giving firstname and lastname")
	public void giving_firstname_and_lastname() {
		act.name(pro.strfname, pro.strlname);
	    
	}

	@When("Giving address and city")
	public void giving_address_and_city() {
		act.city(pro.stradd, pro.strcity);
	}

	@When("Giving state and zipcode")
	public void giving_state_and_zipcode() {
		act.state(pro.strstate, pro.strzip);
	}

	@When("Giving phone number and ssn")
	public void giving_phone_number_and_ssn() {
		act.number(pro.strphone, pro.strssn);
	}

	@When("Giving username,password and confirm password")
	public void giving_username_password_and_confirm_password() {
		act.user(pro.struname, pro.strpass,pro.strconfirm);
	}

	@Then("Click register button")
	public void click_register_button() {
	   act.click();
	  String error= act.error();
	 
	  Assert.assertEquals(error, "This username already exists.","Register is  already registered ");
	}



}
