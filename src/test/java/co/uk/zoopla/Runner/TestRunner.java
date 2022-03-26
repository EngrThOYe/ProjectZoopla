package co.uk.zoopla.Runner;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/java/co/uk/zoopla/Features"},
        glue = {"co/uk/zoopla/Hook", "co/uk/zoopla/StepDefinitions"},
        publish = true
)

public class TestRunner {
}