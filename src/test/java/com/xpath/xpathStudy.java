package com.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import driver.driverBase;

public class xpathStudy extends driverBase{

	public xpathStudy() {
		super();
	}
	@BeforeMethod
	public void browserSetup() {
		browserStart();
	}
	 @Test
	 public void testXpath() throws InterruptedException {
		
	//select from city 
		driver.findElement(By.id("src")).sendKeys("mum");
		Thread.sleep(2000);
		List<WebElement> fromCity=driver.findElements(By.xpath("//text[@class='placeHolderMainText']"));
		System.out.println("from city values: "+fromCity.size());
		boolean flag=false;
		String fromCityValue="Borivali East";
		for(WebElement ele:fromCity) {
			String valueFromDropDown=ele.getText();
			if(valueFromDropDown.equals(fromCityValue)) {
			   Thread.sleep(1000);
				ele.click();
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println(fromCityValue+": is selected successfully..");
		}else {
			System.out.println("Value is not available in drop-down to select");
		}
		Thread.sleep(2000);
		//select to City
		String toCity="Anand Rao Circle";
		driver.findElement(By.id("dest")).sendKeys("ban");
		List<WebElement> toCityValues=driver.findElements(By.xpath("//text[@class='placeHolderMainText']"));
		System.out.println("to cities values : "+toCityValues.size());
		for(WebElement ele:toCityValues) {
			
			Thread.sleep(2000);
			String valuetoDropDown=ele.getText();
			System.out.println("To city dropdown values: "+valuetoDropDown);
			if(valuetoDropDown.equals(toCity)) {
				ele.click();
				break;
			}
		}
		JavascriptExecutor script=(JavascriptExecutor)driver;
		script.executeScript("window.scrollBy(0,100)");
		Thread.sleep(2000);
	    //select date
		driver.findElement(By.xpath("//span[text()='Date']"));
		List<WebElement> calValues=driver.findElements(By.xpath("//div[@class='isgDNj']"));
	     System.out.println(" calendates data size :"+calValues.size());
	     for(WebElement dates:calValues) {
	    	 Thread.sleep(2000);
	    	 String date=dates.getText();
	    	 if(date.equals("25")) {
	    		 dates.click();
	    		 break;
	    	 }
	     }
	     Thread.sleep(1000);
	     //click on search Button.
	     driver.findElement(By.id("search_button")).click();
	 
	 }
	 
	 
	 
	 
	 
}
