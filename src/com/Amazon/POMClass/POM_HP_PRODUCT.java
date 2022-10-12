package com.Amazon.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_HP_PRODUCT
{
	public WebDriver driver;
	
	@FindBy(xpath = "(//span[@class='a-size-medium a-color-base a-text-normal'])[2]")
	WebElement Hplaptop;
	public void  ClickOnHpLaptop()
	{
		Hplaptop.click();
	}
	
	
	@FindBy(xpath = "//p[text()='Win 10 +GTX 1650 graphics']")
	WebElement SelectlaptopVersion;
	public void SelectWindow10laptopversion()
	{
		SelectlaptopVersion.click();
	}
	
	
	
	
	public POM_HP_PRODUCT(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
}
