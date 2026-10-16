/*Question 1: Write a Java program to create a file student.txt and store student name and marks into it.
Asked In Practice Assignment
Input:
Enter student name: Rahul
Enter marks: 78

Output:
File created successfully.
Data written successfully.

Explanation:
Create file using FileWriter class with filename student.txt. Accept student name and marks from user using Scanner. Write name and marks to file using write() method separated by space. Close FileWriter properly using close() method to save data. FileWriter automatically creates new file if not exists and overwrites if already exists. Proper file closure ensures no data loss.*/
import java.io.*;
import java.util.*;
class Qs1
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
	
		try
		{
		
		File f =new File("D:\\Java\\xyz.txt");
		
		
		if(f.createNewFile())
		{
			System.out.println("Create file succesfully");
		}
		else 
		{
			System.out.println("file already exists");
		}
		System.out.println("Enter the Name : ");
		String name =sc.nextLine();
		System.out.println("Enter Marks: ");
		int marks=sc.nextInt();
		FileWriter fe=new FileWriter(f);
		fe.write(name + " " + marks);
		
		fe.close();
		System.out.println("Data added succesfully");
		
		}
		catch(Exception e)
		{
			System.out.println("Exception : "+ e);
		
	}
}
}
		