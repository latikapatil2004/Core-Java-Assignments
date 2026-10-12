/*Question 15: Write a Java program to handle exceptions while reading array elements.

Accept array size and elements. Handle exceptions if the user enters invalid datatype.
Asked In Practice Assignment
Input:
Enter size: 3
Enter elements: 10 A 30

Output:
Invalid input for array element

Explanation:
When reading array elements, NumberFormatException or InputMismatchException can occur if user enters non-numeric data. When user enters "A" instead of number, exception is caught and message informs about invalid input type expected.*/

import java.util.*;

class Qs15
{
 public static void main(String[]args)
 {
	 Scanner sc=new Scanner(System.in);
	 try
	 {
	 System.out.println("Enter the element");
	 int arr[]=new int[3];
	 for(int i=0;i<arr.length;i++)
	 {
		 arr[i]=sc.nextInt();
	 }
	 for(int i=0;i<arr.length;i++)
	 {
		 System.out.println(" " +arr[i]);
	 }
	 }
	 catch(Exception e)
	 {
		 System.out.println("Invalid input for array element");
	 }
 }
}

	 
		 
	 
	 