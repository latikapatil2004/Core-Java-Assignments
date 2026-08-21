/*/*1. Store and Display Student Marks
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
Priya = 9*/

 import java.util.*;
  class Student
  {
	  public static void main(String[]args)
	  {
		  HashMap<String,Integer> map=new HashMap<>();
		  map.put("latika ", 85);
		  map.put("Amit  ", 72);
		  map.put("Priya  ", 91);
		  for(Map.Entry<String,Integer>entry:map.entrySet())
		  {
			  System.out.println(entry.getKey() +"---->" + entry.getValue());
	  }
  }
  }