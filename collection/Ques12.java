/*Q12.Create an Employee POJO class with:
id
name
salary
Store employees in Vector and display employees having salary greater than 25000.
Description
Logical operation:
if(salary > 25000)
Input
1 Raj 20000
2 Simran 30000
3 Ajay 27000
4 Ramesh 18000
Output
Employees with salary above 25000:

2 Simran 30000
3 Ajay 27000*/

import java.util.*;
class Employee
{
	int id;
	String name;
	long salary;
	Employee(int id,String name,long salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public  void setId(int id)
	{
		this.id=id;	
	}
	public int getId()
	{
		return id;
	}
	public  void setName(String name)
	{
		this.name=name;	
	}
	public String getName()
	{
		return name;
	}
	public  void setSalary(long salary)
	{
		this.salary=salary;	
	}
	public long getsalary()
	{
		return salary;
	}

}

class Ques12
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		Vector<Employee>v=new Vector<>();
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the id : ");
		int id=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Name : ");
		String name=sc.nextLine();
		
		System.out.println("Enter the Salary : ");
		long salary =sc.nextLong();
		v.add(new Employee(id,name,salary));
		
		
		}
		for(Employee e:v)
		{
			if(e.getsalary()>25000)
			{
				System.out.println(e.getId()+"\t"+ e.getName()+ "\t"+ e.getsalary());
			}
		}
		
	}
}