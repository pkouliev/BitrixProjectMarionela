package com.Bytrix.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

                features="@target/failed-reports.txt",

                        glue="com/Bytrix/Step_Definitions"
)
public class RunFailesTests {

}
