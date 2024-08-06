package Complete.Flow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Simple {
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		
				
		//ChromeOptions chromeoptions = new ChromeOptions();
		
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		
		

	}

	@Test
	 public void checkurl() {
		 
		 driver.get("http://eaapp.somee.com/");
			
		
	 }
	
	@AfterTest
	public void Teardown() {
		
		driver.quit();
	}
	
}
