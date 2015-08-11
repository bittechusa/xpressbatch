package hardPain;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ToWriteAFile {

	public static void main(String[] args) throws IOException {
		
		//process to create  a file
		File myfile = new File("D:\\Munna\\temp.txt");
		myfile.createNewFile();
		
		// process to write the file
		
		FileWriter w = new FileWriter("D:\\Munna\\temp.txt");
		BufferedWriter out = new BufferedWriter(w);
		//start to write the line
		out.write("I love Bangladesh");
		out.newLine();
		out.write("to perform infront of the mirror, is not the way to get success");
		out.newLine();
		out.write("U have to perform in the field to show the talent");
		out.flush();
		
		//start to read the file
		
		FileReader r = new FileReader("D:\\Munna\\temp.txt");
		BufferedReader bf = new BufferedReader(r);
		String x = "";
		
		//System.out.println(bf.readLine());
		//System.out.println(bf.readLine());
		
		System.out.println("************");
		//to retrive the all line from the file
		while((x=bf.readLine())!=null){
			
			System.out.println(x);
		}
		
	}

}
