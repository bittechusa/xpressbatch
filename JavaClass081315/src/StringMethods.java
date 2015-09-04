import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.firefox.FirefoxDriver;


public class A 
{
	@Test
	public void m1()
	{
		String s=" how are you  doing  ";
		String s1=new String("gdf dhjg sdfhkjhf vbjv");
		Integer  a=9;
		System.out.println(s.contains(s1));
		System.out.println(s.equals("hjdfg"));
		for(int i=0;i<s.length();i++)
		{
		System.out.println(s.charAt(i));
		}
		String [] s2=s.split(" ");
		for(int j=0;j<s2.length;j++)
		{
		System.out.println(s2[j]);
		}
		System.out.println(s.compareTo("ank"));
		System.out.println(s.replace("doing", "shahid"));
		System.out.println(s.concat("ul"));
		System.out.println(s.startsWith("how"));
		System.out.println(s.substring(4));
		System.out.println(s);
		System.out.println(s.trim());
		String s3="5";
		String s4="345";
		
	int a1=a.parseInt(s3);
	int b=a.parseInt(s4);
	System.out.println(a1+b);
	StringBuffer sb=new StringBuffer("gjghj");
	sb.append("ds");
	System.out.println(sb);
	//sb.substring(0);
	sb.append("fr");
	System.out.println(sb);
		}
	
	@Test
	public void m2()
	{
		FirefoxDriver dr=new FirefoxDriver();
		dr.get("http://www.facebook.com");
		try
		{
			dr.findElement(By.xpath("//button[@id='u_0_s']")).click();
			System.out.println(10/0);
		}catch(NoSuchElementException e)
		{
			System.out.println("element");
		}
		catch(ArithmeticException e2)
		{
			System.out.println("arithmatic");
		}
	
		
		finally
		{
			System.out.println("finally");
		}
	}
	
}
