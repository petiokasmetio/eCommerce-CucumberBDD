package TestRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions
        (
                features = ".//Features//Customers.feature",
                //features = ".//Features//Login.feature",
                glue = "StepDefinitions",
                dryRun = false,
                monochrome = true,
                plugin =
                        {
                                "pretty",
                                "html:test-output"
                        }
        )
public class TestRunner {
}
