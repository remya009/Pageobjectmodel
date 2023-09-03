package com.remya.Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.remya.pages.Page;
import com.remya.pages.accountpage;
import com.remya.pages.homepage;
import com.remya.pages.loginpage;
import com.remya.pages.pricingdetails;
import com.remya.pages.pricingpage;
import com.remya.pages.topmenu;

public class logintest {
@Test
 public void login() {
		// TODO Auto-generated method stub
		
		
		
		homepage home= new homepage();
		//created pageobjects at one time and calling return method at each page to referred
		accountpage ap=home.template();
		//home.resources();
		//home.signin();
		//loginpage login2 =new loginpage();
		//login2.login("hiquedevi@gmail.com","Shiva@007");
		//accountpage account= new accountpage();
		ap.crmclick();
	    pricingpage pp=Page.menu.price();
	    pricingdetails pd =pp.price();
	    pd.pricedata();
 }

}
