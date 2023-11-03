package RunnerPackage;



import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags="@ValidCredentials",features="/ParaBank/src/test/resources/features/Register.feature", glue="CucumberPractice2.ParaBank")

public class RunnerRegister {
	
	
	
	
}