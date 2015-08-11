package hardPain;


//Not Working..need Help!!


import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class windowHandle {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http:rang-bd.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		// clicking on different tab
		
		driver.findElement(By.xpath("//*[@id='footer_body']/div[1]/div/div[2]/div[1]/div[1]/ul/li/a/img")).click();
		
		//put both the window into array
		
		Set<String> allwindow = driver.getWindowHandles();
		Iterator it = allwindow.iterator();
		/*String mainwin = (String) allwindow.toArray()[0];
		String popwin = (String) allwindow.toArray()[1];*/
		
		//Switch to popwin
		
		String mainwin = (String) it.next();
		String popwin = (String) it.next();
		
		System.out.println(mainwin);
		System.out.println(popwin);
		
		driver.switchTo().window(popwin);
		
		driver.findElement(By.xpath("//*[@id='pagelet_loggedout_sign_up']/div/a[1]/span")).click();
		Thread.sleep(5000);
	
		//Switch to mainwin
		
		driver.switchTo().window(mainwin);
		
		
		
		
		
		
		
	}

}
