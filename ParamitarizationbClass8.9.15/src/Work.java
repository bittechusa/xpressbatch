import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Work 
{
	@Test
	public  void m() throws IOException 
	{
	
		FirefoxProfile fp=new FirefoxProfile();
		File f=new File("C:\\Users\\bittech\\Downloads\\firebug-2.0.1.xpi");
		File f1=new File("C:\\Users\\bittech\\Downloads\\firepath-0.9.7-fx.xpi");
		FirefoxBinary fbinary=new FirefoxBinary(new File("C:=\\Users\\bittech\\Downloads\\Firefox Setup 36.0.exe"));
		fp.addExtension(f);
		fp.addExtension(f1);
		FirefoxDriver dr=new FirefoxDriver(fbinary,fp);
		dr.get("http://www.facebook.com");
	}
	@Test
	public void m1()
	{
		int v[]=new int[4];
		v[0]=5;
		v[1]=9;
		v[2]=9;
		v[3]=4;
		Arrays.sort(v);
		//System.out.println(v.length-1);
		int max=v[0];
		for(int i=v.length-1;i>=0;i--)
			{
			if(v[i]>max)
			{
				max=v[i];
			}
			
			}
		System.out.println(max);
		int a []={3,6,7,8,1,9,4,6};
	}
	@Test
	public void m2()
	{
		ArrayList<String>ar=new ArrayList<String>();
		ar.add("cat");
		ar.add("ant");
		ar.add("yalp");
		
		Collections.sort(ar);
		Iterator ir=ar.iterator();
		/*while(ir.hasNext())
		{
			System.out.println(ir.next());
		}*/
		
		
		/*LinkedList<Integer>lk=new LinkedList<Integer>();
		ar.add(5);
		ar.add(8);
		ar.add(3);
		ar.remove(0);
		Long s=System.currentTimeMillis();
		FirefoxDriver dr=new FirefoxDriver();
		dr.get("http://www.facebook.com");
		Long s1=System.currentTimeMillis();
		System.out.println(s1-s);
		System.out.println(ar.get(0));
		Long s3=System.currentTimeMillis();
		for(int i=0;i<100000;i++)
		{
			ar.add(i);
		}
		for(int i=0;i<100000;i++)
		{
			ar.get(i);
		}
		Long s2=System.currentTimeMillis();
		System.out.println(s2-s3);
		Long s5=System.currentTimeMillis();
		for(int i=0;i<100000;i++)
		{
			lk.add(i);
		}
		for(int i=0;i<100000;i++)
		{
			lk.get(i);
		}
		Long s4=System.currentTimeMillis();
		System.out.println(s4-s5);
	
	HashMap<Integer ,String>mp=new HashMap<Integer,String>();
	mp.put(1, "shahid");
	mp.put(null, "gfhg");
	mp.put(1, "hhg");
	mp.put(1, "hgdfg");
	mp.put(7, "prijosh");
	//System.out.println(mp.get(1));
    for(int i=0;i<=7;i++)
    {
	System.out.println(mp.get(i));
    }
    
	Hashtable<Integer ,String>ht=new Hashtable<Integer,String>();
	ht.put(1, "shahid1");
	ht.put(1,"vxdfg");
	ht.put(5, "fu");
	ht.put(7, "prijosh1");
	//System.out.println(ht.);
	 for(int i=0;i<=7;i++)
	    {
		System.out.println(ht.get(i));
	    }*/
		//compare("sdfgd","dssfg");
	}
	
	
}
