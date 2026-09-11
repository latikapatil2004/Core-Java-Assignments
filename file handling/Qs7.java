/*Question 7: Write a Java program to check whether file exists or not.
Asked In Practice Assignment
Input:
Input filename:
student.txt

Output:
File exists
OR
File does not exist

Explanation:
Create File object with filename as parameter. Use exists() method which returns boolean value. Returns true if file exists at specified path, false if file does not exist. Also can use isFile() method to verify if path refers to actual file. Use if-else statement to display appropriate message based on existence check result.*/
import java.io.*;
class Qs7
{
	 public static void main(String[]args)throws IOException
	 {
		 File f=new File("D:\\File making");
		 File list[]=f.listFiles();
		 for(int i=0;i<list.length;i++)
		 {
			 if(list[i].isFile())
			 {
				 System.out.println(list[i]);
			 }
		 }
	 }
}