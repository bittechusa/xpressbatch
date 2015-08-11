package hardPain;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class HwToRdPropertyFile {

	public static void main(String[] args) throws IOException {
		
		
		Properties prep = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\Md.Ataus\\workspace\\Module01\\src\\hardPain\\objects.properties");
		prep.load(ip);
		
		System.out.println(prep.getProperty("Fname", "atsmunna@gmail.com"));
		
		// to get the current project where i m working now
		
		System.out.println(System.getProperty("user.dir"));
				
		
	}

	
	
}
