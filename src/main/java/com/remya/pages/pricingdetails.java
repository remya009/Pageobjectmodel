package com.remya.pages;

import org.openqa.selenium.By;

public class pricingdetails extends Page {
	
	public void pricedata()
	{
		
		driver.findElement(By.xpath("//input[@id='namefield']")).sendKeys("Remya");
	}

}
