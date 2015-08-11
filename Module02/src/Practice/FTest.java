package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FTest {

	public static void main(String[] args) {
	
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://facebook.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='u_0_s']")).click();
		
		String x = driver.getPageSource();
		
		System.out.println(x);
		
		}

}
