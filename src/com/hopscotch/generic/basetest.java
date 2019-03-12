package com.hopscotch.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class basetest implements autoconstants {
	 public static WebDriver driver=null;
	 @BeforeMethod
	 public void precondition()
	 {
		System.setProperty(chrome_key, chrome_value);
		 driver=new ChromeDriver();
		 driver.get("https://www.hopscotch.in");
	 }
	    
	@AfterMethod
		public void postcondition()
		{
			driver.close();
			
		}

}
