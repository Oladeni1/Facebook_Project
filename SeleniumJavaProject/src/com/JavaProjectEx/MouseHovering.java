package com.JavaProjectEx;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {

	
	public static void main(String[] args) throws InterruptedException, IOException {
		
         WebDriver driver;
		//Setup of environment
	    System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Jars_Extensions\\chromedriver.exe");	
	
		//Initialising driver
		driver = new ChromeDriver();
		
		//Lunching browser
		driver.navigate().to("http://executeautomation.com/demosite/index.html?UserName=ola&Password=ola&Login=Login");
		
		//Wait for element to become visible
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
			
		
		//Hovering over Automation Tool
		WebElement automationTool_Menu = driver.findElement(By.id("Automation Tools"));  
		Hover(driver, automationTool_Menu);
		Thread.sleep(100L);
		
		//Hovering over Selenium and then clicking Selenium WebDriver
		WebElement selenium = driver.findElement(By.id("Selenium"));
		WebElement seleniumWebDriver = driver.findElement(By.id("Selenium WebDriver"));
		HoverThenClick(driver, selenium, seleniumWebDriver);
		Thread.sleep(1000L);
		
	    driver.close();
	    
	}
	public static void Hover(WebDriver driver,  WebElement element) {
		
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		
	}
		
	public static void HoverThenClick(WebDriver driver, WebElement elementToHover, WebElement elementToClick) {
		
		Actions action = new Actions(driver);
		action.moveToElement(elementToHover).click(elementToClick).build().perform();
		
	}
        
	}
	 
	

