package com.SFDCloginCucumber.runnerfiles;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/login.feature"},
                      glue = {"com.SFDCloginCucumber.stepdefns"} ,
                      dryRun = false,
                      monochrome= true,
                      plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                    		  "html:target/cucumber-pom-selenium.html","json:target/cucumber.json"},
                      tags = "@Smoke or @Functional"
                      
                 
)
public class SFDCLoginRunner extends AbstractTestNGCucumberTests {

}
