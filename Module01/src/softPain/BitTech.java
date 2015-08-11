package softPain;

import java.util.Set;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class BitTech {

	@Test
    public void m1() throws InterruptedException
    {
        FirefoxDriver dr=new FirefoxDriver();
        dr.get("http://bittechusa.com/alert.html");
        dr.findElement(By.xpath("//input[@value='login1']")).click();
        Alert a=dr.switchTo().alert();
        System.out.println(a.getText());
        if(a.getText().contains("hi,this is confirm box"))
        {
            System.out.println("right");
        }
        else
            System.out.println("wrong");
        a.accept();
        Thread.sleep(3000);
        dr.findElement(By.xpath("//input[@value='login2']")).click();
        Alert a1=dr.switchTo().alert();
        a1.sendKeys("jhdgfgjfdhfd");
        a1.accept();
        
        
    }
    @Test
    public void m2() throws InterruptedException
    {
        FirefoxDriver dr=new FirefoxDriver();
        dr.get("http://eshopper24.com");
        dr.manage().window().maximize();
        Actions a=new Actions(dr);
        WebElement ele=dr.findElement(By.xpath("html/body/div[4]/header/section[3]/div/nav/ul/li[1]/a"));
        a.contextClick(ele).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
        String pwin=dr.getWindowHandle();
        Set<String> cwin=dr.getWindowHandles();
        for(String w:cwin)
        {
            if(!w.equals("pwin"))
            {
                dr.switchTo().window(pwin);
                
                Thread.sleep(3000);
                dr.findElement(By.xpath("html/body/div[4]/div[2]/div/ul/li[3]/button")).click();
            }
        }
    }
    @Test
    public void m3()
    {
        FirefoxDriver dr=new FirefoxDriver();
        dr.get("http://jqueryui.com/droppable/");
        dr.manage().window().maximize();
        dr.switchTo().frame(0);
        Actions a=new Actions(dr);
        WebElement ele=dr.findElement(By.xpath(".//*[@id='draggable']"));
        WebElement ele1=dr.findElement(By.xpath(".//*[@id='droppable']"));
        a.dragAndDropBy(ele, 100, 50).build().perform();
        a.dragAndDrop(ele, ele1).build().perform();
}
   @After
   
   public void m4(){
	   FirefoxDriver dr=new FirefoxDriver();
	   
	   dr.quit();
	   
   }
    
    
}