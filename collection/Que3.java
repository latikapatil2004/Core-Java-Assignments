/*Q3. Question Statement
Write a Java program to store array elements into an ArrayList and display them in reverse order.
Description
Store array in ArrayList
Traverse in reverse
Input
Array: 10 20 30 40
Output
Reversed List: [40, 30, 20, 10]*/

import java.util.*;
class Que3
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
	ArrayList <Integer> reverse=new ArrayList<>();
		for(int i=al.size()-1;i>=0;i--)
		{
			reverse.add(al.get(i));
			
		}
		System.out.println(reverse);
		 
	}

}
