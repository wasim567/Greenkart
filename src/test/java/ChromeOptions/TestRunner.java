package ChromeOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/feature", glue="stepdefenation", monochrome=true, strict=true, plugin={"pretty", "html:target/cucumber/index.html", "json:target/cucumber/cucmber.json", "junit:target/cucumber/cukes.xml"})
public class TestRunner {


}
