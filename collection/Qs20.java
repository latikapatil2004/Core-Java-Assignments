/*Q1. Find longest and shortest string

Input:

ArrayList<String> list = new ArrayList<>(
    Arrays.asList("Java", "Python", "SQL", "Developer", "AI")
);

Output:

Longest = Developer
Shortest = AI*/

import java.util.*;
class Qs20
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of string");
		int n=sc.nextInt();
		sc.nextLine();
		
		ArrayList<String>name=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			name.add(sc.nextLine());
		}
		String longest="";
		String lowest=name.get(0);
		for(int i=0;i<name.size();i++)
		{
		if(name.get(i).length()>longest.length())
		{
			longest=name.get(i);
		}
		else if(name.get(i).length()<lowest.length())
		{
			longest=name.get(i);
		}
		}
	
		System.out.println("Longest : "+ longest);
		System.out.println("Lowest : "+ lowest);
	}
	
}

			