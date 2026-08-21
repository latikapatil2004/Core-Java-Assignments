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
class MapQs8
{
	public static void main(String[]args)
	{
		String s="Java Programming Language";
		Map<Character,Integer>map=new TreeMap<>();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(map.containsKey(ch))
			{
				map.put(ch,map.get(ch)+1);
				
			}
			else 
			{
				map.put(ch,1);
			}
		}
		char max=0;
		char less=0;
		int maxFreq=0;
		int lessFreq=0;
		for(Map.Entry<Character,Integer>entry: map.entrySet())
		{
			if(entry.getValue()>maxFreq)
				
			{
				maxFreq=entry.getValue();
				max=entry.getKey();
			}
			else 
			{
				lessFreq=entry.getValue();
				less=entry.getKey();
			}
		}
			
			System.out.println( max+ " " +maxFreq);
			System.out.println( less+ " " +lessFreq);
			}
		}
	