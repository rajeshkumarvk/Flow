package stepdefinition;

import Complete.Flow.Simple;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class steps {
	
	
	
	@Given("Open the Firefox and launch the application")				
    public void open_the_Firefox_and_launch_the_application() throws Throwable							
    {		
		
		Simple ss = new Simple();
        System.out.println("This Step open the Firefox and launch the application.");	
        ss.checkurl();
    }		

    @When("Enter the Username and Password")					
    public void enter_the_Username_and_Password() throws Throwable 							
    {		
    	
       System.out.println("This step enter the Username and Password on the login page.");		
      
    }	

}
