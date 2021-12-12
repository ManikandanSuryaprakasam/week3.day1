package week3.day1;

public class StringAssignment6 {

	public static void main(String[] args) {
		
//		 /Justify the above output
		
		
		String str3 = new String("Kutty");
		 String str4 = new String("Kutty");
		 
		 if(str3==str4) {
			 System.out.println(" Same text");
		 }
		 else
			 System.out.println("Diff text");
		 
		 System.out.println("***");
		 
		 
//		 OUTPUT:Diff text
//		 ***
//		 Reason is for string  == should not be used it compares the memory location instead the actual string value .
//		 For string only string methods like equals,equalIgnoreCase,contains etc. should be used.
		 

	}

}
