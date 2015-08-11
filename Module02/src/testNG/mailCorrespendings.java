package testNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mailCorrespendings {

	
	@BeforeTest
public void mailStatus() throws Exception{
		
		System.out.println("Test the mailing");
		

	}	

	@Test
public void sendingMail(){
	
		System.out.println("Processing to sent mail");
		
		
}
	
	@Test
public void receivingMail(){
		
		System.out.println("Receiving the mail");
	}
	
}
