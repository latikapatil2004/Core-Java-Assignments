/*Q9. Question Statement
Write a Java program to store integer array elements into an ArrayList and replace all odd numbers with 0.
Description
Traverse list
Replace odd numbers
Input
Array: 1 2 3 4 5
Output
Updated List: [0, 2, 0, 4, 0]*/


import java.util.*;
class Que9
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
		
		for(int i=0;i<n;i++)
		{
			al.add(arr[i]);
			
		}
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i)%2!=0)
			{
				al.set(i,0);
			}
		
		}
		System.out.println(al);
	
	}
		
		 
	}
