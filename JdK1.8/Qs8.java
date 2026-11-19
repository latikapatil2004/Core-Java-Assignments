import java.util.*;
import java.util.function.Consumer;
class Employee{
	private int id;
	private String name;
	private int sal;
	Employee(int id,String name,int sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	void setID(int id)
	{
		this.id=id;
	}
	int getID()
	{
		return id;
	}
	void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return name;
	}
	void setSal(int sal)
	{
		this.sal=sal;
	}
	int getSal()
	{
		return sal;
	}
}

class Qs8
{
  public static void main(String[]args)
  {
	 List<Employee> al=new ArrayList<>();
	 al.add(new Employee(1,"sai",30000));
	 al.add(new Employee(2,"bhai",40000));
	 al.add(new Employee(3,"mai",50000));
	 al.add(new Employee(4,"tai",60000));
	 al.add(new Employee(5,"oai",70000));
	 
	 al.forEach((emp)->System.out.println(emp.getID()+"\t"+emp.getName()+ "\t"+emp.getSal()));
	 
  }
}