import java.util.*;

public class Chapter4MutatorAccessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 4.2.2. The GregorianCalendar Class
		 */
		Date birthday = new Date();
		// getDay, getMonth, and getYear are deprecated
		Date today = new Date();
		if (today.before(birthday))
			System.out.println("Still time to shop for a gift.");

		GregorianCalendar gdate1 = new GregorianCalendar();

		// months are counted from 0 -> 11 is December
		GregorianCalendar gdate2 = new GregorianCalendar(1999, 11, 31);
		GregorianCalendar gdate3 = new GregorianCalendar(1999, Calendar.DECEMBER, 31);

		// set the time
		GregorianCalendar gdate4 = new GregorianCalendar(1999, Calendar.DECEMBER, 31, 23, 59, 59);

		/*
		 * 4.2.3. Mutator and Accessor Methods
		 */

		// accessor methods
		int month = gdate1.get(Calendar.MONTH);
		int weekday = gdate1.get(Calendar.DAY_OF_WEEK);
		System.out.println(month);
		System.out.println(weekday);

		// mutator methods
		GregorianCalendar deadline = new GregorianCalendar();

		// set
		deadline.set(Calendar.YEAR, 2001);
		deadline.set(Calendar.MONTH, Calendar.APRIL);
		deadline.set(Calendar.DAY_OF_MONTH, 15);

		deadline.set(2001, Calendar.APRIL, 15);

		// add
		deadline.add(Calendar.MONTH, 3);
	}

}
