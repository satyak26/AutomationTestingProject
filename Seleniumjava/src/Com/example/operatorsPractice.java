package Com.example;

public class operatorsPractice 
{
	public static void main(String[] args) 
	{
     int i = 10;
     int j = 20;
     System.out.println("Arthimatic Operators are ");    
     System.out.println(i+j);
     System.out.println(j-i);
     System.out.println(i*j);
     System.out.println(j/i);
     System.out.println(j%i);
     System.out.println("********************* "); 
     System.out.println("Uninary Operators are "); 
     System.out.println(i);
     System.out.println(++i);
     System.out.println(i++);
     System.out.println(i);
     System.out.println(j);
     System.out.println(--j);
     System.out.println(j--);
     System.out.println(j);
     System.out.println("********************* "); 
     System.out.println("Relational Operators are "); 
     System.out.println(i==j);
     System.out.println(i!=j);
     System.out.println(i<j);
     System.out.println(i<=j);
     System.out.println(i>j);
     System.out.println(i>=j);
     System.out.println("********************* "); 
     System.out.println("Logical Operators are "); 
     System.out.println(true && true);
     System.out.println(true && false);
     System.out.println(false && true);
     System.out.println(false && false);
     System.out.println(true || true);
     System.out.println(true || false);
     System.out.println(false || true);
     System.out.println(false || false);
     System.out.println(!true);
     System.out.println(!false);
     System.out.println("********************* "); 
     System.out.println("Logical Operators are with vlaue check "); 
     System.out.println(i<j && i!=j);
     System.out.println(i<j || i!=j);
     System.out.println(i<j && i==j);
     System.out.println(i<j || i==j);  
     System.out.println("********************* "); 
     System.out.println("Conditional Operators are "); 
     String s=(i>j)?"Greater":"Smaller";
     System.out.println(s);
     int p=(i<j)?6:9;
     System.out.println(p);
     System.out.println("********************* "); 
     System.out.println("Assignment Operators are "); 
     System.out.println(i);
	   int a= i+=5;
	   System.out.println(a);
	   int b= i-=5;
	   System.out.println(b);
	   int c= i*=5;
	   System.out.println(c);
	   int d= i/=5;
	   System.out.println(d);
	   int e= i%=5;
	   System.out.println(e);
   	}
}
