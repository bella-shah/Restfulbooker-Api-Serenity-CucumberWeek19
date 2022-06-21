package com.herokuapp.restful_booker.cucumber;

import com.herokuapp.restful_booker.testbase.TestBaseBooking;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/java/resources/feature",//path from feature file
 tags = "@SMOKE")
public class CucumberRunner extends TestBaseBooking {

}
