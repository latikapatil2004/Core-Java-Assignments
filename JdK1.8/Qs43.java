import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.Comparator;
class Employee
{
	private int id;
	private String name;
	private int sal;
	Employee()
	{
	}
	Employee(int id,String name,int sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setSal(int sal)
	{
		this.sal=sal;
	}
	public int getSal()
	{
		return sal;
	}
	
}
class Qs42
{
	public static void main(String[]args)
	{
		List<Employee>al=new ArrayList<>();
		al.add(new Employee(101,"Amit",45000));
		al.add(new Employee(102,"Rahul",45000));
		al.add(new Employee(103,"Sneha",45000));
		al.add(new Employee(104,"Priya",45000));
		Stream<Employee>s=al.stream();
	
		Stream<Employee>s2=s.sorted(Comparator.comparing(Employee::getSal);
		List<Employee>list=s2.collect(Collectors.toList());
		System.out.println(list);
	}
}