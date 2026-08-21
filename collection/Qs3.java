/*Example of Vector using Vector(int initialCapacity,int capacityIncrement)
*/


import java.util.*;
class Qs3
{
	public static void main(String[]args)
	{
		Vector v=new Vector(4,2);
		System.out.println("Initial Capasity of vector : "+ v.capacity());
		v.add(10);
		v.add(20);
		v.add(3);
		v.add(4);
		v.add(90);
		v.add(8);
		v.add(30);
		v.add(50);
		v.add(30);
		v.add(50);
	
		System.out.println("Vector size"  + v.size());
			System.out.println("After Capasity increemtt : "+v.capacity());
	
		
		
	}
}
