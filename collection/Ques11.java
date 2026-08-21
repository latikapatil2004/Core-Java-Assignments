/*Q11. Create a POJO class Student with fields:
id
name
marks
Store 5 students in a Vector and display students who scored more than 60 marks.
Description
Program should:
Create Student class with getters/setters
Store objects in Vector
Apply condition marks > 60
Display qualified students
Input
101 Rahul 55 
102 Amit 78 
103 Neha 88 
104 Pooja 45 
105 Kiran 67
Output
Students scoring above 60:

102 Amit 78
103 Neha 88
105 Kiran 67*/



import java.util.Scanner;
import java.util.Vector;

class Student {
	private int id;
	private String name;
	private int marks;
	Student(int id,String name,int marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
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

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}

public class Ques11 {

	public static void main(String[] args) {
		Vector <Student>v=new Vector<>();
		Scanner sc=new Scanner(System.in);
	
		for(int i=0;i<5;i++)
		{
		System.out.println("Enter the id : ");
		int id=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Name : ");
		String name=sc.nextLine();
		
		System.out.println("Enter the Marks : ");
		int marks=sc.nextInt();
		
			v.add(new Student(id,name,marks));
		}
		
			for(Student s:v)
			{
				if(s.getMarks()>60)
				{
					System.out.println(s.getId()+"\t"+ s.getName()+ "\t"+ s.getMarks());
				}
				
				}
			}
			
		}
		
	
