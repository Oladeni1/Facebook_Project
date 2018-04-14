package com.JavaProjectEx;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {
	
	

	public static void main(String[] args) throws InterruptedException, IOException {
		
		   WebDriver driver;
		   
			//Setup of environment:
		    System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Jars_Extensions\\chromedriver.exe");	
		
			//Initialising driver:
			driver = new ChromeDriver();
			
			//Lunching browser:
			driver.navigate().to("http://executeautomation.com/demosite/Dragging.html");
			
			//Wait for element to become visible:
			driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
			
			//Element of the 2 items:
			WebElement first_item = driver.findElement(By.id("item1"));
			
			WebElement fifth_item = driver.findElement(By.id("item5"));
			
			DragAndDrop(driver, first_item, fifth_item);
			
			Thread.sleep(2000L);
			
			driver.close();
		
	}
	public static void DragAndDrop(WebDriver driver, WebElement source_firstitem, WebElement destination_firstitem ){
		
		Actions action = new Actions(driver);
		action.dragAndDrop(source_firstitem, destination_firstitem).perform();
		
	}
}


