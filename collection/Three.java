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
class Three
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
	
		Map<Integer,String>map=new HashMap<>();
		map.put(10000,"Delhi");
		map.put(20000,"tokyo");
		map.put(35000,"Paris");
		int max=0;
		String employee="";
		for(Map.Entry<Integer,String>entry :map.entrySet())
		{
			if(entry.getKey()<max)
			{
				max=entry.getKey();
				employee=entry.getValue();
			}
		}
		System.out.println("Max " + max);
		System.out.println("max salaries person " + employee);
		}
		
	}


			
		
 