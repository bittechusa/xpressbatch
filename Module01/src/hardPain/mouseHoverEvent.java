package hardPain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHoverEvent {

	public static void main(String[] args) {
	
	//How to perform mouse hover 	
		WebDriver driver = new FirefoxDriver();
		driver.get("http:rang-bd.com");
		
		//initialize actions class and find the location
		//select the tab and perform
	
		Actions act = new Actions(driver);
		WebElement move = driver.findElement(By.xpath("//*[@id='menu']/ul/li[2]/a"));
		act.moveToElement(move);
		act.perform();

	}

}
