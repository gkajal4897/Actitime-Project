package com.Actitime2.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="username")
	private WebElement ubntx;
	
	@FindBy(name="pwd")
	private WebElement pwdtx;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement login;
	
	public LoginPage(WebDriver driver)//constructor
	{
		 PageFactory.initElements(driver, this);
	}

	public WebElement getUbntx() {
		return ubntx;
	}

	public WebElement getPwdtx() {
		return pwdtx;
	}

	public WebElement getLogin() {
		return login;
	}
//Generic method
	public void logintoActitime(String un, String pw)
	{
		ubntx.sendKeys(un);
		pwdtx.sendKeys(pw);
		login.click();
	}
	
	
	}
		

