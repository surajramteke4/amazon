package com.Amazon.TestClass;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.Amazon.POMClass.POM_HP_PRODUCT;
import com.Amazon.POMClass.POM_HomepageAmazon;
import com.Amazon.utility.TestBaseClass;

public class TC002_HpLaptopSelect  extends TestBaseClass
{
@Test
public void SelectHplaptop()
{
	POM_HomepageAmazon hp = new POM_HomepageAmazon(driver);
	hp.SelectDropDown();
	hp.SendTextinSearch();
	hp.ClickOnTheSearchButton();
	POM_HP_PRODUCT product = new POM_HP_PRODUCT(driver);
	product.ClickOnHpLaptop();
	
	List<String> getadress = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(getadress.get(1));
	product.SelectWindow10laptopversion();
}
	
}
