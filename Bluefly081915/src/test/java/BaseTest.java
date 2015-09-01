import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class BaseTest
{
	FirefoxDriver dr;
	@Before
	public void start()
	{
		dr=new FirefoxDriver();
		dr.get("http://www.bluefly.com");
		dr.manage().window().maximize();
		dr.navigate().refresh();
	}
	@After
	public void end()
	{
		dr.quit();
	}

}
