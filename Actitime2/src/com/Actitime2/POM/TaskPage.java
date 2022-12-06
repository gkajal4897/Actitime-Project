package com.Actitime2.POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Actitime2.genericLibraries.ReadDataFromExcel;

public class TaskPage {
	
	@FindBy(xpath="//div[.='Add New']")
	private WebElement AddN;
	
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement newc;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement cusname;
	
	@FindBy(xpath="(//textarea[@class='textarea'])[9]")
	private WebElement cusDesc;
	
	@FindBy(xpath="(//div[.='- Select Customer -'])[2]")
	private WebElement dropdown;
	
	@FindBy(xpath="(//div[.='Big Bang Company'])[6]")
	private WebElement sel;
	
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement createcus;
	
	public WebElement getCreatecus() {
		return createcus;
	}
	public WebElement getCusname() {
		return cusname;
	}

	public WebElement getCusDesc() {
		return cusDesc;
	}

	public WebElement getDropdown() {
		return dropdown;
	}
	public WebElement getSel() {
		return sel;
	}
	public WebElement getAddN() {
		return AddN;
	}

	public WebElement getNewc() {
		return newc;
	}

	public TaskPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void AddNew() throws EncryptedDocumentException, IOException {
		ReadDataFromExcel rxel= new ReadDataFromExcel();
		String cname = rxel.ReadDataExcel("Sheet1", 1, 1);
    	String cdesc = rxel.ReadDataExcel("Sheet1", 1, 2);
		AddN.click();
		newc.click();
		cusname.sendKeys(cname);
		cusDesc.sendKeys(cdesc);
		dropdown.click();
		sel.click();
		/*dropdown.click();
		sel.click();*/
		createcus.click();
		
	}
	

}
