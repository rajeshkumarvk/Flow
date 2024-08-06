package Pages;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.Readjson;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage extends Readjson{
	
	public static WebDriver driver;
	String filepath = "./test.json.txt"; 
	
	public LoginPage() {
		
WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
	}
	
public void navigatetourl() throws IOException, ParseException  {
		
	//	driver.get("http://eaapp.somee.com/");
	
	this.loadTestData(filepath);
	
	driver.get(testdata.get("URL8").toString());
		
	}

}
