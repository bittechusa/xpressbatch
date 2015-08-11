package practicePain;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseHov {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new FirefoxDriver();
		driver.get("http:rang-bd.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		Actions act = new Actions(driver);
		WebElement el = driver.findElement(By.xpath("//*[@id='menu']/ul/li[2]/a"));
		
		System.out.println(el.getText()+"---->"+el.getSize());
		
		act.moveToElement(el);
		driver.findElement(By.xpath("//*[@id='menu']/ul/li[2]/ul/li[1]/a")).click();
		Thread.sleep(5000);
		
		driver.navigate().back();
		Thread.sleep(5000);
		
		driver.close();
	}

}
