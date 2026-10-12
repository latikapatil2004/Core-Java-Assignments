/* Write a Java program that accepts two integers from the user and performs division. Handle
InputMismatchException, ArithmeticException, and other unexpected exceptions using separate catch
blocks. Use a finally block to print "Execution Completed". Demonstrate the execution order when invalid
input or division by zero occurs.*/


import java.util.*;
class Exception1
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
		try{
			System.out.print("enter number");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int division=a/b;
	      }
		  catch(InputMismatchException i){
			  System.out.println("Error "+ i);
		  }
		   catch(ArithmeticException a){
			  System.out.println("Error "+ a);
		  }
		   catch(Exception e){
			  System.out.println("Error "+ e);
		  }
		  finally{
			  System.out.print("i alwayss excute");
		  }
	}
}
