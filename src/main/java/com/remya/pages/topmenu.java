package com.remya.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class topmenu {
	
	private WebDriver driver;

	public topmenu(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public pricingpage price()
	{
		driver.findElement(By.cssSelector("div[class='product-nav-links'] li[class='leaf zmenu-pricing'] a")).click();
		return new pricingpage();
	}

}
