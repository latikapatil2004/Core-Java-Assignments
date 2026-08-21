/*/*Q1.Question Statement
Write a Java program to accept an integer array from the user, store only even numbers into an ArrayList, and display the elements.
Description
Read array elements
Check each number
Store even numbers in ArrayList
Input
Array: 1 2 3 4 5 6
Output
Even Numbers: [2, 4, 6]*/

import java.util.*;
class Que1
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of Array");
		int n=sc.nextInt();
		System.out.println("enter array elements");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		ArrayList <Integer> al=new ArrayList<>();
		System.out.println("Even No : ");
		for(int i=0;i<n;i++)
		{
			al.add(arr[i]);
			if(al.get(i)%2==0)
			{
				System.out.println(al.get(i));
		}
}
	}
}
