package CucumberPractice2.ParaBank;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.internal.ClassHelper;

public class HelperRegister {
	
	private static WebDriver driver;
	private static WebDriverWait wait;
	private static HelperRegister helperClass;
	
	HelperRegister(){
		driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	public static void openUrl(String url) {
		driver.get(url);
	}
	public static WebDriver getdriver() {
		return driver;
	}
	
	public static void setUpDriver() {
		if(helperClass == null) {
			helperClass = new HelperRegister();
		}
	}
	
	
	
	
}
