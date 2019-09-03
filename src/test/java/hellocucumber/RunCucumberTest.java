package hellocucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","summary"}
        , features = "src/test/resources/hellocucumber/image_recongnize_api.feature"
        , monochrome = true
)
public class RunCucumberTest
{
}