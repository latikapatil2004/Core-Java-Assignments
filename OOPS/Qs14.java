/*7. Write a Java program to demonstrate Multiple Inheritance using Interfaces. Create two interfaces
Printable and Showable and implement both in a single class.*/

interface Showable{
	void show();
}
interface Printable{
	void print();
}

class User implements Showable,Printable
{
	public void show()
	{
		System.out.println("i will show my docx");
	}
	public void print()
	{
		System.out.println("Printend docx");
	}
}
class Qs14
{
	public static void main(String[]args)
	{
		User u=new User();
		u.show();
		u.print();
	}
}