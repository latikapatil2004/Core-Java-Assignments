/*Q5. Store Employee Salary
Question
Create a Map containing employee names and salaries. Display all employees whose salary is greater than 50,000.
Explanation
Iterate through entrySet() and apply a condition on the Map value.
Input
Rahul 45000
Amit 60000
Priya 75000
Neha 48000
Output
Amit = 60000
Priya = 75000*/


import java.util.*;
class MapQs4
{
	public static void main(String[]args)
	{
		HashMap<String,Long> map=new HashMap<>();
		map.put("Rahul" ,45000L);
        map.put("Amit",60000L);
        map.put("Priya", 75000L);
        map.put("Neha", 48000L);
		for(Map.Entry<String,Long>entry:map.entrySet())
		{
			if(entry.getValue()>50000)
			{
				System.out.println(entry.getKey() +" : "+entry.getValue());
			}
		}
	}
}
	
                                