package hardPain;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class extractingAllLinks{

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http:rang-bd.com");
		
		
		try {
		    List <WebElement> no = driver.findElements(By.tagName("a"));
		    int nooflinks = no.size(); 
		    System.out.println(nooflinks);
		    for (WebElement pagelink : no)
		         {
		          String linktext = pagelink.getText();
		          String link = pagelink.getAttribute("href"); 
		          System.out.println(linktext+" ->");
		          System.out.println(link);
		          }
		   }catch (Exception e){
		             System.out.println("error "+e);
		         }
		
	
		
		
		

	}

}
