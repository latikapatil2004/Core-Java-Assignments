/*Question 10: Write a Java program to demonstrate nested try blocks.

Create nested try blocks where the inner block handles ArithmeticException and outer handles ArrayIndexOutOfBoundsException.
Asked In Practice Assignment
Input:
Enter number: 10
Enter divisor: 0

Output:
Inner exception handled

Explanation:
Nested try blocks allow handling different exceptions at different levels. Inner try block catches ArithmeticException when divisor is zero. Outer try block can catch ArrayIndexOutOfBoundsException if it occurs. This hierarchical exception handling provides fine-grained control.*/

import java.util.*;
class Qs10
{
  public static void main(String[]args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter number");
	  int number=sc.nextInt();
	  System.out.println("Enter divisor");
	  int divisor=sc.nextInt();
	  try{
		 int result=number/divisor;
		 if(divisor==0)
		 {
			 throw new Exception("Inner exception handled");
        
	  }
	  }
	  
       catch(Exception e)
	   {
          System.out.println(e.getMessage());
	   }
  }
}  