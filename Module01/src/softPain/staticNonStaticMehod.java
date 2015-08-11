package softPain;

public class staticNonStaticMehod {

	
	static int price = 0;
	static int wheel = 0;
	static String name =null;
	
	public static void main(String[] args) {
		
		harleydevid();
		
		
		System.out.println("I miss u");
		

	}private static void harleydevid() {
		// TODO Auto-generated method stub
		
	}

	public static void  harleydevid (double tax, int mile){
		
		name = "HD001";
		wheel =3;
		price = 50000;
		tax = (price*.10);
		
		System.out.println(tax);
		
	} public void  BMW(double tax)  {
		
		name ="BMWx3";
		wheel = 2;
		price = 65000;
		tax =(price*.10);
		 
	}

}
