package Runnerfolder;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\ashekharangya\\eclipse-workspace\\ReportTest\\src\\test\\resources\\Features\\Loginfeature.feature", glue = "CucumberReport1.ReportTest",plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})



public class runnerTestngorange {

}

