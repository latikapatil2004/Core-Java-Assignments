/*4. Write a Java program to demonstrate the use of an Interface. Create an interface Vehicle with a
method start() and implement it in a Car class.*

*/



interface Vehicle{
	void start();
}
class Car implements Vehicle
{
	public void start()
	{
		System.out.println("Car start");
	}
}
class Qs11
{
	public static void main(String[]arg)
	{
		Vehicle v=new Car();
		v.start();
	}
}
