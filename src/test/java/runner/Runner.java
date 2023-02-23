package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		plugin = "pretty",
		monochrome = true,
		features = "src/test/resources/features",
		tags = "@run",
		glue = {"steps"}
		)
public class Runner {

}
