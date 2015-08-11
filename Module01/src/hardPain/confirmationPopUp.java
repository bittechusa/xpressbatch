package hardPain;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class confirmationPopUp {

	public WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
	
		

		WebDriver driver = new FirefoxDriver();
		driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Handle the confirmation popup
		driver.findElement(By.xpath("//*[@id='post-body-2641311481947341581']/div[1]/button[1]")).click();
		Alert conpop = driver.switchTo().alert();
		String msg = conpop.getText();
		System.out.println(msg);
		Thread.sleep(10000);
		
		//to make a confirmation
		
		conpop.accept();
	}

}
