import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class HomePage 
{
	FirefoxDriver dr;
	@FindBy(how=How.XPATH, using=".//*[@id='main-nav-men']/a")
	WebElement menLink;
	HomePage(FirefoxDriver x)
	{
		dr=x;
		PageFactory.initElements(dr, this);
	}
	MenPage clickMen()
	{
		menLink.click();
		return new MenPage(dr);
	}

}
