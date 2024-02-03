package TestEmag.EmagTest.TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features"},
        glue = {"src/main/java/TestEmag/EmagTest/Steps"},
        plugin = "pretty")

public class TestRunner {
}
