package com.remya.pages;

import org.openqa.selenium.By;

public class pricingpage extends Page {
	
	public pricingdetails price()
	{
		
		driver.findElement(By.cssSelector("div[id='zplan1'] a[class='getstart-plan act-btn cta-btn']")).click();
		return new pricingdetails();
	
	}

}
