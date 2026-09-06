/*Question 3 – Character Frequency with Maximum and Minimum
Statement:
Given a string, use a Map<Character, Integer> to calculate the frequency of every character. Ignore spaces and case differences. Then find and display the character with the highest and lowest frequency.
Explanation:
Convert the string to lowercase. 
Ignore spaces. 
Store each character in a Map. 
Calculate frequency using the map. 
Find maximum and minimum frequency characters. 
Input:
"Java Programming Language"
Output:
Character Frequency:
a = 5
g = 4
r = 2
m = 2
j = 1
v = 1
p = 1
o = 1
i = 1
n = 2
l = 2
e = 1
u = 1

Highest Frequency:
a = 5

Lowest Frequency:
j = 1*/

import java.util.*;
class Qs18
{
	public static void main(String[]args)
	{
		Map<Character,Integer>map=new HashMap<>();
		String s ="Java Programming Language";
		String str="";
		int highest=0;
		char high=0;
		int lowest=0;
		char low=0;
		for(int i=0;i<s.length();i++)
		{
			str=str+s.charAt(i);
		}
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(map.containsKey(ch))
			{
				map.put(ch,map.get(ch)+1);
			}
			else
			{
			  map.put(ch,1);
			}
		}
		for(Map.Entry<Character,Integer>entry:map.entrySet())
		{ 			
		if(entry.getValue()>highest)
		{
			high=entry.getKey();
			highest=entry.getValue();
		}
		
		
		}
		
		
		System.out.println( high +"="+ highest);
		for(Map.Entry<Character,Integer>entry:map.entrySet())
		{ 	
		if(entry.getValue()<lowest)
		{
			low=entry.getKey();
			lowest=entry.getValue();
		}
		}
		System.out.println( low +"="+ lowest);
	}
}
