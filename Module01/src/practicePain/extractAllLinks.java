package practicePain;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class extractAllLinks {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://rang-bd.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//follow the try-catch block for throw the exception
		// in try block, initialize the webelement and find the tag by att "a"
		//as well as count the total number of link found
		
		try{
			List<WebElement> no = (List<WebElement>) driver.findElements(By.tagName("a"));
			int nooflink = no.size();
			System.out.println(nooflink);
			
			//using for loop to compare the link one by one , get the link text
			//follow the finding type "href"
			
			for(WebElement x:no){
				
				String linkplace = x.getText();
				String linktext = x.getAttribute("href");
				
				System.out.println(linkplace +"->");
				System.out.println(linktext);
				
			} 
			
			
			
		}catch(Exception e){
			
			System.out.println("Error Exception"+e);
		}
		

	}

}
