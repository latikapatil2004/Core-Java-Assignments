class Employee
{
	int eid;
	String name;
	long no;
	Employee(int eid,String name,long no)
	{
		this.eid=eid;
		this.name=name;
		this.no=no;
		System.out.println("eid : " + eid);
		System.out.println("Name : " + name);
		System.out.println("Number :" + no);
	}
}
class Elevone
{

   public void main(String[]args)
   {
	   Employee e=new Employee(1,"Latika",605032);
	   Employee e2=new Employee(2,"sai",65032);
   }	
	   
   }
   