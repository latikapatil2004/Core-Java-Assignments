/*2. Write a Java program to demonstrate Inheritance using the extends keyword. Create a Parent class
with a method display() and a Child class that inherits and calls the method*/



class Animal
{
	void display()
	{
		System.out.println("Animal make sound");
    }
}
class Dog extends Animal{
	
}
class Qs9
{
	public static void main(String[]args)
	{
	
	  Dog a=new Dog();
		a.display();
	}
}