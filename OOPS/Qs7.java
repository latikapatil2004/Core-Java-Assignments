/*Question 1 – Word Frequency from List
Statement:
Given a List<String> containing multiple sentences, use a Map to count the frequency of every word. Ignore case and punctuation. Display words in alphabetical order along with their frequency.
Explanation:
Convert each sentence into words. 
Remove punctuation and convert words to lowercase. 
Store each word as a key in Map. 
Increase its count whenever the word appears again. 
Finally, display the frequency map in alphabetical order. 
Input:
["Java is powerful", "Java is easy", "Python is powerful", "Java is popular"]
Output:
easy = 1
is = 4
java = 3
popular = 1
powerful = 2
python = 1*/


import java.util.*;
class Qs7
{
	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter string ");
		String s=sc.nextLine();
		List<String> list=new ArrayList<>();
		for(int i=0;i<=4;i++)
		{
			list.add(s);
	    }
		String words[]=s.split(" ");
		Map<String,Integer> map=new HashMap<>();
		for(int i=0;i<words.length;i++)
		{
			String str=words[i];
			if(map.containsKey(str))
			{
				map.put(str,map.get(str)+1);
			}
			else 
			{
				map.put(str,1);
		
	      }
		}
		for(Map.Entry<String,Integer> entry :map.entrySet())
		{
			System.out.println(entry.getKey() + "---->"+ entry.getValue());
		}
	}
	
	
}

