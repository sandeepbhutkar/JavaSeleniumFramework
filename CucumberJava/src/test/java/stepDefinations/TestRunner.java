package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features",
		glue= {"stepDefinations"},
		plugin = {"pretty","html:target/HtmlReports.html"},
		tags = "@tag1"
		)
public class TestRunner {

}
