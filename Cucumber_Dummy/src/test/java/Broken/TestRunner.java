package Broken;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\BrokenLink.feature",glue="Broken",dryRun=false)
public class TestRunner {

}
