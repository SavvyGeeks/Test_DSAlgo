package com.qa.factory;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.qa.util.ConfigReader1;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
    private static WebDriver driver;
    private static ConfigReader1 configReader;
    //public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

    private static WebDriver init_driver(String Browser) {
        System.out.println(" Drive Factory browser value is :" + Browser);
        
        if (Browser.equals("chrome")) {
        	// WebDriverManager.chromedriver().clearDriverCache().setup();
        	// WebDriverManager.chromedriver().clearResolutionCache().setup();
        	
        	//Below code downloads the chromedriver compatible with webdrivermanager in pom.xml and place in the user cache
        	//C:\Users\XYZ-user\.cache\selenium\chromedriver\win64\120.0.6099.109
          
			 WebDriverManager.chromedriver().setup();
            //tlDriver.set(new ChromeDriver());
            //ChromeOptions chromeOptions = new ChromeOptions();
            //chromeOptions.setBinary(Browser)
           
          driver = new ChromeDriver();
        } else if (Browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            //tlDriver.set(new FirefoxDriver());
            driver = new FirefoxDriver();
        } else if (Browser.equals("safari")) {
            WebDriverManager.safaridriver().setup();
            //tlDriver.set(new SafariDriver());
            driver = new SafariDriver();
        } else if (Browser.equals("edge")) {
            WebDriverManager.edgedriver().setup();
            //tlDriver.set(new EdgeDriver());
            driver = new EdgeDriver();
        }else {
            System.out.println("Please pass the correct browser value :" + Browser);
        }
        
        getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();
        return getDriver();
    }

    public static synchronized WebDriver getDriver() {
    	//loading for the first time
    	if (driver == null) {
            configReader = new ConfigReader1();
            Properties prop  = configReader.init_prop();
    		init_driver(prop.getProperty("browser"));
    	}
        return driver;
    }
    public static void closeallDriver() {
		try {
			driver.close();
			driver.quit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}