package org.runnerclass;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\resources\\FeatureFile\\FBLoginPage.feature",glue="org.stepdef",
				 monochrome = true)
// Pretty is used to get the proper alignment like font, size, format etc...
public class FBRunnerClass {

}
