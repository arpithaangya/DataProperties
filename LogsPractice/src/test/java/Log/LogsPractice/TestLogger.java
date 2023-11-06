package Log.LogsPractice;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestLogger {
		
	public static WebDriver driver;
	public static org.apache.logging.log4j.Logger log;
	
	public static void main(String[] args) {
		
		
		log = LogManager.getLogger(TestLogger.class);
		
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		log.info("opened google");
		try {
			boolean text = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).isEnabled();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			log.error("Exception occured", new Exception("Element not found"));
			
		}
		finally {
			driver.quit();
			log.info("Quitting the driver ");
		}
		
	}
}
