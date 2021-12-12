package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		//char[] temp = test.replaceAll(" ", "").toCharArray();
		String[] temp = test.split(" ");
		String newtemp ="";
		int lenArr = temp.length;
		int t =0;
		String chtemp = "";
		System.out.println("Even text reverse in sentence:");
		
		for (int i = 0; i < lenArr; i++) {
			//System.out.println(i);
			//System.out.println(temp[i]);
			t = (i+1)%2;
			if(t == 0)
			{
				
			 newtemp = temp[i];
			 for (int j = newtemp.length()-1; j >=0; j--) {
				 chtemp = chtemp + newtemp.charAt(j);
				 				
			}
			 System.out.print(" "+chtemp);
			 
			}
			else
			{
				System.out.print(" "+temp[i]);
			}
			
		}
		

	}

}
