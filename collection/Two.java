/*Q2. Search Student Marks
Question
Create a Map containing student names and marks. Accept a student name and display the marks if the student exists.
Explanation
Use containsKey() or get() to search for a particular student.
Input
Map:
Rahul = 85
Amit = 72
Priya = 91

Search: Priya
Output
Priya's Marks = 91*/


import java.util.*;
class Two 
{
	public static void main(String[]args)
	{
		Map<String,Integer>map=new HashMap<>();
		map.put("Rahul",4905);
		map.put("Amit",7905);
		map.put("Mehul",50090);
		for(Map.Entry<String,Integer>entry:map.entrySet())
		{
			if(entry.getValue()>5000)
			{
				
		System.out.println(entry.getKey() + " " +entry.getValue());
	}
}
	}
}