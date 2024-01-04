package com.action;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import driver.driverBase;

public class ActionDemo extends driverBase{

	public Actions action;
	@BeforeMethod
	public void setup() {

		browserStart();
	}
	@Test
	public void testActionClass() {
       
		WebElement element=driver.findElement(By.name("email"));
		action= new Actions(driver);
        
		action.clickAndHold(element).moveToElement(element);
		action.dragAndDrop(element, element);
		action.dragAndDropBy(element, 200, 500);
		action.clickAndHold(element).moveToElement(element).release(element).build().perform();
		action.pause(Duration.ofMillis(2000));
		action.scrollByAmount(200,500);
		
	}
}
