package hardPain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


//objective to create personal xpath and how to write the tag

public class CreatingXpath {

	public static void main(String[] args) {
	
		WebDriver driver = new FirefoxDriver();
		driver.get("http://bbc.com");
		
		driver.findElement(By.xpath("//a[text()='asianews']")).click();
		
		

	}

}
