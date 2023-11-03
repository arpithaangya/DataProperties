package RunnerReport;

import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features = "/src/test/resources/Features/Reportdatatable.feature", glue = "CucumberReport.ReportPractice"
, plugin = {"pretty","html:target/Cucumber-reports/Cucumber.html","pretty","json:target/Reports/Cucumber.jason","pretty","junit:target/Test-reports/Cucumber.xml"} , monochrome = true, dryRun = true)
public class RunnerReports {

}
