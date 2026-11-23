import java.util.*;
import java.util.function.*;
class Employee
{
	 private int id;
	 private String name;
	 private int sal;
	 Employee()
	 {
		 
	 }
	 Employee(int id ,String name,int sal )
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
class Qs16
{
	public static void main(String[]args)
	{
		List<Employee>al=new ArrayList<>();
		al.add(new Employee(1,"Sai",20000));
		al.add(new Employee(2,"Bai",30000));
		al.add(new Employee(3,"Mai",40000));
		al.add(new Employee(4,"Tai",50000));
		Predicate<Employee> p=new Predicate<>()
		{
			public boolean  test(Employee e)
			{
				return e.getSal()>30000;
			}
		};
		
		Consumer<Employee>c=new Consumer<>()
		{
			public void accept(Employee e)
			{
				if(p.test(e))
				{
				System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
			}
		}
		};
		al.forEach(c);
		
	
}
}