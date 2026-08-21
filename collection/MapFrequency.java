/*Q3. Count Character Frequency
Question
Write a Java program to count how many times each character occurs in a String using a HashMap.
Explanation
Store each character as a key and its occurrence count as the value.
Input
banana
Output
b = 1
a = 3
n = 2*/


import java.util.*;

class MapFrequency
{
	public static void main(String[]args)
	{
		HashMap<Character,Integer>map=new HashMap<>();
		String str="banana";
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
		
		for(Map.Entry<Character,Integer>entry : map.entrySet())
		{
			System.out.println(entry.getKey() +"--->" +entry.getValue());
        }
	}
}