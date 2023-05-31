package cucumberjava;

import org.junit.runner.RunWith; 
import io.cucumber.junit.Cucumber; 
import io.cucumber.junit.CucumberOptions;;

@RunWith(Cucumber.class) 
@CucumberOptions(plugin = {"pretty","json:target/cucumber/cucumber.json","html:target/CucumberTestReport.html"},
features= {"src/test/resources/cucumberjava"},glue= {"cucumberjava"})

public class RunTest {

}
