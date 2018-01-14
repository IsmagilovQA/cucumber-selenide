package com.cucumber.tests;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

    @CucumberOptions(
            features = "src/test/resources/features/FindingTickets.feature"
    )


public class TestRunner extends AbstractTestNGCucumberTests{

}
