package TestRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"StepDefinition","Hooks"},
        //tags = ("not @LOCAL_SIGNIN"),
        plugin = {"pretty","html:target/HtmlReport/report.html",
        		"json:target/JSONReport/report.json",
        		"timeline:test-output-thread/",
        		"html:target/cucumber-reports/dsalgo.html",
        		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        		"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}        
       // monochrome=true
		
		)


public class TestRunnerTestng extends AbstractTestNGCucumberTests{


	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios() {
		System.out.println("Executing run scenarios");
		return super.scenarios();
	}

}



//package TestRunner;
//
//import org.junit.runner.RunWith;
//import org.testng.annotations.DataProvider;
// 
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
// 
//@RunWith(Cucumber.class)
//@CucumberOptions(features="src/test/resources/Features",glue= {"StepDefinition","hooks"},
//plugin={"pretty",
//		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
//		"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
//		"html:target/cucumber-reports/dsalgo.html","json:target/MyReports/report.json",
//		"html:target/MyReports/report2.json","junit:target/MyReports/report1.json",
//		"timeline:test-output-thread/"}
//		)
//
//public class TestRunnerTestng extends AbstractTestNGCucumberTests{
//	@DataProvider(parallel=true)
//	public Object[][]scenario() {
//		return super.scenarios();
//	}
//}
