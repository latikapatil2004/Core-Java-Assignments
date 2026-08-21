/*Q6. Question Statement
Write a Java program to store integer array elements in an ArrayList and calculate the sum of all elements.
Description
Store elements
Add all values
Input
Array: 2 4 6 8
Output
Sum: 20*/

import java.util.*;
class Que6
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of Array");
		int n=sc.nextInt();
		System.out.println("enter array elements");
		int arr[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		ArrayList <Integer> al=new ArrayList<>();
		
		for(int i=0;i<n;i++)
		{
			al.add(arr[i]);
			sum+=al.get(i);
		}
		
		System.out.println("Sum : "+sum);
		
		}
	
		
		 
	}

