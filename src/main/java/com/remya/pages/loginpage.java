package com.remya.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class loginpage extends Page {
	
	
	public static void login(String username,String Password)
	{
	
		driver.findElement(By.cssSelector("input[id='login_id']")).sendKeys(username);
		driver.findElement(By.cssSelector("button[id='nextbtn']")).click();
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys(Password);
		driver.findElement(By.cssSelector("button[id='nextbtn']")).click();
		driver.findElement(By.xpath("//div[@class='sites-avatar']")).click();
		/*WebElement element=	driver.findElement(By.xpath("//div[@class='sites-avatar']"));
			Actions a=new Actions(driver);
			a.moveToElement(element).perform();
			driver.findElement(By.xpath("//*[contains(text(),'My Account')]")).click();*/
	}
}
