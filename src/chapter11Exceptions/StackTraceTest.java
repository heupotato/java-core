package chapter11Exceptions;

import java.util.*;

public class StackTraceTest {
	/**
	 * 
	 * @param n a non-negative integer
	 * @return n!
	 */
	public static int factorial (int n) {
		System.out.println("factorial (" + n + "):"); 
		Throwable t = new Throwable(); 
		StackTraceElement[] frames = t.getStackTrace();
		for (StackTraceElement f : frames)
			System.out.println(f); 
		int r; 
		if (n <= 1) r = 1; 
		else r = n * factorial (n - 1); 
		System.out.println("return " + r);
		return r; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); 
		System.out.print("Enter n: ");
		int n = in.nextInt(); 
		factorial(n); 
	}

}
