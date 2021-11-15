package com.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.BaseClass.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\AdactinFeature\\Adactin.Feature",
					glue="com.StepDefinition",
					monochrome=true, dryRun=false, strict=false,
				tags={"@smokeTest, @sanityTest"},
				plugin={"html:Report/HtmlReport", "pretty",
						"json:JsonReport/Report.json",
						"com.cucumber.listener.ExtentCucumberFormatter:CucumberReport/ExtentReport.html"
					}
		)

public class TestRunner {
	
	public static WebDriver wd;
	
	@BeforeClass
	public static void setup() {
		wd = Base_Class.Browser("chrome");
	}
	
	@AfterClass
	public static void teardown() {
		wd.quit();
	}
}