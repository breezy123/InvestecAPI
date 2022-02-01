package InvestecAPI.co.za.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        monochrome = true,
        //dryRun = false,
        features = {"src/test/java/InvestecAPI/co/za/feature"},//digiOutsource.co.za

        glue = {"InvestecAPI.co.za.stepdef"},

        plugin = {"pretty",
                "html:target/cucumber-htmlreport",
                "json:target/cucumber-reportInvestecAPI.json",
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReportInvestecAPI.html"})
public class Runner extends AbstractTestNGCucumberTests {
}
