package practicePain;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropDown {
	
	WebDriver driver = new FirefoxDriver();
	
	 @BeforeTest
	 public void befortest(){
		 
		driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
	 }
	 
	 @AfterTest
	 public void aftertest(){
		 
		 driver.close();
		 
		 
	 }
	 
	 @Test
	 
	 public void selectDropBox(){
		 
		 //sending a first name
		 driver.findElement(By.xpath("//*[@id='text1']")).sendKeys("Munna");
		 
		 
		 //select the drop box
		 
		 Select drpdwnbx = new Select (driver.findElement(By.xpath("//*[@id='Carlist']")));
		 drpdwnbx.selectByVisibleText("BMW");
		 
		 WebDriverWait wait = new WebDriverWait(driver, 15);
	
		 
		 
	 }
	 
	 
	
	

}
