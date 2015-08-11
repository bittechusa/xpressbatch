package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class gmailChekcing {
	
 WebDriver driver = new FirefoxDriver();
	
	@BeforeMethod
	
	public void openBrowser(){
		
		System.out.println("Opening the Browser"+"->");		
		driver.get("https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&hl=en&service=mail#identifier");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
		
	@AfterMethod
	
	public void closeBrowser(){
		
		driver.close();
		System.out.println("Closing the Browser"+"->");
			}
	
 @Test(priority=1)
  
  public void logging() {
	 
	 System.out.println("Measuring the test case");
	 
	 driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("atsmunna@gmail.com");
	 driver.findElement(By.xpath("//*[@id='next']")).click();
	 driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("Munna84!");
	 driver.findElement(By.xpath("//*[@id='signIn']")).click();
	 
	  } 
 
 @Test(priority = 2)
 
 public void sendingMail(){
	 
	 System.out.println("sending mail");
 } 
 
 @Test(priority =3)

 public void receivingMail(){
	 
	 System.out.println("receiving Mail");
 }
 
 @AfterTest()
 public void logOut(){
	 
	 System.out.println("check the after test");
	 driver.findElement(By.xpath("//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
	 driver.findElement(By.xpath("//*[@id='gb_71']")).click();
 }
 
 @BeforeTest()
 public void beforeTest(){
	 
	 System.out.println("Its verifying before test");
	 
 }

 
 
 
}
