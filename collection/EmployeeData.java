/*7.Sort Employees Using Comparator
Create an Employee class and use Comparator to sort employees based on name alphabetically, without modifying the Employee class. 
8.Multiple Comparators
Create an Employee class containing id, name, age, and salary. Write separate Comparators to sort employees by: 
oSalary 
oAge 
oName */
import java.util.*;
class Employee
{
	 private int id;
	private double salary;
	private int age;
	private String name;
	Employee(int id,double salary,int age,String name)
	{
		this.id=id;
		this.salary=salary;
		this.age=age;
		this.name=name;
    }
	public int getId()
	{
		return id;
	}
	public double getSalary()
	{
		return salary;
	}
	public int getAge()
	{
		return age;
	}
	public String getName()
	{
		return name;
	}
	
}
 class SortBySalary implements Comparator <Employee>

{
	public int compare(Employee e1,Employee e2)
	{
	  if(e1.getSalary()>e2.getSalary())
	  {
		  return 1;
	  }
	  else if(e1.getSalary()<e2.getSalary())
	  {
		  return -1;
	  }
	  else 
	  {
		  return 0;
		  
	}
	}
}
 class SortByAge implements Comparator <Employee>
{
	public int compare(Employee e1,Employee e2)
	{
	  if(e1.getAge()>e2.getAge())
	  {
		  return 1;
	  }
	  else if(e1.getAge()<e2.getAge())
	  {
		  return -1;
	  }
	  else 
	  {
		  return 0;
		  
	}
	}
}
class SortByName implements Comparator <Employee>
{
	public int compare(Employee e1,Employee e2)
	{
	  return e1.getName().compareTo(e2.getName());
	}
	}


class EmployeeData
{
	public static void main(String[]args)
	{
		List<Employee> al=new ArrayList<>();
		al.add(new Employee(1,200000,21,"Latika"));
		al.add(new Employee(3,700000,22,"traaru"));
		al.add(new Employee(2,1000,29,"Naman"));
		al.add(new Employee(6,700000,26,"qwrr"));
		al.add(new Employee(4,20000,23,"Lawdya"));
		System.out.println("Show Employee Data --------------");
		for(Employee e : al)
		{
			System.out.println(e.getId()+"\t" + e.getSalary() + "\t" + e.getAge() +"\t" + e.getName());
		}
		
		System.out.println("Sort employee data by salary");
		Comparator<Employee> c = new SortBySalary();
		Collections.sort(al,c);
		for(Employee e : al)
		{
			 System.out.printf("%-8d %-15.1f %-8d %-10s%n",
                          e.getId(),
                          e.getSalary(),
                          e.getAge(),
                          e.getName());
		}
		
		System.out.println("Sort employee data by Age");
		c= new SortByAge();
		Collections.sort(al,c);
		for(Employee e : al)
		{
			 System.out.printf("%-8d %-15.1f %-8d %-10s%n",
                          e.getId(),
                          e.getSalary(),
                          e.getAge(),
                          e.getName());
		}
		
		System.out.println("Sort employee data by Name");
		c=new SortByName();
		Collections.sort(al,c);
		for(Employee e : al)
		{
			 System.out.printf("%-8d %-15.1f %-8d %-10s%n",
                          e.getId(),
                          e.getSalary(),
                          e.getAge(),
                          e.getName());
		}
		
	}
	
	
}
