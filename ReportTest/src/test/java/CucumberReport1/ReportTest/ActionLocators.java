package CucumberReport1.ReportTest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActionLocators {

	
	@FindBy(name="username") WebElement uname;
	@FindBy(name="password") WebElement pass;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button") WebElement loginbtn;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p") WebElement error;
}
