package practicePain;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class extractLink {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http:rang-bd.com");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		try{
			
			List<WebElement> no = driver.findElements(By.tagName("a"));
			int nooflink = no.size();
			System.out.println(nooflink);
			for(WebElement pagelink:no){
				
				String linktext = pagelink.getText();
				String link = pagelink.getAttribute("href");
				System.out.println(linktext+"->");
				System.out.println(link);
				
				
			}
			
		}catch( Exception e){
			
			System.out.println("error"+e);
			
			
		}
		
		
		
		
		}

}
