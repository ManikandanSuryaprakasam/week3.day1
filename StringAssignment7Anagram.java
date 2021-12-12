package week3.day1;

import java.util.Arrays;
import java.util.Iterator;

public class StringAssignment7Anagram {

	public static void main(String[] args) {
		
		
//		package week1.day2.assignments.optional;
//
//		public class Anagram {
//			
//			/*
//			 * Pseudo Code
//			  
//			 *Declare a String 
//				String text1 = "stops";
//			 *Declare another String
//				String text2 = "potss"; 
//			 * a) Check length of the strings are same then (Use A Condition)
//			 * b) Convert both Strings in to characters
//			 * c) Sort Both the arrays
//			 * d) Check both the arrays has same value
//			 * 
//			 */
//
//
//
//		}
		
		
		
		
		String text1 = "stops";
		String text2 = "potss"; 
		boolean Anagram = false;
		char a[] = text1.toCharArray();
		char b[] = text1.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		for (int i = 0; i < b.length; i++) {
			
			if(a[i] != b[i])
			{
				Anagram = false;
				break;
			}
			else
			{
				Anagram =true;
			}
		}
		
		if(Anagram)
				System.out.println("The string is Anagram");
		else
			System.out.println("The string is not Anagram");
		
		
		
}
}