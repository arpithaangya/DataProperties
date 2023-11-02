package CucumberProper.PropertiesTest1;

import io.cucumber.java.Before;

public class HookClass2 {
	@Before
	public static void setUp() {
		HelperClass.setUpDriver();
	}
	
}
