package com.JavaProjectEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Facebook_Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FacebookTest();

	}
public static void FacebookTest() {
		
		//Setup of environment
	    System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Jars_Extensions\\chromedriver.exe");	
	
		//Initialising driver
		WebDriver driver = new ChromeDriver();
		
		//Lunching browser
		driver.get("https://www.facebook.com/");
		
		//Forgotten Account
		driver.findElement(By.id("email")).sendKeys("manchester@yahoo.com");
		driver.findElement(By.name("pass")).sendKeys("123456");
		driver.findElement(By.id("u_0_2")).click();
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		
		//Entering signing up details
		driver.findElement(By.name("firstname")).sendKeys("Manchester");
		driver.findElement(By.name("lastname")).sendKeys("United Kingdom");
		driver.findElement(By.name("reg_email__")).sendKeys("07427517224");
		driver.findElement(By.name("reg_passwd__")).sendKeys("England1");
		
		//Setting Birthday details:
		//Setting Birthday "day"
		WebElement day =driver.findElement(By.name("birthday_day"));
		Select dayselect = new Select(day);
		dayselect.selectByValue("20");
		
		//Setting Birthday "month"
		WebElement month =driver.findElement(By.id("month"));
		Select monthselect = new Select(month);
		monthselect.selectByValue("8");
		
		//Setting Birthday "year"
		WebElement year =driver.findElement(By.name("birthday_year"));
		Select yearselect = new Select(year);
	    yearselect.selectByValue("1976");
		
		//Setting Gender
		driver.findElement(By.name("sex")).click();
		
		//Clicking Create Account button
		driver.findElement(By.name("websubmit")).click();
		
		//Tear down
		driver.close();
				
		
		
		
}
}
