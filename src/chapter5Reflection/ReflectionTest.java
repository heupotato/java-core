package chapter5Reflection;

import java.util.*;
import java.lang.reflect.*;
import static java.lang.System.*; 

public class ReflectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name; 
		if (args.length > 0) name = args[0]; 
		else {
			Scanner in = new Scanner(System.in); 
			out.println("Enter class name: "); 
			name = in.next(); 
		}
		
		try {
			Class cl = Class.forName(name); 
			Class supercl = cl.getSuperclass(); 
			String modifiers = Modifier.toString(cl.getModifiers()); 
			if (modifiers.length() > 0) out.print(modifiers + " "); 
			out.print("class " + name);
			
			if (supercl != null && supercl != Object.class)
				out.print(" extends " + supercl.getName()); 
			
			out.print("\n{\n");
			printConstructors(cl);
			out.println();
			printMethods(cl);
			out.println();
			printFields(cl);
			out.println("}");
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		exit(0); 
		
	}

	private static void printFields(Class cl) {
		Constructor[] constructors = cl.getDeclaredConstructors(); 
		
		for (Constructor c : constructors) {
			String name = c.getName(); 
			out.print(" ");
			String modifiers = Modifier.toString(c.getModifiers());
			if (modifiers.length() > 0) System.out.print(modifiers + " ");
			out.print(name + "(");
			
			Class[] paramTypes = c.getParameterTypes(); 
			for (int j = 0; j < paramTypes.length; j++) {
				if (j > 0) System.out.print(", ");
				out.print(paramTypes[j].getName());
			}
			out.println(");"); 
		}
	}

	private static void printMethods(Class cl) {
		Method[] methods = cl.getDeclaredMethods();
		for (Method m : methods) {
			Class retType = m.getReturnType(); 
			String name = m.getName(); 
			
			out.print(" ");
			
			String modifiers = Modifier.toString(m.getModifiers());
			if (modifiers.length() > 0) System.out.print(modifiers + " ");
			out.print(retType.getName() + " " + name + "(");
			
			Class[] paramTypes = m.getParameterTypes(); 
			for (int j = 0; j < paramTypes.length; j++) {
				if (j > 0) out.print(", "); 
				out.print(paramTypes[j].getName());
			}

		}
		
	}

	private static void printConstructors(Class cl) {
		Field[] fields = cl.getDeclaredFields();
		
		
		for (Field f : fields)
		{
			Class type = f.getType();
			String name = f.getName();
			System.out.print(" ");
			String modifiers = Modifier.toString(f.getModifiers());
			if (modifiers.length() > 0) System.out.print(modifiers + " ");
			out.println(type.getName() + " " + name + ";");
		}
	}

}
