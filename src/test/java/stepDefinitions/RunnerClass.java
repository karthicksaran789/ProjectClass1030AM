package stepDefinitions;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        stepNotifications = true,
        snippets = SnippetType.CAMELCASE,
        publish = true,
        plugin = {"pretty","json:target/output.json"},
        features = "src/test/resources/Features",
        glue = "stepDefinitions"
)
public class RunnerClass {

    @AfterClass
    public static void afterClass() {
        Reporting.generateJVMReport("target/output.json");
    }
    
    public static void main(String[] args) {
		
    	System.out.println("Java");
    	System.out.println("Selenium");
    	System.out.println("API");
    	System.out.println("Appium");
    	System.out.println("Manual");
	}
}




