package Page_Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;

public class SignUp_Page_Object {
	public WebDriver driver;
	
	
	private By firstName = By.xpath("//input[@name='UserFirstName']");
	private By lastName = By.xpath("//input[@name='UserLastName']");
	private By workEmail = By.xpath("//input[@name='UserEmail']");	
	private By jobTitle = By.xpath("//select[@name='UserTitle']");
	private By company = By.xpath("//input[@name='CompanyName']");
	private By employees = By.xpath("//select[@name='CompanyEmployees']");
	private By phone = By.xpath("//input[@name='UserPhone']");
	private By countryRegion = By.xpath("//select[@name='CompanyCountry']");
	private By mainServiceAgreement = By.xpath("//div[@class='checkbox-ui']");
	

	public SignUp_Page_Object(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}

	
	public WebElement firstNamef() {
		return driver.findElement(firstName);
	}
		
	public WebElement lastNamel() {
		return driver.findElement(lastName);
	}
	
	public WebElement workEmailWE() {
		return driver.findElement(workEmail);
	}

	public WebElement jobTitleJT() {
		return driver.findElement(jobTitle);
	}
	
	public WebElement companyC() {
		return driver.findElement(company);
	}
	
	public WebElement employeesE() {
		return driver.findElement(employees);
	}
	
	public WebElement phoneP() {
		return driver.findElement(phone);
	}
	
	public WebElement countryRegionCR() {
		return driver.findElement(countryRegion);
	}
	
	public WebElement mainServiceAgreementMA() {
		return driver.findElement(mainServiceAgreement);
	}

}