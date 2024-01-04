package com.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import driver.driverBase;

public class UploadFileUsingRobot extends driverBase{

	@BeforeMethod
	public void setupBrowser() {
		browserStart();
	}
	@Test
	public void uploadFile() throws AWTException, InterruptedException {
	
     // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));	
	 JavascriptExecutor j = (JavascriptExecutor)driver;
     // file path passed as parameter to StringSelection
     StringSelection s = new StringSelection("D:\\Laxman CV\\Laxman_More_Automation_Tester.pdf");
     // Clipboard copy
     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
     //identify element and click
     WebElement fileupload=driver.findElement(By.name("uploadfile_0"));
    // wait.until(ExpectedConditions.elementToBeClickable(element));
     j.executeScript("arguments[0].click();",fileupload);
     //fileupload.click();
     Thread.sleep(5000);
     // Robot object creation
     Robot r = new Robot();
     //pressing ctrl+v
     r.keyPress(KeyEvent.VK_CONTROL);
     r.keyPress(KeyEvent.VK_V);
     //releasing ctrl+v
     r.keyRelease(KeyEvent.VK_CONTROL);
     r.keyRelease(KeyEvent.VK_V);
     //pressing enter
     r.keyPress(KeyEvent.VK_ENTER);
     //releasing enter
     r.keyRelease(KeyEvent.VK_ENTER);
    
     System.out.println("file uploaded successfully....");
     driver.findElement(By.id("submitbutton")).click();
  }
}
