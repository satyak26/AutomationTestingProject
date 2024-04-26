package Com.example;

import java.util.Scanner;

public class Nestedifusingscanner 
{
	public static void main(String[] args) 
		{
		Scanner result = new Scanner(System.in);
		 System.out.println("What is your Interview exam status");
      String examStatus = result.nextLine();
//		 String examStatus = "pass";
		  if (examStatus.equals("pass")) 
		  {
				 System.out.println(examStatus+" for Technical round interview");
				 String round1Status = result.nextLine();
			  if (round1Status.equals("pass")) 
			 {
					 System.out.println(round1Status+" for Hr round interview");
					 String hrRoundStatus = result.nextLine();	
					 if (hrRoundStatus.equals("pass")) 
					 {
						 System.out.println(hrRoundStatus+" for job confirmation");
					 }
					 else
					 {
						 System.out.println("Hr Interview has been rejected"); 
					 }	
				 }
				 
				 else
				 {
					 System.out.println("Technical Interview has been rejected"); 
				 }		 
		  }
		  else{
			 System.out.println(examStatus+" in Technical examination"); 
		 }
			 result.close();
		}
}

