package CucumberPractice2.ParaBank;

import io.cucumber.java.Before;

public class HookRegister {
	
	@Before
	public void setUp() {
		HelperRegister.setUpDriver();
	}
}
