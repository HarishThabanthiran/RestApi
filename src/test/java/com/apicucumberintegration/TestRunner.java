package com.apicucumberintegration;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\harish.t\\eclipse-workspace\\Rest\\Features\\getRequest.feature", glue= {"com.apicucumberintegration"}, plugin= {"html:target/cucumber"}, tags= {"@get"}, dryRun=false, monochrome=true)

public class TestRunner {

}
