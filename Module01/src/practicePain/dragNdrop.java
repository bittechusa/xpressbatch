package practicePain;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class dragNdrop {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://rang-bd.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement drag = driver.findElement(By.xpath("//*[@id='content_body']/div/div[1]/div/div[2]/h1"));
		WebElement drop = driver.findElement(By.xpath("//*[@id='slider3']/li[4]/a/img"));
		
		Actions builder = new Actions(driver);
		Action dragNdrop = builder.dragAndDrop(drag, drop).build();
		
		dragNdrop.perform();
		
		driver.close();
		
		
		
		

	}

}
