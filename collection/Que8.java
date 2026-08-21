/*Q8. Question Statement
Write a Java program to store strings in an ArrayList and count how many strings are palindrome.
Description
Check string reverse
Compare original and reverse
Input
["madam", "hello", "level", "java"]
Output
Palindrome Count: 2*/


import java.util.*;
class Que8
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList <String> al=new ArrayList<>();
		al.add("madam");
		al.add("hello");
		al.add("level");
		al.add("java");
		
		int  count=0;
		for(int i=0;i<al.size();i++)
		{
			String name=al.get(i);
			String rev="";
			for(int j=name.length()-1;j>=0;j--)
			{
				rev+=name.charAt(j);
			}
			if(name.equals(rev))
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
