package co.library.demo6.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/java/resources/featurefile/verify.feature",
        glue = "co/library/demo6",
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html"}
)
public class TestRunner {
}
