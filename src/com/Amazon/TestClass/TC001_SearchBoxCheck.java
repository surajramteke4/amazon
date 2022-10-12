package com.Amazon.TestClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Amazon.POMClass.POM_HomepageAmazon;
import com.Amazon.utility.TestBaseClass;

public class TC001_SearchBoxCheck extends TestBaseClass
{

	@Test
	public void CheckSearchFoxfuntionality()
	{
		POM_HomepageAmazon hp = new POM_HomepageAmazon(driver);
		hp.SelectDropDown();
		hp.SendTextinSearch();
		hp.ClickOnTheSearchButton();
		
		String givenTitle = "Amazon.in : HP VICTUS";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, givenTitle);
		
	}
}
