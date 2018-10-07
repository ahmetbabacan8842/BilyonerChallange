package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "steps",
        features = "src/test/java/resources",
        monochrome = true,
        plugin = {"pretty", "html:target/bilyoner", "json:target/bilyoner.json"}
)
public class RunCucumberTest {
}
