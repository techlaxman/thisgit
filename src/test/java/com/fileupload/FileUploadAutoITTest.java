package com.fileupload;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import driver.driverBase;

public class FileUploadAutoITTest extends driverBase{


	@BeforeMethod
	public void setUp() {
		browserStart();
	}
	@Test
	public void uploadFile() throws InterruptedException {
		
		WebElement ele=driver.findElement(By.id("P0-0"));
		System.out.println(ele.getAttribute("type"));
		JavascriptExecutor exec=(JavascriptExecutor)driver;
		//exec.executeScript("arguments[0].scrollIntoView();",ele);
		exec.executeScript("window.scrollBy(0,200)");
		Thread.sleep(5000);
		exec.executeScript("arguments[0].click();", ele);
		//ele.click();
		try {
			System.out.println("try....runtime");
			Runtime.getRuntime().exec("D:\\AUITSCRIPT\\cvscript.exe");
			System.out.println("runtime");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
