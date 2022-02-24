package chapter13Collection;

import java.util.*;

public class HashSetTest {
	public static void main(String[] args){
	Set<String> words = new HashSet<>(); // HashSet implements Set
	long totalTime = 0;
	
	Scanner in = new Scanner(System.in);
	while (in.hasNext()){
		String word = in.next();
		if (word.equals("quit")) break; 
		long callTime = System.currentTimeMillis();
		words.add(word);
		callTime = System.currentTimeMillis() - callTime;
		totalTime += callTime;
	}
	
	Iterator<String> iter = words.iterator();
	for (int i = 1; i <= 20 && iter.hasNext(); i++)
		System.out.println(iter.next());
		System.out.println(". . .");
		System.out.println(words.size() + " distinct words. " + totalTime + " milliseconds.");
	}
}