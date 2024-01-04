package com.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import driver.driverBase;

public class Booking extends driverBase{
	
	@BeforeMethod
	public void setup() {
		browserStart();
	}
	@Test
	public void searchBooking() throws InterruptedException {
		
		String textToselect="mumbai";
		driver.findElement(By.name("ss")).click();
		driver.findElement(By.xpath("//div[@class='eac0b6e5ba']/following::input[1]")).sendKeys("mumbai");
		List<WebElement> fromCitylist=driver.findElements(By.xpath("//div[@class='a3332d346a']"));
		System.out.println(fromCitylist.size());
		boolean flag=false;
		for(WebElement ele:fromCitylist) {
			String fromCity=ele.getText();
			System.out.println(fromCity);
			if(fromCity.equalsIgnoreCase(textToselect)) {
				Thread.sleep(5000);
				ele.click();
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("given option is selected");
		}else {
			System.out.println("given option is not available.");
		}
	}
}
