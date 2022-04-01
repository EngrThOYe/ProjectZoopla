package co.uk.zoopla.Runner;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/java/co/uk/zoopla/Features"},
        glue = {"co/uk/zoopla/Hook", "co/uk/zoopla/StepDefinitions"},
        publish = true,
        tags = "@smokeTest"
        //tags = "@smokeTest or @smokeTest2"
        //tags = "@smokeTest and @smokeTest2" not working
        //tags = "@smokeTest" will run @smokeTest
        //tags = "not @ignore" will run all test except @ignore scenario
)

public class TestRunner {
}