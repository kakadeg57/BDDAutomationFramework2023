package runner;


import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = "C:/Users/Lenovo/IdeaProjects/BDDFrameworkTestAutomation/src/test/resources/featurefiles/crmloginpage.feature",
        glue = "stepdefination"
)
public class TestRunner
{
}
