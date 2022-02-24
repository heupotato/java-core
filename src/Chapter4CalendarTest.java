import java.text.DateFormatSymbols;
import java.util.*;

public class Chapter4CalendarTest {
	
	/*
	 * print calendar 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar gd = new GregorianCalendar(); 
		
		int today = gd.get(Calendar.DAY_OF_MONTH); 
		int month = gd.get(Calendar.MONTH); 
		
		gd.set(Calendar.DAY_OF_MONTH, 1);
		int weekday = gd.get(Calendar.DAY_OF_WEEK); 
		
		int firstWeekDay = gd.getFirstDayOfWeek(); //Sunday
		
		int prevMonthDays = 0; 
		
		while (weekday != firstWeekDay) {
			prevMonthDays++; 
			gd.add(Calendar.DAY_OF_MONTH, -1);
			weekday = gd.get(Calendar.DAY_OF_WEEK); 
		}
		
		//print weekday names
		String[] weekdayNames = new DateFormatSymbols().getShortWeekdays(); 
		
		do
		{
			System.out.printf("%4s", weekdayNames[weekday]);
			gd.add(Calendar.DAY_OF_MONTH, 1);
			weekday = gd.get(Calendar.DAY_OF_WEEK);
		} 
		while (weekday != firstWeekDay);
		
		System.out.println(); 
		
		//print the indentations
		for (int i = 0; i < prevMonthDays; i++) 
			System.out.print("    ");
		
		gd.set(Calendar.DAY_OF_MONTH, 1);
		while (gd.get(Calendar.MONTH) == month) {
			int day = gd.get(Calendar.DAY_OF_MONTH);
			System.out.printf("%3d", day);
			
			if (day == today) System.out.print("*");
			else System.out.print(" ");
			
			gd.add(Calendar.DAY_OF_MONTH, 1);
			weekday = gd.get(Calendar.DAY_OF_WEEK);

			if (weekday == firstWeekDay) System.out.println(); 

		}
	}

}
