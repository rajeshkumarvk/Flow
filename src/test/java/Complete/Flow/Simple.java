package Complete.Flow;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Simple {

	

	@Test
	 public void checkurl() throws IOException, ParseException  {	
		LoginPage lp = new LoginPage();		
			lp.navigatetourl();		
	 }
	
		
}
