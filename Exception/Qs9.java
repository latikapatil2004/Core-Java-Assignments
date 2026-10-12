/*Question 9: Write a Java program to print custom error messages using catch blocks.

Accept age from users. If age is negative, throw exceptions and print proper messages.
Asked In Practice Assignment
Input:
Enter age: -5

Output:
Invalid age entered

Explanation:
Custom error messages in catch blocks provide clear information about what went wrong. When age is negative (-5), validation fails and exception is caught. Custom message "Invalid age entered" informs user about the specific problem instead of generic error.*/


import java.util.*;
class Qs9
{
	public static void main(String[]args)
	{
	     Scanner sc=new Scanner(System.in);
		 int age=sc.nextInt();
		
		try
		{
			if(age<0)
			{	
			throw new Exception("Invalid age entred");
			}
			System.out.println("Valid age " + age);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}