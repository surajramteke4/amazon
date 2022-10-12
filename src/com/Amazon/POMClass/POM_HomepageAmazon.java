package com.Amazon.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class POM_HomepageAmazon 
{
	public WebDriver driver;
	Select s ;
	
	
	
	//drop down search
	@FindBy(xpath = "//select[@id='searchDropdownBox']")
	WebElement searchdropdown;
	
	public void SelectDropDown()
	{
		
		s.selectByVisibleText("Computers & Accessories");
	}
	
	//SEARCH TEXT BOX
	@FindBy(xpath = "//INPUT[@id='twotabsearchtextbox']")
	WebElement SearchTextBox;
	
	public void SendTextinSearch()
	{
		SearchTextBox.sendKeys("HP VICTUS");
	}
	
	
	//SEARCH BUTTON
	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	WebElement SearchButton;
	
	public void ClickOnTheSearchButton()
	{
		SearchButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	//CONSTRUCTOR
	public POM_HomepageAmazon(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
		 s = new Select(searchdropdown);
	}
}
