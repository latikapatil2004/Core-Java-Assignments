/*Q22. Character with Maximum Frequency
Question
Accept a String and find the character that occurs the maximum number of times.
Explanation
Create a frequency Map and track the character having the highest frequency.
Input
mississippi
Output
Maximum Frequency Character = i
Frequency = 4*/


import java.util.*;
class MapQs7 

{
	public static void main(String[]args)
	{
		HashMap<Character,Integer> map=new HashMap<>();
		String str="mississippi";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(map.containsKey(ch))
			{
				map.put(ch,(map.get(ch)+1));
				
				
			}
			else 
			{
				map.put(ch,1);
			}
		}
		 char max=' ';
		int freq=Integer.MIN_VALUE;
		for(Map.Entry<Character,Integer>entry : map.entrySet())
		{
			if(entry.getValue()>freq)
			{
				freq=entry.getValue();
				max=entry.getKey();
			}
			
		}
		System.out.println("Maximum occuring chareacter : "+max );
		System.out.println("Maximum frequency chareacter : "+freq );
	}
}

			
			
		