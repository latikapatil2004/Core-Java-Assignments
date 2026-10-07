/*5. Write a Java program using an Abstract class. Create an abstract class Shape with an abstract
method area(), and implement it in a Circle class.*/






abstract class Shape{
abstract void area();
}

class Circle extends Shape{
	void area()
	{
		System.out.println("Circle area is clalculating");
	}
}
class Qs12
{
	public static void main(String[]args)
	{
		Shape s=new Circle();
         s.area();		
	}
}
