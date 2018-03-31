package com.JavaProjectEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Google_Search_Functionality {

	public static void main(String[] args) {
		
		//Calling Search Functionality method
		Google_Search_Functionality();

	}
	public static void Google_Search_Functionality() {
		
		//Setup of environment
		//CHROME 
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Jars_Extensions\\chromedriver.exe");
		
		
		//IE
		System.setProperty("webdriver.ie.driver", "C:\\Selenium_Jars_Extensions\\IEDriverServer.exe");
		
		//Initialising driver
		WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new InternetExplorerDriver();
		
		//WebDriver driver = new HtmlUnitDriver(); //Headless browser
		
		//Lunching browser
		driver.get("https://www.google.co.uk/");
		
		//Getting the title in the page
		String title = driver.getTitle();
		
		//Printing title to console
		System.out.println("The title is " + title);
		
		//Updating Search field
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
		
		//Clicking Google Search button
		driver.findElement(By.name("btnK")).click();
		
		//Closing Browser
		driver.close();
	}
}
