package week3.day1;

public class StringAssigment7FindTypes {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
//		package week1.day2.classroom.string;
//
//		public class FindTypes {
//			
//			public static void main(String[] args) {
//				// Here is the input
//				String test = "$$ Welcome to 2nd Class of Automation $$ ";
//
//				// Here is what the count you need to find
//				int  letter = 0, space = 0, num = 0, specialChar = 0;
//
//				// Build the logic to find the count of each
//				/* Pseudo Code:
//					a) Convert the String to character array
//					b) Traverse through each character (using loop)
//					c) Find if the given character is what type using (if)
//							i)  Character.isLetter
//							ii) Character.isDigit
//							iii)Character.isSpaceChar
//							iv) else -> consider as special character
//				*/
//
//				// Print the count here
//				System.out.println("letter: " + letter);
//				System.out.println("space: " + space);
//				System.out.println("number: " + num);
//				System.out.println("specialCharcter: " + specialChar);
//
//				/*
//			}
//		}
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
				
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		char[] charTest = test.toCharArray();
				
		for (int i = 0; i < charTest.length; i++) {
			
			if((Character.isLetter(charTest[i])==true))
			{
				letter = letter+1;
			}
			else if((Character.isDigit(charTest[i])==true) )
			{
				num = num+1;
			}
			else if((Character.isSpaceChar(charTest[i])==true) )
			{
				space = space+1;
			}
			else 
			{
				specialChar = specialChar+1;
			}
			
		}
		
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
