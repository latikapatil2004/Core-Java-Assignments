/*Question 53: You are given a large integer represented as an integer
 array digits, where each digits[i] is the ith digit of the integer.
 The digits are ordered from most significant to least significant 
 in left-to-right order. The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits.
Example 1:
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].

Example 2:
Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.*/

import java.util.Scanner;
 class AddDigit
 {
	 public static void main(String[]args)
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the size");
		 int  size=sc.nextInt();
		 int a[]=new int[size];
		 System.out.println("enter the array element");
		 for(int i=0;i<a.length;i++)
		 {
			 a[i]=sc.nextInt();
		 }
		
		 for(int i=0;i<a.length;i++)
		 {
			 if(i==a.length-1)
			 {
				 a[a.length-1]=a[i]+1;
			 } 
		 }
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.print(a[i]);
		 }
	 }
 }
 
		 