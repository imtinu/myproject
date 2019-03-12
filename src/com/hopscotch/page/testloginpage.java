package com.hopscotch.page;

import java.awt.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class testloginpage {

	@FindBy(xpath="//a[contains(.,'Account')][1]")
	public WebElement account;


	@FindBy(xpath="//span[contains(.,'see all your orders')]/..//span[.='Sign in']")
	public WebElement signin;

	@FindBy(xpath="//a[.='Use your Email or Facebook to sign in']")
	public WebElement signclick;

	@FindBy(name="loginId")
	public WebElement username;

	@FindBy(name="password")
	public WebElement pass;

	@FindBy(xpath="//input[@value='SIGN IN']")
	public WebElement logbtn;
	
	@FindBy(xpath="//div[.='Sign out']")
	public WebElement signout;
		   

	
	public testloginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void actclick()
	{
		account.click();
	}

	public void sign()
	{
		signin.click();
	}

	public void signclick()
	{
		signclick.click();
	}
	public void uname(String user)
	{
		username.sendKeys(user);
	}
	public void password(String pwd)
	{
		pass.sendKeys(pwd);
	}
	public void login()
	{
		logbtn.click();
	}
	public void chklogin()
	{
		signout.isDisplayed();
	}

	
}
