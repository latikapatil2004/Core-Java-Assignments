/*Question 6: Write a Java program to append data into an existing file.
Asked In Practice Assignment
Input:
Existing file contains:
Rahul 78
New data to append:
Amit 85

Output:
Data appended successfully.

Explanation:
Create FileWriter with filename and append parameter set to true. FileWriter(filename, true) opens file in append mode. When append is true, new data adds at file end without overwriting existing content. When false (default), file content is overwritten. Write new data using write() method. Close FileWriter to save appended data. Previous content is preserved.

*/
import java.io.*;
class Qs6
{
	public static void main(String[]args) throws IOException
	{
		
		FileWriter fw=new FileWriter("D:/File making/student.txt",true);
		fw.write("\nRaul 78");
		fw.close();
		System.out.println("Data added successfully");
	}
}

		
		