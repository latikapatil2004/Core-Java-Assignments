class Employee
{
	private int id;
	private String name;
	private int sal;
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
	public void SetName(String name)
	{
		this.name=name;
		
	}
	public String getName()
	{
		return name;
	}
	public void SetSal(int sal)
	{
		return sal;
	}
}
class Qs32
{
	public static void main(String[]args)
	{
		List<Employee>al=new ArrayList<>();
		al.add(new Employee(1,"sai",90000));
		al.add(new Employee(2,"mai",20000));
		al.add(new Employee(3,"tai",50000));
		al.add(new Employee(4,"aai",80000));
		al.add(new Employee(5,"bhai",70000));
		
	}
}