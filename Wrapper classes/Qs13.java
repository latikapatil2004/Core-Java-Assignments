/*6. Write a Java program to demonstrate Method Overriding where a child class provides its own
implementation of a method defined in the parent class.*/


class Laptop
{
	void work()
	{
		System.out.println("My laptop is windows");
	}
}
class Mobile extends Laptop{
	void work()
	{
		System.out.println("MObile woorks as android");
	}
}

class Qs13
{
	public static void main(String[]args)
	{
		Mobile m=new Mobile();
		m.work();
	}
}