package cucumberjava;

import org.junit.runner.RunWith; 
import io.cucumber.junit.Cucumber; 
import io.cucumber.junit.CucumberOptions;;

@RunWith(Cucumber.class) 
@CucumberOptions(plugin = {"pretty"},
features= {"src/test/resources/cucumberjava"},glue= {"cucumberjava"})

public class RunTest {

}
