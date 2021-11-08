package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features" ,
        glue = "stepDefinitions",
        dryRun = false,
        monochrome = true,
        tags = "@login",
        plugin = {"pretty",
                "html:target/cucumber-default-reports",
                "rerun:target/failedTest.txt",
                "json:target/cucumber.json"
        }
)

public class RegressionRunner {
}
