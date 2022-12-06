package com.Actitime2.genericLibraries;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Actitime2.POM.LoginPage;

public class BaseClass  {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void DataBaseconnection () {
	Reporter.log("DataBase connected ",true);
	}
	
	@AfterSuite
	public void DataBaseDisconn() {
		Reporter.log("DataBase Disconnected",true);
	}
	@BeforeClass
	public void launch() throws IOException {
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 ReadDataFromPropertyFile data=new ReadDataFromPropertyFile();
		 String URL = data.ReadData("url");
		 driver.get(URL);
		 Reporter.log("Launch the browser");
	}
	
     @AfterClass
     public void Browserclose() {
	 // driver.close();
     }
	 
    @BeforeMethod
    public void login() throws IOException, InterruptedException {
    	
    	ReadDataFromPropertyFile data=new ReadDataFromPropertyFile();
    	 String un = data.ReadData("username");
    	 String pw = data.ReadData("password");
    	 LoginPage lp=new LoginPage(driver);
    	 lp.logintoActitime(un, pw);
    	     }
    
    @AfterMethod
    public void logout() {
    	/*HomePage hp=new HomePage(driver);
    	hp.Logout();*/
    }
    	
  
}
    
    
    
    
    
    
    
    
    
    
    
    


