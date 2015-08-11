package hardPain;

public class StringFungtion {

	public static void main(String[] args) {
		
		String str = "Java program is so hard";
		String str1 = "Java program is not so hard";
		
		/*//to find the specific index/charecter
		System.out.println(str.charAt(5));
		//to find the specific word
		System.out.println(str.indexOf("is"));
		
		//to compare the string
		System.out.println(str.equalsIgnoreCase(str1));
		
		//to display on uppercase 
		
		System.out.println(str.toUpperCase());
		
		//to display on lowercase
		
		System.out.println(str1.toLowerCase());
		// to create the substring
		
		System.out.println(str.substring(2, 17));*/
		
		//to split the string
		
		String temp[] = str.split("so");
		
		
		
		for(int i=0;i<temp.length;i++)
			
			System.out.println(temp[i]);
		
		String x = "Java";
		int y = Integer.parseInt(x);
		
		System.out.println(x);
		
	
		
	}

}
