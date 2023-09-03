package com.remya.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class accountpage extends Page {
	public void crmclick()
	{
		
		 driver.findElement(By.xpath("//a[normalize-space()='All Products']")).click();

		 driver.findElement(By.xpath("//a[@class='zgh-i-crm']")).click();
		
		

		    //builder.contextClick(mapObject).perform();
		//driver.findElement(By.xpath("//*[text()='CRM']")).click();
		 
		 
	  
	}

}
