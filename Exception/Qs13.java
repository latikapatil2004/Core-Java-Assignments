/*Question 13: Write a Java program to use throws keyword.

Create a method that performs division and declares exceptions using throws keyword. Handle it in the main method.
Asked In Practice Assignment
Input:
Enter number1: 25
Enter number2: 0

Output:
Exception handled in main method

Explanation:
Throws keyword in method signature declares that method may throw exceptions.

 When called method throws exception due to division by zero, calling method (main) catches and handles it. 
 This defers exception handling to calling method*/
																			

import java.util.*;
 class Main
 {
	  static int main(int num1,int num2) throws ArithmeticException
	  {
		  return num1/num2;
	  }
 }
class Qs13
{
  public static void main(String[]args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number1");
	  int number=sc.nextInt();
	    System.out.println("Enter the number2");
		int number2=sc.nextInt();
		try
		{
			int division=Main.main(number,number2);
			System.out.println("Division" + division);
		}
		catch(Exception e)
		{
			System.out.println("Exception handle in main method");
		}
  }
}
 
 
			
																			
																																																																																																																										