package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features/B2B/Search_Corporate/Add_Assigment_Corporate.feature",
        glue = "StepDefinitions.B2B",
        dryRun = false,
//        tags = "@1",
        monochrome = true
)
public class Test_Runner {
}
