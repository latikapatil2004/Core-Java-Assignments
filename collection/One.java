/*1. Store and Display Student Marks
Question
Create a HashMap to store student names and their marks. Display all student names along with their marks.
Explanation
Use the student name as the key and marks as the value. Iterate through the Map using entrySet().
Input
Rahul 85
Amit 72
Priya 91
Output
Rahul = 85
Amit = 72
Priya = 91*/

import java.util.*;
class One
{
	public static void main(String[]args)
	{
		Map<String,Integer>map=new HashMap<>();
		map.put("rehul",85);
		map.put("Amit ",72);
		map.put("Priya ",91);
		map.put("rahul",90);
       for(Map.Entry<String,Integer>entry:map.entrySet())
	   {
            System.out.println(entry.getKey()+ " : "+entry.getValue());
	   }
	}
}
	