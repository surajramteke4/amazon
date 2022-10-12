package com.Amazon.utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;



public class TestBaseClass
{	
	
	public WebDriver driver;
	@Parameters("browserName")
	@BeforeMethod
	public void setUp(String browserName)
	{
		if(browserName.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",
				"E:\\driver 106\\chromedriver.exe"); //brower initialize
		
	 driver = new ChromeDriver(); // upcasting
	}
	else
	{
		System.setProperty("webdriver.gecko.driver",
				"E:\\DRIVERS\\geckodriver.exe"); //brower initialize
		
	 driver = new FirefoxDriver(); // upcasting
	}	
		
	driver.manage().window().maximize(); // method chaining 
	driver.get("https://www.amazon.in/"); //method of webdriver
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	System.out.println("sauce demo site got opened");
	
	}
	
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException 
	{
		Thread.sleep(5000);
		
		System.out.println("end of the program");
	
		driver.quit();
		
		
	}

}
