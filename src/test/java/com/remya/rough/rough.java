package com.remya.rough;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class rough
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://www.zoho.com/sites/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.xpath("//div[@class='zgh-utilities']//div[@class='zgh-accounts']")).click();
		driver.findElement(By.cssSelector("input[id='login_id']")).sendKeys("remyamohandhas21@gmail.com");
		driver.findElement(By.cssSelector("button[id='nextbtn']")).click();
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Shiva@007");
		driver.findElement(By.cssSelector("button[id='nextbtn']")).click();
	driver.findElement(By.xpath("//div[@class='sites-avatar']")).click();
	WebElement element=	driver.findElement(By.xpath("//div[@class='sites-avatar']"));
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
		driver.findElement(By.xpath("//*[contains(text(),'My Account')]")).click();
		driver.findElement(By.xpath("//*[text()='CRM']")).click();*/
		
		driver.get("https://accounts.zoho.com/home#profile/personal");
		 WebElement mapObject = driver.findElement(By.xpath("//*[local-name()='svg']"));

		    Actions builder = new Actions(driver);

		    builder.contextClick(mapObject).perform();
		

}
}
