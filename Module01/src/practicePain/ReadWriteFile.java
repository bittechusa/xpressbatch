package practicePain;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteFile {

	public static void main(String[] args) throws IOException {
	
		File myfile = new File("D:\\Munna\\ILO.xls");
		myfile.createNewFile();
		
		FileWriter w = new FileWriter("D:\\Munna\\ILO.xls");
		BufferedWriter out = new BufferedWriter(w);
		out.write("Life is not bed of roses");
		out.newLine();
		out.write("No pain, No success!!");
		out.flush();
		
		FileReader x = new FileReader("D:\\Munna\\ILO.xls");
		BufferedReader in = new BufferedReader(x);
		String y ="";
		
		System.out.println("------------------------");
		
		while((y=in.readLine())!=null){
			
			System.out.println(y);
		}
		
	}

}
