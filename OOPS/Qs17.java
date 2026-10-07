/*0. Write a Java program to demonstrate the use of the super keyword. Create a parent class with a
variable and method, and access both from the child class using super.*/


class Parent
{
	int x=10;
	
	void add()
	{
		
		System.out.println("Parent method");
	}
	
}

class child extends Parent
{
	int x=20;
  void display()
  {
	 System.out.println(""+super.x); 
	 super.add();
  }	  
	
}
class Qs17
{
	public static void main(String[]args)
	{
		child c=new child();
		c.display();
	}
	
}