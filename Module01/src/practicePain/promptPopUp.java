package practicePain;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class promptPopUp {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		// to handle the prompt pop up
		
		driver.findElement(By.xpath("//*[@id='post-body-2641311481947341581']/div[1]/button[2]")).click();
		
		Alert act = driver.switchTo().alert();
		
		String x = act.getText();
		System.out.println(x);
		
		act.sendKeys("This is Munna");
		act.accept();
		
		driver.close();
	}

}
