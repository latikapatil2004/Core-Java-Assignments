/*Q11. Find Highest Salary
Question
Create an employee Map containing names and salaries. Find and display the employee having the highest salary.
Explanation
Iterate through the Map and keep track of the maximum salary and corresponding employee.
Input
Rahul = 45000
Amit = 72000
Priya = 68000
Neha = 85000
Output
Highest Salary Employee = Neha
Salary = 85000*/


import java.util.*;
class MapQs5
{
	public static void main(String[]args)
	{
		HashMap<String,Long> map=new HashMap<>();
		map.put("Laptop" ,45000L);
        map.put("Mobile",60000L);
        map.put("Tablet", 75000L);
		long max=0;
		String employee="";
       for(Map.Entry<String,Long>entry : map.entrySet())
	   {
		   if(entry.getValue()>max)
		   {
			   max=entry.getValue();
			   employee=entry.getKey();
			  
		   }
	   }
		   System.out.println("Highest Salary Employee = "+employee);
		   System.out.println("salary" + max);
		   
	   }
	}

