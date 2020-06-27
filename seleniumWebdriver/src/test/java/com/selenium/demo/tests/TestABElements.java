package com.selenium.demo.tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import com.selenium.demo.pages.ABElements;
import com.selenium.demo.pages.WebDriverInit;

public class TestABElements extends WebDriverInit{
	
	ABElements aBElements;
	
	@Test(priority =3)
   public void testHeader() throws InterruptedException{
		
	// ExtentTest test = extent.createTest("Test Header", "Test Header Display");
        
        aBElements = PageFactory.initElements(driver, ABElements.class);
   	    String heading = aBElements.returnHeader();
   	     assertEquals(heading, "A/B Test Control");

       /* test.log(Status.INFO, "Testing Header Content of AB Testing");

        test.log(Status.PASS, "Specified Header is printed");
    */
	        
	}

	@Test(priority = 4)
	   public void testContent() throws InterruptedException{
		
		String actualContent = "Also known as split testing. This is a way in which businesses are able to simultaneously test and learn different versions of a page to see which text and/or functionality works best towards a desired outcome (e.g. a user action such as a click-through).";
	    String content = aBElements.returnContent();
	    
     // ExtentTest test2 = extent.createTest("Test Content", "Test content Display");
        
		 assertEquals(content, actualContent);
		 
		 /*test2.log(Status.INFO, "Testing paragraph Content of AB Testing");

	        test2.log(Status.PASS, "Specified Content is printed");
	        
	        try {
				test2.addScreenCaptureFromPath("C:\\Users\\ashwini.v\\Pictures\\Screenshots\\abtest.JPG");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Specified image is not Found");
			}
	    
	        extent.flush();*/
	        
		 
		 
	 }

}
