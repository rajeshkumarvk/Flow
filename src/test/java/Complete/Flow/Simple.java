package Complete.Flow;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class Simple {

	

	@Test
	 public void checkurl() throws IOException, ParseException  {	
		LoginPage lp = new LoginPage();		
			lp.navigatetourl();		
	 }
	
		
}
