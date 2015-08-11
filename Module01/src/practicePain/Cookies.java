package practicePain;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Cookies {

	public static void main(String[] args) {
	
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://gmail.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		Set<Cookie> cookie = driver.manage().getCookies();
		
		System.out.println(cookie.size());
		
		Iterator <Cookie> iter = cookie.iterator();
		
		while (iter.hasNext()){
			
			Cookie c = iter.next();
			
			System.out.println(c.getDomain()+"---"+c.getName()+"----"+c.getValue());
		}
		
		cookie.clear();
		driver.close();
		

	}

}
