package seleniumclass081215;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;

public class SmokeTest 
{
	FirefoxDriver dr=new FirefoxDriver();
	@Test
<<<<<<< HEAD
	//to verify attribute of two elements

	public void m1()
=======
	public void m1()                                 //attributes
>>>>>>> cb5bdf8b9499ee5cb325b7655da571e497abd17a
	{
		
		dr.get("http://www.teachwise.com");
		String s=dr.findElement(By.xpath("")).getAttribute("id");
		dr.findElement(By.xpath("")).click();
		String s1=dr.findElement(By.xpath("")).getAttribute("id");
		if(s.equals(s1))
		{
			
		}
		else
			System.out.println("");
		    dr.findElement(By.xpath("")).getText();
			
	}
	@Test
<<<<<<< HEAD
	
	//Alert handling
	public void m2() throws InterruptedException
=======
	public void m2() throws InterruptedException       //alert box
>>>>>>> cb5bdf8b9499ee5cb325b7655da571e497abd17a
	{
		dr.get("file:///C:/xampp/htdocs/alert.html");
		dr.findElement(By.xpath("//input[@value='login']")).click();
		Alert a=dr.switchTo().alert();
		String x=a.getText();
		if(x.contains("hihgfhgfhgj"))
		{
			
		}
		else
			System.out.println();
		a.accept();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//input[@value='login1']")).click();//confirm box
		a.dismiss();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//input[@value='login2']")).click();//prompt box
		a.sendKeys("dgh");
		a.accept();
		Thread.sleep(2000);
		
		
	}
	@Test
<<<<<<< HEAD
	
	//Drag and drop test
	public void m3()
=======
	public void m3()                                //iframe
>>>>>>> cb5bdf8b9499ee5cb325b7655da571e497abd17a
	{
		dr.get("http://jqueryui.com/droppable/");
		dr.switchTo().frame(0);
		WebElement drag=dr.findElement(By.xpath(".//*[@id='draggable']"));
		WebElement drop=dr.findElement(By.xpath(".//*[@id='droppable']"));
		Actions a=new Actions(dr);
		a.dragAndDropBy(drag, 200, 100).build().perform();
		a.dragAndDrop(drag, drop).build().perform();
		
	}
	
	@Test
<<<<<<< HEAD
	
	//multiple window handle
	public void m4() throws InterruptedException
=======
	public void m4() throws InterruptedException    //Window Handling
>>>>>>> cb5bdf8b9499ee5cb325b7655da571e497abd17a
	{
		dr.get("http://www.eshopper24.com");
		WebElement ele=dr.findElement(By.xpath("html/body/div[4]/div[2]/div/section[1]/div[5]/figure/a/img"));
		Coordinates co=((Locatable)ele).getCoordinates();
		co.inViewPort();
		Thread.sleep(3000);
		Actions a=new Actions(dr);
		a.contextClick(ele).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
	    String pwin=dr.getWindowHandle();
	   Set< String> cwin=dr.getWindowHandles();
	   for(String w:cwin)
	   {
		   if(!w.equals(pwin))
		   {
			   dr.switchTo().window(pwin);
			   dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[1]/a/b")).click();
		   }
	   }
	}

}
