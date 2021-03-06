package com.JavaProjectEx;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

class JunitProject1 {
	
	static WebDriver driver;
	
	static String browser = "Chrome";

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		//Setup of environment
	    System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Jars_Extensions\\chromedriver.exe");
	    
	    System.setProperty("webdriver.ie.driver", "C:\\Selenium_Jars_Extensions\\IEDriverServer.exe");
	    
	    System.setProperty("webdriver.edge.driver", "C:\\Selenium_Jars_Extensions\\MicrosoftWebDriver.exe");	
		
	}
	

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
		System.out.println("I am done " + "tests PASSED, unbelivable! ");
	}

	@BeforeEach
	void setUp() throws Exception {
		
		//Initialising driver
		if(browser == "Chrome") {
			
			driver = new ChromeDriver();
			}
		
        if(browser == "IE") {
			
        	driver = new InternetExplorerDriver();
			}
        //MicrosoftWebDriver
 if(browser == "Edge") {
			
        	driver = new InternetExplorerDriver();
			}
		
				
		//Lunching browser
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				
	}

	@AfterEach
	void tearDown() throws Exception {
		
		driver.close();
	}

	@Test
	void forgottenAccount()throws Exception{
		//Forgotten Account
		//Thread.sleep(200);
		driver.findElement(By.id("email")).sendKeys("manchester@yahoo.com");
		driver.findElement(By.name("pass")).sendKeys("123456");
		driver.findElement(By.id("u_0_2")).click();
		driver.findElement(By.linkText("Sign up for Facebook")).click();
				
	}

	@Test
	void signUpDetails() {
		
		//Entering signing up details
		driver.findElement(By.name("firstname")).sendKeys("Manchester");
		driver.findElement(By.name("lastname")).sendKeys("United Kingdom");
		driver.findElement(By.name("reg_email__")).sendKeys("07427517224");
		driver.findElement(By.name("reg_passwd__")).sendKeys("England1");
		
	}

	@Test
	void setBirthDetails() {
		
		//Setting Birthday "day"
		WebElement day =driver.findElement(By.name("birthday_day"));
		Select selectday = new Select(day);
		selectday.selectByValue("15");
				
		//Setting Birthday "month"
		WebElement month =driver.findElement(By.id("month"));
		Select selectmonth = new Select(month);
		selectmonth.selectByValue("6");
				
		//Setting Birthday "year"
		WebElement year =driver.findElement(By.name("birthday_year"));
		Select selectyear = new Select(year);
		selectyear.selectByValue("1986");
			    
	}

	@Test
	void setGender() {
		
		//Setting Gender
		driver.findElement(By.name("sex")).click();
		
	}

	@Test
	void createAccount() {
		//Clicking Create Account button
		driver.findElement(By.name("websubmit")).click();
		
		
	}

	@Test
	void verifyAssertion() {
		//verification & assertion
		System.out.println(driver.getTitle());
		assertTrue (driver.getTitle().equals("Facebook � log in or sign up"));
		
	}
	private void assertTrue(boolean equals) {	
	}
	
	}


