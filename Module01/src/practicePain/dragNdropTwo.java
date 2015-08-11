package practicePain;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class dragNdropTwo {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://rang-bd.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement drag = driver.findElement(By.xpath("//*[@id='content_body']/div/div[1]/div/div[2]/h1"));
		Thread.sleep(5000);
		WebElement drop = driver.findElement(By.xpath("//*[@id='slider3']/li[4]/a/img"));
		
		Actions act = new Actions(driver);
		Action dragndrop = act.dragAndDrop(drag, drop).build();
		
		dragndrop.perform();
		
		driver.close();
		
		

	}

}
