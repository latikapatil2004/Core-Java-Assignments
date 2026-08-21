/*Q4. Question Statement
Write a Java program to store integer array elements in an ArrayList and find the maximum element.
Description
Store elements
Compare and find max
Input
Array: 5 8 2 10 3
Output
Maximum: 10*/
import java.util.*;
class Que4
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
		int max=al.get(0);
		System.out.println("Maximum : ");
		for(int i=1;i<al.size();i++)
		{
		  if(al.get(i)>max)
		  {
			  max=al.get(i);
		}
		}
	
		System.out.println(max);
		 
	}

}