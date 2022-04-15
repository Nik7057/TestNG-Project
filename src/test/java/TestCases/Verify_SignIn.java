package TestCases;

import org.testng.annotations.Test;

import Page_Object_Model.SignIn_Page_Object;
import Resources.BaseClass;

public class Verify_SignIn extends BaseClass {
	
	@Test
	 public void enterCredientials(){
	  
		SignIn_Page_Object spo=new SignIn_Page_Object(driver);
	 // driver.findElement(By.xpath("")).sendKeys("jjdj");
	  spo.enterUserName().sendKeys("rahul");
	  spo.enterPassword().sendKeys("secure123");
	  spo.clickOnLogin().click();	  
	  
	 }
}
