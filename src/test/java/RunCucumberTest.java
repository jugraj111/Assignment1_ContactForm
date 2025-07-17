import io.cucumber.core.backend.Glue;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import setup.driver.SeleniumWebDriver;

import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features/contactForm.feature"},
        glue = {"assignment.solution"}

)
        public class RunCucumberTest extends SeleniumWebDriver  {
            @BeforeClass
            public static void initDriver() throws IOException, InterruptedException {
                initChrome();
                driver.manage().window().maximize();
                Thread.sleep(3000);
            }

            @AfterClass
            public static void tearDown() {
                closeDriver();
            }
        }