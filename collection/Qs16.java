 /*Q16.Create Customer class: ● id ● name ● age 
 Store customers in Vector and display customers eligible for voting (age ≥18).
 Description Logical condition:
 age >= 18 
 Input 1 Ravi 17 
 2 Meena 22
 3 Arjun 19 
 4 Tina 15 
 Output Eligible customers:  2 Meena 22 3 Arjun 19 */



import java.util.*;
class Customer
{
	 private int id;
	 private String name;
	 private int age;
	 Customer()
	 {
		 
	 }
	 Customer(int id,String name,int age)
	 {
		 this.id=id;
		 this.name=name;
		 this.age=age;
	 }
	 public int getId() {
		 return id;
	 }
	 public void setId(int id) {
		 this.id = id;
	 }
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public int getAge() {
		 return age;
	 }
	 public void setAge(int age) {
		 this.age = age;
	 }
	 
}
class Qs16

{
	public static void main(String[]args)
	{
		Vector v=new Vector();
		v.add(new Customer(1,"Sai",19));
		v.add(new Customer(2,"Mai",13));
		v.add(new Customer(3,"Tai",33));
		v.add(new Customer(4,"Bai",22));

		for(Object obj:v)
		{
			Customer c=(Customer)obj;
			if(c.getAge()>=18)
			{
			System.out.println(c.getId()+"\t" +c.getName() + "\t" +c.getAge());
			}
			
		}
		
		
	}
}