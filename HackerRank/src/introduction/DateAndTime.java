package introduction;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class DateAndTime {

	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
	        String month = in.next();
	        String day = in.next();
	        String year = in.next();
	        
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	        LocalDate date = LocalDate.parse(month+"/"+day+"/"+year, formatter);
	        DayOfWeek dow = date.getDayOfWeek();
	        System.out.println((dow.getDisplayName(TextStyle.FULL, Locale.US)).toUpperCase());
	        in.close();
	       
	        

	}

}
