package practicePain;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHover {

	public static void main(String[] args) {
	
		WebDriver driver = new FirefoxDriver();
		driver.get("http://rang-bd.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement el = driver.findElement(By.xpath("//*[@id='menu']/ul/li[2]/a"));
		Actions act = new Actions(driver);
		act.moveToElement(el);
		act.perform();
		driver.close();

	}

}
