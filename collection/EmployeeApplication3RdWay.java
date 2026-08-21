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
class EmployeeApplication3RdWay
{
	public static void main(String[]args)
	{
		
		Vector v=new Vector();
		v.add(new Employee(2,"LATIKA",1200000));
		v.add(new Employee(2,"VAIBHAV",1200000));
		
		System.out.println("Display Employee Data : ");
		
		System.out.println("ID" +"\t"+"NAME" +"\t"+"SALARY" +"\t");
		for(Object obj: v)
		{
			Employee e2=(Employee)obj;
			
			System.out.println(e2.getId() + "\t" +e2.getName() +"\t" +  e2.getSalary());
		}
	}
}