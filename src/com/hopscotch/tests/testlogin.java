package com.hopscotch.tests;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hopscotch.generic.basetest;
import com.hopscotch.page.homepage;
import com.hopscotch.page.testloginpage;

public class testlogin extends basetest {

	@DataProvider
	public Object[][] getdata()
	{
		return new Object[][]{{" "," "},{"","geius"},{"imtinu@gmail.com",""},{"imtinu@gmail.com","geniuss"},{"im  tinu@gmail.com","genius"},{"immihu@gmail.com","genius"},{"imtinu@gmail.com","genius"}};
	}
	
	@Test(dataProvider="getdata")
	public void loginsuccess(String user,String pwd) throws InterruptedException
	{		
		testloginpage t=new testloginpage(driver);
		t.actclick();
	    t.sign();
	    Thread.sleep(2000);
     	t.signclick();
	    Thread.sleep(2000);
	    t.uname(user);
	    t.password(pwd);
	    t.login();
	    Thread.sleep(3000);
        t.chklogin();
	
}
}
