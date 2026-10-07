/*3. Write a Java program to demonstrate Method Overriding and Runtime Polymorphism using a
parent class Animal and child classes Dog and Cat.
*/

class Animal
{
	void display()
	{
		System.out.println("Animal make sound");
    }
}
class Dog extends Animal{
	void display()
	{
		System.out.println("dog bark");
    }
}

class Cat extends Animal{
	void display()
	{
		System.out.println("Cat meow");
    }
}
	


class Qs10
{
	public static void main(String[]args)
	{
	Animal a;
	   a=new Dog();
		a.display();
		a=new Cat();
		a.display();
	}
}















