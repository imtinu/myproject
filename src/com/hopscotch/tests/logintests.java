package com.hopscotch.tests;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hopscotch.generic.basetest;
import com.hopscotch.page.homepage;

public class logintests extends basetest {

	@DataProvider
	public Object[][] onlyemail()
	{
		return new Object[][]{{"imtinu@gmail.com"}};
	}
	
		@DataProvider
		public Object[][] onlypass()
		{
			return new Object[][]{{"genius"}};
		}
		
		@DataProvider
		public Object[][] wrongpass()
		{
			return new Object[][]{{"imtinu@gmail.com","geniusss"}};
		}
		@DataProvider
		public Object[][] notreg()
		{
			return new Object[][]{{"immihu@gmail.com","genius"}};
		}
		@DataProvider
		public Object[][] login()
		{
			return new Object[][]{{"imtinu@gmail.com","genius"}};
		}
		@DataProvider
		public Object[][] invalidmail()
		{
			return new Object[][]{{"imt     n@gmail.com","genius"}};
		}
	/*	
	@Test(priority=1)
	public void nodata() throws InterruptedException
	{
		homepage h=new homepage(driver);
		h.actclick();
		h.sign();
		Thread.sleep(2000);
		h.signclick();
		Thread.sleep(2000);
		h.login();
		Thread.sleep(2000);
		h.warnmail();
		if(h.warnmail())
			Reporter.log("Test pass",true);
		if(h.warnpwd());
		    Reporter.log("Test pass",true);
	}
	
	@Test(dataProvider="onlyemail",priority=2)
	public void onlymail(String user) throws InterruptedException
	{		
		homepage h=new homepage(driver);
		h.actclick();
	    h.sign();
	    Thread.sleep(2000);
     	h.signclick();
	    Thread.sleep(2000);
	    h.uname(user);
	    Thread.sleep(2000);
	    h.login();
     	if(h.warnpwd());
	       Reporter.log("Test pass",true);
		
	}
	
	@Test(dataProvider="onlypass",priority=3)
	public void onlypwd(String pwd) throws InterruptedException
	{		
		homepage h=new homepage(driver);
		h.actclick();
	    h.sign();
	    Thread.sleep(2000);
     	h.signclick();
	    Thread.sleep(2000);
	    h.password(pwd);
	    h.login();
     	if(h.warnmail());
	       Reporter.log("Test pass",true);
		
	}
	
	@Test(dataProvider="wrongpass",priority=4)
	public void wrongpwd(String user,String pwd) throws InterruptedException
	{		
		homepage h=new homepage(driver);
		h.actclick();
	    h.sign();
	    Thread.sleep(2000);
     	h.signclick();
	    Thread.sleep(2000);
	    h.uname(user);
	    h.password(pwd);
	    h.login();
	    Thread.sleep(2000);;
     	if(h.wrongpass());
	       Reporter.log("Test pass",true);
		
	}
		@Test(dataProvider="notreg",priority=5)
		public void mailnotreg(String user,String pwd) throws InterruptedException
		{		
			homepage h=new homepage(driver);
			h.actclick();
		    h.sign();
		    Thread.sleep(2000);
	     	h.signclick();
		    Thread.sleep(2000);
		    h.uname(user);
		    h.password(pwd);
		    Thread.sleep(2000);
		    h.login();
		    Thread.sleep(2000);
	     	if(h.mailnotreg());
		       Reporter.log("Test pass",true);
			
		}
		@Test(dataProvider="invalidmail",priority=6)
		public void invalidmail(String user,String pwd) throws InterruptedException
		{		
			homepage h=new homepage(driver);
			h.actclick();
		    h.sign();
		    Thread.sleep(2000);
	     	h.signclick();
		    Thread.sleep(2000);
		    h.uname(user);
		    h.password(pwd);
		    h.login();
		    Thread.sleep(2000);;
	     	if(h.invalidmail());
		       Reporter.log("Test pass",true);
			
		}
		*/
	
		@Test(dataProvider="login",priority=7)
		public void loginsuccess(String user,String pwd) throws InterruptedException
		{		
			homepage h=new homepage(driver);
			h.actclick();
		    h.sign();
		    Thread.sleep(2000);
	     	h.signclick();
		    Thread.sleep(2000);
		    h.uname(user);
		    h.password(pwd);
		    h.login();
		  //  h.warnmail();
		   // h.logout();
		
		}
	
	
	
	
	
	
	
	
	
	
	
}


