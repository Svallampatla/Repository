package Runner;

import org.junit.runner.RunWith;

import StepDefination.LogStepDefination;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:/SangeethCucumberFramework/src/main/java/Features"
,glue={"stepDefinition"})



public class TestRunner  extends LogStepDefination{

}
