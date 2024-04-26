package Com.example;

import java.util.Scanner;

public class userInput
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Hi,\nWhat is Your name?");
		String name = scan.nextLine();
		System.out.printf("Hey, %s How are you? \n ",name);
		String status =  scan.nextLine();
		System.out.println("Ok, What is your age?");
		int age = scan.nextInt();
		System.out.println("Good, Can you please share your height?");		
		float height = scan.nextFloat();
		System.out.println("Alright,What is your gross income?");	
		Double Salary = scan.nextDouble();
		System.out.println("Thank you for share valuable information");		
		scan.close();
	}
}
