package com.selenium.demo.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class WebDriverInit {
	
	public static WebDriver driver;
	public static WebDriverWait webdriverwait;
	public static String AppUrl = "http://the-internet.herokuapp.com/";
	public static ExtentReports extent;
	public static ExtentHtmlReporter htmlReporter;
	
	
    @BeforeClass
	public  static  WebDriver launchBrowser() {
        System.out.println("starting firefox browser"); 
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		webdriverwait = new WebDriverWait(driver, 30);
		driver.get(AppUrl);
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
      /* htmlReporter = new ExtentHtmlReporter("./ExtentReports/automation_report.html");
       extent = new ExtentReports()
       extent.attachReporter(htmlReporter);*/
		
		return driver;
		
	}
	
        @AfterClass
		public static void closeDriver() {
			if(driver!=null) {
				driver.quit();
			}
			
		}
	

}
