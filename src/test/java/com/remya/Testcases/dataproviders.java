package com.remya.Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.remya.pages.homepage;
import com.remya.pages.loginpage;

public class dataproviders {
	
	public static WebDriver driver;

   
    @Test(dataProvider="logincredentials")
	public void login3(String username,String Password)
	{
		// TODO Auto-generated method stub
    	WebDriver driver=new ChromeDriver();
		 driver.get("https://www.zoho.com/sites/");
			
			driver.manage().window().maximize();
		//driver.get("https://www.zoho.com/sites/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.findElement(By.xpath("//div[@class='zgh-utilities']//div[@class='zgh-accounts']")).click();
		
			driver.findElement(By.cssSelector("input[id='login_id']")).sendKeys(username);
			driver.findElement(By.cssSelector("button[id='nextbtn']")).click();
			driver.findElement(By.cssSelector("input[id='password']")).sendKeys(Password);
			driver.findElement(By.cssSelector("button[id='nextbtn']")).click();
			driver.findElement(By.xpath("//div[@class='sites-avatar']")).click();
	}
		
			 @DataProvider(name="logincredentials")
			    public Object[][] logincredentials(){
			    return new Object[][] 
			    	{
			            { "hiquedevi@gmail.com", "Shiva@007" },
			            { "Krishna", "UK" },
			            { "Bhupesh", "USA" }
			        };
		

}
}