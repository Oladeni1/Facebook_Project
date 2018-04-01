package com.JavaProjectEx;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Facebook_Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FacebookTest();
		TakesScreenshot();
		

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
		Select selectday = new Select(day);
		selectday.selectByValue("31");
		
		//Setting Birthday "month"
		WebElement month =driver.findElement(By.id("month"));
		Select selectmonth = new Select(month);
		selectmonth.selectByValue("8");
		
		//Setting Birthday "year"
		WebElement year =driver.findElement(By.name("birthday_year"));
		Select selectyear = new Select(year);
	    selectyear.selectByValue("1980");
		
		//Setting Gender
		driver.findElement(By.name("sex")).click();
		
		//Clicking Create Account button
		driver.findElement(By.name("websubmit")).click();
		
		//Tear down
			driver.close();
}
		
		public static void TakesScreenshot() {
		//TakesScreenshot
		  try {
	            Robot robot = new Robot();
	 
	            Rectangle rectangle = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
	            BufferedImage bufferedImage = robot.createScreenCapture(rectangle);
	            File file = new File("screen-capture.png");
	            boolean status = ImageIO.write(bufferedImage, "png", file);
	            System.out.println("Screen Captured ? " + status + " File Path:- " + file.getAbsolutePath());
	 
	        } catch (AWTException | IOException ex) {
	            System.err.println(ex);
	        }
		
		  }
				
		}
		
		

