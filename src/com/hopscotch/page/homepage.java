package com.hopscotch.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class homepage  {
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

@FindBy(xpath="//div[.='Please enter valid Mobile/Email']")
public WebElement mailmsg;

@FindBy(xpath="//div[.='Please enter a valid password']")
public WebElement pwdmsg;

@FindBy(xpath="//span[.='Oops! Your password is incorrect. Please try again']")
public WebElement wrongpwd;

@FindBy(xpath="//div[.='Enter a valid email address']")
public WebElement invalidmail;

@FindBy(xpath="//span[.='New here? Join us']")
public WebElement mailnotreg;

@FindBy(xpath="//div[.='Sign out']")
public WebElement signout;








public homepage(WebDriver driver)
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

public boolean warnmail()
{
	return mailmsg.isDisplayed();
}
public boolean warnpwd()
{
	return pwdmsg.isDisplayed();
}
public boolean wrongpass()
{
	return wrongpwd.isDisplayed();
}
public boolean invalidmail()
{
	return invalidmail.isDisplayed();
}
public boolean mailnotreg()
{
	return mailnotreg.isDisplayed();
}

public void logout()
{
	signout.click();
}
}
