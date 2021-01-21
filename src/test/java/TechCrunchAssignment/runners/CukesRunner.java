package TechCrunchAssignment.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json"},
        features = "src/test/resources/features",
        glue = "TechCrunchAssignment/step_definitions",
        dryRun= false,
        tags="@assignment"

)
public class CukesRunner {

}