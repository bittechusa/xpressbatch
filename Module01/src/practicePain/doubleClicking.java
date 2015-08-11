package practicePain;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClicking {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://only-testing-blog.blogspot.in/2014/09/selectable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement el = driver.findElement(By.xpath("//button[contains(.,'Double-Click Me To See Alert')]"));
		
		//to generate double click
		Actions action = new Actions(driver);
		action.doubleClick(el);
		action.perform();
		Thread.sleep(5000);
		
		//show the massage and swithch the window
		
		String alertmsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		
		System.out.println(alertmsg);
		
		driver.close();

	}

}
