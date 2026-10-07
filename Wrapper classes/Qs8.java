/*1. Write a Java program to demonstrate Encapsulation by creating a Student class with private data
members name and age, and public getter and setter methods*/



class Student
{
	private String name;
	private int age;
	public void setName(String name){
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
}

class Qs8
{
	public static void main(String[]args)
	{
		Student ss=new Student();
		ss.setName("Artu");
		ss.setAge(23);
		System.out.println("Name:"+ss.getName()+"\n"+"Age:"+ss.getAge());
	
	}
}