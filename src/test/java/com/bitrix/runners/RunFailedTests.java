package com.bitrix.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/failed-reports.txt",
        glue = "com/bitrix/step_definitions"
)
public class RunFailedTests {

}
