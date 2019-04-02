package org.basicrequestscucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\harish.t\\eclipse-workspace\\Rest\\Features\\basicRequests.feature", glue= {"org.basicrequestscucumber"}, plugin= {"html:target/cucumber"}, tags= {"@requests"}, dryRun=false, monochrome=true)


public class TestRunner {

}
