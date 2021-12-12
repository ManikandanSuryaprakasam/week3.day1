package week3.day1;

import java.util.Iterator;

public class StringAssignment7ChangeOddIndexToUpperCase {
	
//	package week1.day2.assignments.mandatory;
//
//	public class ChangeOddIndexToUpperCase {
//		
//		
//		/*
//		 Pseudo Code
//		 
//		 * Declare String Input as Follow
//		  
//		 * String test = "changeme";
//		 
//		 * a) Convert the String to character array
//		 
//		 * b) Traverse through each character (using loop)
//		 
//		 * c)find the odd index within the loop (use mod operator)
//		 
//		 * d)within the loop, change the character to uppercase, if the index is odd else don't change
//		  
//		 */
//	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		char[] a = test.toCharArray();		
		
		for (int i = 0; i < test.length(); i++) {
			
			a[i] = 	test.charAt(i);
			
			if((i % 2)==1)
			{
				a[i] = Character.toUpperCase(a[i]);
	}

}
		String output = String.valueOf(a);
		System.out.println("The changed string is: " +output);
	
}
}