package com.qa.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import io.cucumber.java.Scenario;


public class BaseClass {
	//private static BaseClass Base;

	private static WebDriver driver ;
	public final static int TIMEOUT = 2;
	public static Properties prop=new Properties();
	public static FileReader fr;

	public static void setUp() throws IOException {
		System.out.println("----Base Class ---- Setup() ");
		try {
			if(driver==null) {

				fr=new FileReader ("C:/Users/saran/eclipse-workspace/DS-ALGO5/src/test/resources/config/config.properties");
						prop.load(fr);
						System.out.println("----Base Class ---- Props "+prop);
						
			}

			if (prop.getProperty("browser").equalsIgnoreCase("chrome"))
			{
				driver=new ChromeDriver();

				driver.manage().window().maximize();
			}
			else if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
			{
				driver=new FirefoxDriver();
				driver.manage().window().maximize();

			}
			else if (prop.getProperty("browser").equalsIgnoreCase("edge"))
			{
				driver=new EdgeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				int n=driver.getWindowHandles().size();
				System.out.println(n);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void ClearBrowserCache() throws Exception
	{
		driver.manage().deleteAllCookies();
		Thread.sleep(2000); //wait 7 seconds to clear cookies.
	}

	
	public static String getDSurl() {
		System.out.println("----Base Class ---- getDSurl() "+prop.getProperty("url"));
		return prop.getProperty("url") ;
	}
	public static void openPage(String url) {
		
		driver.get(url);
	}
	public static String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	public static String getTitle() {
		return driver.getTitle();
	}
	public static void NavBack() {
		driver.navigate().back();
	}
	public static void navigateToPage(String url) {
		driver.navigate().to(url);
	}
	public static WebDriver getDriver() {
		try {
			setUp();
			driver.get(getDSurl());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
	}

	public static void gotoHomePage() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/home");
	}
	public static void gotoTryEditorPage() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/home");
	}
	
	public static void tearDown() {
		if(driver!=null) {
			driver.close();
			driver.quit();
		}
		driver=null;
	}
}