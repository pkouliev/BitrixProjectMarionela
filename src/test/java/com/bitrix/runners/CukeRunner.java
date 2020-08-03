package com.bitrix.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
            plugin = {"html:target/html-reports.html",
                    "json:target/json-reports.json",
                    "rerun:target/failed-reports.txt"},

            features = "src/test/resources/Features",
            glue = "com/bitrix/step_definitions",
            dryRun = false,
            tags = "@upload")
public class CukeRunner {

}
