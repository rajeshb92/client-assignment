package commonResources;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Respos {
			//setting up base URI
			public static String b1="https://api.ratesapi.io";
			
			//Storing no. of currencies returned in API response
			public static int currencyCount=32;
	
			//computing current date
			//Due to timezone difference, treating DATE-1 as current date
			public static Date day() {
			    final Calendar cal = Calendar.getInstance();
			    cal.add(Calendar.DATE, -1);
			    return cal.getTime();
			}
			
			public static String getTodayDateString() {
		        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		        return dateFormat.format(day());
			}
			
			//computing future date
			public static Date futureDay() {
			    final Calendar cal = Calendar.getInstance();
			    cal.add(Calendar.DATE, +5);
			    return cal.getTime();
			}
			
			public static String getFutureDayDateString() {
		        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		        return dateFormat.format(futureDay());
			}

}
