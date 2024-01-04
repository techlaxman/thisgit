package com.robot;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RobotDemo {

	public static WebDriver driver;
	public static void main(String[] args) throws AWTException, IOException {
	    
		Robot robot= new Robot();
		
		robot.keyPress(KeyEvent.VK_COLON);
		robot.delay(2000);
		Rectangle rect= new Rectangle();
		robot.createScreenCapture(rect);
		robot.getAutoDelay();
		robot.getPixelColor(200,500);
        robot.mouseMove(10, 20);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseWheel(-200);
        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
        robot.setAutoDelay(2000);
        
        //scrol down with robot class.
        
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyPress(KeyEvent.VK_PAGE_UP);
        robot.keyPress(KeyEvent.VK_HOME);
        robot.keyPress(KeyEvent.VK_END);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_CAPS_LOCK);
        robot.mousePress(InputEvent.ALT_GRAPH_MASK);
        Rectangle screenSize = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage img=robot.createScreenCapture(rect);
        ImageIO.write(img, "png", new File(""));
        
        WebElement ele=driver.findElement(By.xpath(""));
        Point p=ele.getLocation();
        robot.mouseMove(p.getX(), p.getY()); 
        
        
        
        
        
        
        
        
        
        
        
        
		
		
		
		
		
		
		
		
	}	
}
