/*8.Sort Students Using Comparable
Create a Student class with:
9.rollNo
10.name
percentage
Implement Comparable<Student> to sort students based on percentage in descending order.*/


import java.util.*;
class Student implements Comparable<Student>
{
	private int rollNo;
	private String name;
	private double percentage;
	
	Student(int rollNo,String name,double percentage)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.percentage=percentage;
     }
	 
	 public int getRollNo()
	 {
		 return rollNo;
	 }
	   public String getName() {
        return name;
    }
	   public double getPercentage()
	   {
		   return percentage;
	   }
	   @Override
	 public int compareTo(Student s)
	 {
		 if(this.percentage>s.getPercentage())
		 {
			 return 1;
		 }
		 else if(this.percentage<s.getPercentage())
		 {
			 
			 return -1;
		 }
		 else 
		 {
			 return 0;
	 }
	 }
}
	 public class StudentApplication 
	 {
		 public static void main(String[]args)
		 {
			List<Student> al=new ArrayList<>();
			al.add(new Student(1,"Latika",80));
			al.add(new Student(2,"Sai",70));
			al.add(new Student(3,"Wija",40));
			al.add(new Student(4,"gaya",70));
			System.out.println("Data Before sorting ");
			for(Student s: al)
			{
				System.out.println(s.getRollNo() + "\t" + s.getName()+"\t"+ s.getPercentage());
			}
			Collections.sort(al);
			
			System.out.println("Data Before sorting ");
			for(Student s: al)
			{
				System.out.println(s.getRollNo() + "\t"
				+ s.getName()+"\t"+ s.getPercentage());
			}
			
			
		 }
	 }
	 
	 