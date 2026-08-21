 import java.util.*;
 class Employee{
	 private int id;
	 private String name;
	 private long salary;
	 Employee()
	 {
		 
	 }
	 Employee(int id,String name,long salary)
	 {
		 this.id=id;
		 this.name=name;
		 this.salary=salary;
	 }
	 public void setId(int id)
	 {
		 this.id=id;
	 }
	 
	 public void setName(String name)
	 {
		 this.name=name;
	 }
	 
	 
	 public void setSalary(long salary)
	 {
		 this.salary=salary;
	 }
	 
	 
	 public int getId()
	 {
		 return id;
	 }
	 public String getName()
	 {
		 return name;
	 }
	 public long getSalary()
	 {
		 return salary;
	 }
 }
class EmployeeApplication
{
	public static void main(String[]args)
	{
		
		Vector v=new Vector();
		
		Employee e=new Employee();
		e.setId(1);
		e.setName("ABC");
		e.setSalary(12334);
		
		Employee e1=new Employee();
		e1.setId(2);
		e1.setName("MON");
		e1.setSalary(1120);
		
		v.add(e);
		v.add(e1);
		
		for(Object obj: v)
		{
			Employee e2=(Employee)obj;
			System.out.println(e2.getId() + "\t" +e2.getName() +"\t" +  e2.getSalary());
		}
	}
}