package tuhoc.ngay2512;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty" }, 
features = "src\\test\\resources\\tuhoc", 
monochrome = true,
glue = "stepDefi")
public class RunCucumberTest {
}