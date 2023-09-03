package com.remya.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homepage extends Page{

	
	
	public accountpage template()
	{
		
		driver.findElement(By.xpath("//div[@class='product-nav-links']//a[@href='/sites/templates.html']")).click();
		return new accountpage();
	}
	
	public void resources()
	{
		driver.findElement(By.xpath("//div[@class='product-nav-links']//a[@href='/sites/resources.html']")).click();
		
		
	}
	public void signin()
	{
		driver.findElement(By.xpath("//div[@class='zgh-utilities']//div[@class='zgh-accounts']")).click();
		
	}
	public void features()
	{
		
	}
	public void pricing()
	{
		
		
	}
}




