package softPain;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingCookies {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		
		Set<Cookie> cokies = driver.manage().getCookies();
		System.out.println("Total cookies"+ cokies.size());
		
		Iterator<Cookie> iter =cokies.iterator();
		
		while (iter.hasNext()){
			
			Cookie c = iter.next();
			System.out.println(c.getDomain()+"---"+c.getName()+"----"+c.getValue());
			
		}
		

	}

}
