import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features",
        glue = "Steps",
        tags = "@TestReport",
        plugin = {"json:target/cucumber.json"}
)
public class CucumberRunner {
}