package chapter5Enums;

import java.util.*;
import static java.lang.System.*; 

public class EnumTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		out.print("Enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE) ");
		String input = in.next().toUpperCase();
		Size size = Enum.valueOf(Size.class, input);
		out.println("size = " + size); 
		out.println("abbreviation = " + size.getAbbreviation()); 
		if (size == Size.EXTRA_LARGE)
			out.println("Good job"); 
	}
}
