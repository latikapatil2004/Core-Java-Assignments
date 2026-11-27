/*Assignment 15: Remove Employees Whose Salary Is Below 30,000
Description:
Create an Employee class containing employee ID, name, and salary. Generate a new employee list containing only employees whose salary is greater than or equal to 30,000.
Requirements:
Use filter().
Apply salary-based filtering.
Collect the eligible employees.
Input:
ID	Name	Salary
101	Amit	25000
102	Rahul	35000
103	Sneha	45000
104	Priya	20000
105	Vikas	50000
Expected Output:
ID	Name	Salary
102	Rahul	35000
103	Sneha	45000
105	Vikas	50000*/

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

class Employee {
    private int id;
    private String name;
    private int sal;

    Employee(int id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSal() {
        return sal;
    }
	    public String toString() {
        return "Employee [id=" + id +
               ", name=" + name +
               ", sal=" + sal + "]";
    }
}


class Qs52
{
	public static void main(String[]args)
	{
		
        List<Employee> al = new ArrayList<>();

        al.add(new Employee(101, "Amit", 45000));
        al.add(new Employee(102, "Rahul", 45000));
        al.add(new Employee(103, "Sneha", 45000));
        al.add(new Employee(104, "Priya", 45000));
		Stream<Employee>s=al.stream();
		Predicate<Employee> p = new Predicate<Employee>() {
    @Override
    public boolean test(Employee e) {
        return e.getSal() > 50000;
    }
};

   Stream<Employee> s1 = s.filter(p);

   List<Employee> list = s1.collect(Collectors.toList());

          System.out.println(list);
	}
}
