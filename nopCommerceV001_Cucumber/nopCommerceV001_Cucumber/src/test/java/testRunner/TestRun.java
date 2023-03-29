package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
         (
         features=".//Features/Login.feature",
         glue="stepDefinitions",
         dryRun= false,//if given true, it will check error first in code.
         monochrome=true,// do not display unwanted in console
         plugin= {"pretty","html:target/HtmlReports.html"}
         
        		 
        		 )
public class TestRun {

}

//part 1 completed. start with part2
