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
  class MappQs2
  {
	  public static void main(String[]args)
	  {
		  HashMap<String,Integer> map=new HashMap<>();
		  map.put("latika", 85);
		  map.put("Amit", 72);
		  map.put("Priya", 91);
		  
		  for(Map.Entry<String,Integer>entry:map.entrySet())
		  {
			  if(entry.getKey().equals("Priya"))
			  {
				System.out.println("Priyas Marks" + entry.getValue());  
			  }
			  
	  }
  }
  }