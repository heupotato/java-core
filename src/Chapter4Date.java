import java.util.*;

public class Chapter4Date {
	public static void main(String[] args) {
		/*
		 * 4.2.1. Objects and Object Variables Working with Date class
		 */

		System.out.println(new Date());

		// use toString method
		String s = new Date().toString();
		System.out.println(s);

		// birthday is an object variable, refers to object <new Date()>
		Date birthday = new Date();

		Date deadline;
		deadline = new Date();

		deadline = null;
		deadline = birthday;
		if (deadline != null)
			System.out.println(deadline);

	}

}
