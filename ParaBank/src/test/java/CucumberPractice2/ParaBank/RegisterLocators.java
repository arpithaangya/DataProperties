package CucumberPractice2.ParaBank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterLocators {
	
	@FindBy(name="customer.firstName") WebElement fname;
	@FindBy(name="customer.lastName") WebElement lname;
	@FindBy(name="customer.address.street") WebElement address;
	@FindBy(name="customer.address.city") WebElement city;
	@FindBy(name="customer.address.state") WebElement state;
	@FindBy(name="customer.address.zipCode") WebElement zipcode;
	@FindBy(name="customer.phoneNumber") WebElement phone;
	@FindBy(name="customer.ssn") WebElement ssn;
	@FindBy(name="customer.username") WebElement username;
	@FindBy(name="customer.password") WebElement pass;
	@FindBy(name="repeatedPassword") WebElement confirm;
	@FindBy(xpath="//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input") WebElement register;
	
	@FindBy(xpath="//*[@id=\"rightPanel\"]/p") WebElement welcome;
	
	@FindBy(xpath="//*[@id=\"customer.username.errors\"]") WebElement error;
}
