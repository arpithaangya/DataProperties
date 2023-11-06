package CucumberReport1.ReportTest;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hookClass3 {
		@Before
		public static void setUp() {
			HelperClassOrange.setUpDriver();
		}
		
		
		@After
		public static void tearDown(Scenario scenario) {
			if(scenario.isFailed()) {
				
				final byte[] screenshot = ((TakesScreenshot) HelperClassOrange.getDriver()).getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot, "image.png", scenario.getName());
				
			}
			HelperClassOrange.tearDown();
		}
		
		
		
}