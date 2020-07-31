package com.Bytrix.Step_Definitions;

import com.Bytrix.Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @After (order = 1)
   public void tearDown(Scenario scenario){

       if(scenario.isFailed()){

           byte screenshot[]=   ((TakesScreenshot )Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

        scenario.attach(screenshot, "image/png", scenario.getName());
       }
       Driver.closeDriver();
   }

}
