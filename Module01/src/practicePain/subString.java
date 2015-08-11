package practicePain;

public class subString {

	public static void main(String[] args) {
	
		String st1 = "This World is Very Nice";
		String st2 = "And Beautiful!!";
		
		//To compare two string
		System.out.println("st1 equals to st2?-> "+st1.equals(st2));
		
		//Concatenates st1 with st2
		
		System.out.println("concatinate -> "+ st1. concat( st2));

		// Retrive the 9th index charecter from st1
		
		System.out.println(st1.charAt(5));
		
		//find the length of st1
		
		System.out.println(st1.length());
		
		//to make the st1 upper case
		
		System.out.println(st1.toUpperCase());
		
		//to make the st2 lower case
		
		System.out.println(st2.toLowerCase());
		
		//retrive the index from first i
		
		System.out.println(st1.indexOf("i"));
		System.out.println(st2.indexOf("u"));
		
		//retrive the index from 2nd most i charc
		
		System.out.println(st1.indexOf("i",18));
		
		//retrive the index the word "very"
		
		System.out.println(st1.indexOf("very"));
		
		//retrinv the index from 5-20
		
		System.out.println(st1.substring(10, 20));
		
		//trim 
		
		System.out.println(st2.trim());
		
	}

}
