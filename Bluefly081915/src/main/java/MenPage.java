import junit.framework.Assert;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.LoadableComponent;


public class MenPage extends LoadableComponent<MenPage>{

	FirefoxDriver dr;
	Shared s;
	MenPage(FirefoxDriver x)
	{
		dr=x;
	}
	void verifyMenTitle()
	{
		s=new Shared(dr);
		s.verifyTitle("Men");
	}
	@Override
	protected void load() {
		// TODO Auto-generated method stub
		dr.get("http://www.bluefly.com/a/men-clothing-shoes-accessories");
		
	}
	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		Assert.assertTrue(dr.getCurrentUrl().equals("http://www.bluefly.com/a/men-clothing-shoes-accessories"));
		
	}
}
