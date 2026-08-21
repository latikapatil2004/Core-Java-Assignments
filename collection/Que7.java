/*Q7. Question Statement
Write a Java program to store integer array elements into an ArrayList and remove all negative numbers.
Description
Store values
Remove negatives using condition
Input
Array: -1 2 -3 4 5
Output
Updated List: [2, 4, 5]*/


import java.util.*;
class Que7
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
			
		}
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i)<0)
			{
				al.remove(i);
		     i--;
		
			}
		
		}
		System.out.println(al);
	
	}
		
		 
	}

