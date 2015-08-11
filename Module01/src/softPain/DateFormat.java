package softPain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) throws ParseException {

	String d = "04/15/2014";
		//extract month & date
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date mydate = df.parse(d);
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(mydate);
		
		int day =cal.get(Calendar.DAY_OF_MONTH);
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		
		System.out.println(day);
		System.out.println(month);
		System.out.println(year);

	}

}
