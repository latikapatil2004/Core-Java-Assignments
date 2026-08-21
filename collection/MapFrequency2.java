/*Q4. Count Word Frequency
Question
Accept a sentence and count the frequency of each word using a HashMap.
Explanation
Split the sentence into words and maintain each word's count in the Map.
Input
java is easy and java is powerful
Output
java = 2
is = 2
easy = 1
and = 1
powerful = 1*/


import java.util.*;
class MapFrequency2
{ 
	public static void main(String[]args)
	{
		String str="java is easy and powerful java is OOP";
		String words[]=str.split(" ");
		HashMap<String,Integer>map=new HashMap<>();
		for(int i=0;i<words.length;i++)
		{
			if(map.containsKey(words[i]))
			{
				map.put(words[i],map.get(words[i])+1);
			}
			else 
			{
				map.put(words[i],1);
			}
		}
		for(Map.Entry<String,Integer> entry : map.entrySet())
		{
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
	}
}
