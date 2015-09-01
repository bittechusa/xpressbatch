import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Shared 
{
	FirefoxDriver dr;
	Shared(FirefoxDriver x)
	{
		dr=x;
	}
	public void verifyTitle(String text)
	{
		try
		{
			dr.getTitle().contains(text);
			System.out.println("found");
		}catch(Exception e)
		{
			System.out.println("title not matched");
		}
	}
	void isElementPresent(WebElement ele)
	{
		try{
			ele.isDisplayed();
		}catch(Exception e)
		{
			System.out.println("not Present");
		}
	}

}
