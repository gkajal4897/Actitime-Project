package com.Actitime2.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(id="logoutLink")
	private WebElement logout;
	
	@FindBy(xpath="//div[.='Tasks']")
	private WebElement tasklnk;
	
	@FindBy(xpath="//div[.='Reports']")
	private WebElement reportlnk;
	
	@FindBy(xpath="//div[.='Users']")
	private WebElement userlnk;
	
	public HomePage(WebDriver driver)//constructor
	{
		 PageFactory.initElements(driver, this);
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getTasklnk() {
		return tasklnk;
	}

	public WebElement getReportlnk() {
		return reportlnk;
	}

	public WebElement getUserlnk() {
		return userlnk;
	}
	
	public void Logout()
	{
		logout.click();
	}
	
	public void Tasks()
	{
		tasklnk.click();
	}
	
	
	
	}

