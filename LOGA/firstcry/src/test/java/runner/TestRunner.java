package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\RATHISH\\workspace\\LOGA\\sec\\src\\main\\java\\feature\\com\\baby.feature",
glue={"stepDef"},
plugin={"html:target/cucumber-html-report"})
public class TestRunner {

}
