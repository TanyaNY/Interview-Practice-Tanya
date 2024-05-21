package CTHMS.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/java/CTHMS/features",
        glue = "CTHMS.steps",
        tags = "@Progression",
        dryRun = false
)
public class RunCTHMSProgressionTest extends AbstractTestNGCucumberTests {
}
