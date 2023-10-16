package com.fetch.step_defs;

import com.fetch.utilities.ConfigurationReader;
import com.fetch.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class PreAndPost {
    @Before
    public void setUp(){
        Driver.getDriver().get("http://sdetchallenge.fetch.com/");

    }

    @After
    public void tearDown(){
        Driver.closeDriver();

    }

}
