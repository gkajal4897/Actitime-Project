package com.Actitime2.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Actitime2.POM.HomePage;
import com.Actitime2.POM.TaskPage;
import com.Actitime2.genericLibraries.BaseClass;





@Listeners(com.Actitime2.genericLibraries.ListnerImplementation.class)
public class CreateCustomer extends BaseClass  {

	    @Test
		public void createCust() throws InterruptedException, EncryptedDocumentException, IOException {
         /*Reporter.log("Customer Created",true);
         Assert.fail();*/
	    	HomePage hp=new HomePage(driver);
	    	hp.Tasks();
	    	  
	    	TaskPage tp=new TaskPage(driver);
	    	tp.AddNew();
	    	 
	
	    }
	    
	   
}
