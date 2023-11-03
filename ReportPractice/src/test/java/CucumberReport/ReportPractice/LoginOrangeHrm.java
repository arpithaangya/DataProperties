package CucumberReport.ReportPractice;



import java.time.Duration;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LoginOrangeHrm {
	  WebDriver driver;
		
		@Before
		public void beforemethod() {
			driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.manage().window().maximize();
		}
		
		@Given("User is on HRMLogin Webpage")
		public void user_is_on_hrm_login_webpage() {
		    driver.get("https://opensource-demo.orangehrmlive.com/");
		}
	 
		@When("User provides valid credentials")
		public void user_provides_valid_credentials(DataTable datatables) {
		    System.out.println("Credentials Entered");
		    List<Map<String,String>> signUpForm = datatables.asMaps(String.class, String.class);
		    for(Map<String,String> form : signUpForm) {
		    	String username = form.get("Username");
		    	System.out.println("Username:" +username);
		    	driver.findElement(By.name("username")).sendKeys(username);
		    	
		    	String password = form.get("Password");
		    	System.out.println("Password:" +password);
		    	driver.findElement(By.name("password")).sendKeys(password);
		    	
		    	driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		    }
		}
		
		@Then("User should be able to login successfully and see homePage")
		public void user_should_be_able_to_login_successfully_and_see_home_page() {
		    
		}

		@Then("User able to see unsuccessfull with error message")
		public void user_able_to_see_unsuccessfull_with_error_message() {
		  
		}


	 
}
