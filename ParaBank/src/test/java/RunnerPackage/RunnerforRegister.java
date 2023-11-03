

package RunnerPackage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="@ValidCredentials",features="C:\\Users\\ashekharangya\\eclipse-workspace\\ParaBank\\src\\test\\resources\\features\\Register.feature", glue="CucumberPractice2.ParaBank")
public class RunnerforRegister extends AbstractTestNGCucumberTests{
	
		
}
