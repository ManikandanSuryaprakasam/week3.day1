package week3.day1;

public class MyName {

	public static void main(String[] args) {
		
//		Assignment 4:
//		==============
	//
//		      Class: Students
//		      Methods: getStudentInfo()
	//
//		Description: 
//		Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber


		
		Student me = new Student();
		me.getStudentInfo(122456);
		me.getStudentInfo(122456, "Manikandan");
		me.getStudentInfo("mani.suryaprakash@gmail.com", 122456);

		
		
		

	}

}
