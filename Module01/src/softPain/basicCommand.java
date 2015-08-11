package softPain;

import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class basicCommand {

	public static void main(String[] args) {

		//How to open Browser
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html");
		
		//How to write implicit wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//How to maximize the browser
		
		driver.manage().window().maximize();
		
		// How to store text
		driver.findElement(By.xpath("//*[@id='post-body-2641311481947341581']/div[1]/form[1]/input[10]")).getText();
		
	
		// How to get Title
		
		
		driver.getTitle();
		
		System.out.println(driver.getTitle());
		//How to get current page
		
		driver.getCurrentUrl();
		
		System.out.println(driver.getCurrentUrl());
		
		
		driver.findElement(By.xpath("//*[@id='post-body-2641311481947341581']/div[1]/select")).isSelected();	

	}

}
