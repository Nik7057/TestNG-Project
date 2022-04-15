package TestCases;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Page_Object_Model.SignIn_Page_Object;
import Page_Object_Model.SignUp_Page_Object;
import Resources.BaseClass;

@Test
public class Verify_SignUp extends BaseClass{
	
	public void signUp() throws InterruptedException {
		//Sign In Page Objects
		SignIn_Page_Object spo = new SignIn_Page_Object(driver);
		spo.ClickSignUp().click();
		
		//Sign Up Page Objects
		SignUp_Page_Object sup = new SignUp_Page_Object(driver);
//		Thread.sleep(5000);
		sup.firstNamef().sendKeys("Nikhil");
		sup.lastNamel().sendKeys("Password");
		sup.workEmailWE().sendKeys("Nil@gmail.com");
		
		//Selecting from dropdownList Job Title
		Select s1 = new Select(sup.jobTitleJT());
		s1.selectByIndex(1);
		
		sup.companyC().sendKeys("AllIncLLP");
		
		//Selecting from dropdownList Employees
		Select s2 = new Select(sup.employeesE());
		s2.selectByIndex(2);
		
		sup.phoneP().sendKeys("8668458561");
		
		//Selecting from Dropdown list Country/Region		
		Select s3 = new Select(sup.countryRegionCR());
		s3.selectByIndex(23);
		
		sup.mainServiceAgreementMA().click();
						
		
	}

}
