package hardPain;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScreenShoot {
	
	WebDriver driver = new FirefoxDriver();


@BeforeTest
	public void beforeTest(){
	
	driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	
	}

@AfterTest
	public void afterTest(){
	
	driver.close();
	
}
@Test
	public void dropBoxTest() throws InterruptedException{
	
	driver.findElement(By.xpath("//*[@id='text1']")).sendKeys("ATSMUNNA");
	
	Select dropdown = new Select(driver.findElement(By.xpath("//*[@id='Carlist']")));
	dropdown.selectByIndex(4);
	Thread.sleep(5000);
	
	
}

@Test

	public void screenShoot() throws IOException{
	
	File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(screenshot, new File("D:\\screenshot.jpg"));
	  System.out.print("Screenshot is captured and stored in your D: Drive");
}
}