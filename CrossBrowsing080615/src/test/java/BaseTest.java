import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BaseTest 
{
	WebDriver dr;
	@Before
	public void m1()
	{
		String s=System.getProperty("browser");
				if(s.equals("f"))
				{
		         dr=new FirefoxDriver();
				}
				else if(s.equals("c"))
				{
		          System.setProperty("webdriver.chrome.driver", "C:/driver/chromedriver.exe");
		           dr=new ChromeDriver();
				}
				else if(s.equals("ie"))
				{
		          System.setProperty("webdriver.ie.driver", "C:/driver/IEDriverServer.exe");
		          dr=new InternetExplorerDriver();
				}
				else
					dr=new FirefoxDriver();
	}
	@Test
	public void test()
	{
		
	}

}
