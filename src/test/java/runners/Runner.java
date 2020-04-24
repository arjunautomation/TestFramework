package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-Reports", "json:target/report.json"},
        features = "src/test/features",
        glue = "steps",
        tags = "@amazon3",
        dryRun = false
)
public class Runner {

}
