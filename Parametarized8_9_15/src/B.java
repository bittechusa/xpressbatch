import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class B {	
		WebDriver dr;
		
		
		
		
		@Before
		public void startdr(){
		dr = new FirefoxDriver();	
		dr.get("http://www.facebook.com");
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
		dr.manage().window().maximize();
		}
		@Test
		public void m1() throws InterruptedException{
		dr.findElement(By.xpath(".//*[@id='email']")).sendKeys("kazi");
		dr.findElement(By.xpath(".//*[@id='pass']")).sendKeys("shaibal12345");
		dr.findElement(By.xpath(".//*[@id='u_0_x']")).click();
		Thread.sleep(4000);}
		@Test
		public void m2(){
		dr.findElement(By.id("u_0_b")).sendKeys("shaibal");
		dr.findElement(By.id("u_0_d")).sendKeys("kazi");
		dr.findElement(By.id("u_0_f")).sendKeys("shaibal12@gmail.com");
		dr.findElement(By.id("u_0_i")).sendKeys("shaibal12@gmail.com");
		dr.findElement(By.id("u_0_k")).sendKeys("shaibal12345");
		dr.findElement(By.id("month")).sendKeys("Feb");
		dr.findElement(By.id("day")).sendKeys("6");
		dr.findElement(By.id("year")).sendKeys("1990");
		dr.findElement(By.id("u_0_o")).click();
		dr.findElement(By.id("u_0_s")).click();
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
		}
		
		@Test 
		public void m3(){
		calculator xy = new calculator();
		xy.add(10, 20);
		xy.sub(50, 20);
		xy.name("Bit", "school");
		}
		
		@After
		public void drquit(){
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
		dr.quit();
		}
	}


