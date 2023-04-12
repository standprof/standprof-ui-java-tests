package standprof.qa.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(glue={"src/test/java/steps"}, features = "src/test/resources", plugin = { "pretty", "html:target/site/cucumber-pretty",
        "json:target/cucumber.json"})
class RunCucumberTests {
}
