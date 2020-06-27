package com.selenium.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckBoxPage {
	
	WebDriver driver;
	
	@FindBy(linkText = "Checkboxes") WebElement checkBoxlink;
	@FindBy(tagName = "h3") WebElement header;
	@FindBy(xpath = "//*[@id='checkboxes']/input[1]") WebElement frstchbx ;
	@FindBy(xpath = "//*[@id='checkboxes']/input[2]") WebElement scndchbx;

	public CheckBoxPage(WebDriver driver){
		
		this.driver = driver;
	}
	
	public String returnHeader() throws InterruptedException{
		
		checkBoxlink.click();
		Thread.sleep(1500);
		return header.getText();
	}
	
   public void frstCheckBox() throws InterruptedException{
		
		Thread.sleep(1500);
 
		if(!frstchbx.isSelected())
			frstchbx.click();
		}
   
   public void secndCheckBox() throws InterruptedException{
		
		Thread.sleep(1500);
		
		if(!scndchbx.isSelected())
			scndchbx.click();
			
		}
	

}
