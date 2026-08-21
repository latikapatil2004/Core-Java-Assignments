/*Q5. Question Statement
Write a Java program to store string array elements into an ArrayList and display only names starting with a vowel.
Description
Check first character
Store vowel-based strings
Input
["Anil", "Sunil", "Om", "Ravi", "Umesh"]
Output
[Vowel Names]: [Anil, Om, Umesh]*/

import java.util.*;
class Que5
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter array elements");
		String words[]=new String[5];
		int n=words.length;
		for(int i=0;i<n;i++)
		{
			words[i]=sc.nextLine();
		}
		ArrayList <String> al=new ArrayList<>();
		System.out.println("[vovel names]");
		for(int i=0;i<n;i++)
		{
			al.add(words[i]);
			String names=al.get(i);
			char ch=names.charAt(0);
		
		 if(ch=='a'|| ch=='e'||ch=='i'|| ch=='o'||ch=='u')
			{
				System.out.print(words[i]);
			}
		}
		
}
}
