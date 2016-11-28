package formreleaf.gittest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class NewTest {		
	    private WebDriver driver;		
		@Test (priority = 1, description = "This is check for webpage title")				
		public void testEasy() {	
			driver.get("http://www.guru99.com/selenium-tutorial.html");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Free Selenium Tutorials"));			
		}	
		
		@BeforeTest
		public void beforeTest() {	
		    driver = new FirefoxDriver();  
		}	
		
		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}
}