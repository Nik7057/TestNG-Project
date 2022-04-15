package Resources;
 
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebDriver driver;//We are set WebDriver Globally (If we are using Firefox,Internet Explorer or any web browser then we put only driver like line 26)
	
	public WebDriver initializeDriver() throws IOException {
		
		//To read the Properties File ("Path of Data.Properties File's Path {Ri8 Click on Data.Properties then Open properties and Copy Location}")
		FileInputStream FIS=new FileInputStream("C:\\Users\\Nikhil\\eclipse-workspace\\E2ETestNG_Project\\src\\main\\java\\Resources\\Data.Properties");
		
		//To access the properties File
		Properties Prop=new Properties();
		Prop.load(FIS);
		String BrowserName=Prop.getProperty("browser");
		
		if(BrowserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nikhil\\Desktop\\Selenium Jars\\Chrome Driver\\chromedriver.exe");
	        driver = new ChromeDriver();
		}
		
// If we required another browser then change Value in File (Data.Properties {browser=Firefox}) & Use If-Else
		
		else if(BrowserName.equals("Firefox")) {
			//System.setProperty(Firefox Driver Path)
			//driver=new FirefoxDriver();
		}
		
		else if(BrowserName.equals("Internet Explorer")) {
			//System.setProperty(Internet Explorer Driver Path)
			//driver=new Internet Explorer();
		}
		
		else {
			System.out.println("Use any One of the Above Browser");
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
				
	}
	
	 @BeforeMethod
	 public void launchBrowser() throws IOException {
	  driver=initializeDriver();
	  driver.get("https://login.salesforce.com/?locale=in");
	  
	 }
	

}
