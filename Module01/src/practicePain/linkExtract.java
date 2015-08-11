package practicePain;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linkExtract {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://rang-bd.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		try{
			
			List<WebElement> el = driver.findElements(By.tagName("a"));
			int x = el.size();
			System.out.println(x);
			
			for(WebElement link:el){
				
				String linktext= link.getText();
				String linkpage = link.getAttribute("href");
				
				System.out.println(linktext +"->");
				System.out.println(linkpage);
			}
			
			
		}catch(Exception e){
			
			System.out.println("error"+e);
		}
		
		driver.close();
		
		

	}

}
