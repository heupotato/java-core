package chapter11Exceptions;

import java.io.*;
import java.util.*;

public class TryResourceTest {

	public static void main(String[] args) throws FileNotFoundException {
		try (Scanner in = new Scanner(new FileInputStream("D:\\Work\\18TCLC_NHAT\\Java Code\\Intern\\java-core\\src\\chapter10Exceptions\\TryResourceFileInput.txt")))
		{
			while (in.hasNext())
			System.out.println(in.next());
		}

	}

}
