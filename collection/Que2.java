/*Q2. Question Statement
  Write a Java program to store strings in an ArrayList and count how many strings have length greater than 5.
  Description
  Store strings in ArrayList
  Check string length
  Count based on condition
  Input
  ["Apple", "Banana", "Kiwi", "Orange", "Mango"]
  Output
  Count: 2*/
  import java.util.*;
class Que2
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
	    int  scount=0;
		System.out.println("enter array elements");
		String words[]=new String[5];
		int n=words.length;
		for(int i=0;i<n;i++)
		{
			words[i]=sc.nextLine();
		}
		ArrayList <String> al=new ArrayList<>();
		
		for(int i=0;i<n;i++)
		{
			al.add(words[i]);
			
			if(al.get(i).length()>5)
			{
				scount++;
			}
		}
		System.out.println(scount);
}
	}

