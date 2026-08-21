/*Q10. Question Statement
Write a Java program to store two arrays into two ArrayLists and display common elements.
Description
Store both arrays
Compare elements
Input
Array1: 1 2 3 4
Array2: 3 4 5 6
Output
Common Elements: [3, 4]*/




import java.util.*;
class Que10
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of Array");
		int n=sc.nextInt();
		System.out.println("enter array elements");
		int arr[]=new int[n];
		System.out.println("enter array elements");
		int arr1[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		ArrayList <Integer> al1=new ArrayList<>();
		ArrayList <Integer> al2=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			al1.add(arr[i]);
			
		}
		for(int i=0;i<n;i++)
		{
			al2.add(arr1[i]);
			
		}
		for(int i=0;i<al1.size();i++)
		{
			if(al1.get(i)==al2.get(i))
			{
				
		   System.out.println(al1.get(i));
			}
		
		}
	
	}
		
		 
	}
