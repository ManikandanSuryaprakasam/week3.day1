package week3.day1;

public class StringAssignment7 {




	public static void main(String[] args) {
		//		Write a Java program to get the character at the given index within the String. 
		//		String text = Java Exercise 
		//		  Index for character E and s   ============================================================================		

		String text = "Java Exercise";
		System.out.println(text.indexOf('E'));
		System.out.println(text.indexOf('s'));
		System.out.println("-----------------");
	

	//	2.Write a Java program to compare a given string to another string, ignoring case considerations.
	//
	//	String 1="I am Learning Java" 
	//	String 2="I am learning java?   
	//	**  Explore with == operator
	//	**               equals
	//	**               equalsignorecase                                      
	//	=============================================================================

	String str1= "I am Learning Java" ;
	String str2= "I am learning java";  
	
	if(str1==str2)
		System.out.println("Using == both text are equal");
	else
		System.out.println("Using == both text are not equal");
	
	if(str1.equals(str2))
		System.out.println("Using equals both text are equal");
	else
		System.out.println("Using equals both text are not equal");
	
	if(str1.equalsIgnoreCase(str2))
		System.out.println("Using equalsIgnoreCase both text are equal");
	else
		System.out.println("Using equalsIgnoreCase both text are not equal");
	System.out.println("-----------------");
	
//	3.Write a Java program to replace a specified character with another character and add # to the given string.
//
//	String sentence = "I am working with Java8"
//	replace 8 to 11 
//	Print the characters from 5 to 14
	
	String sentence = "I am working with Java8";
	
	String sentence2 = sentence;
	//String index starts with 0 and also space is counted as index
	//Original variable is not modifed.
	
	String repSentence= sentence.replace("8", "11");
	System.out.println(repSentence);
	System.out.println("---------------------");
	String sub = sentence2.substring(5, 14);
	System.out.println(sub);
	System.out.println("---------------------");
	System.out.println(sentence);
	
			
	
	
	}	
	
	}





