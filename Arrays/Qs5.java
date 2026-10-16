/*uestion 5: Write a Java program to count total lines in a file.
Asked In Practice Assignment
Input:
File content:
Java
Python
C++

Output:
Total lines = 3

Explanation:
Use BufferedReader to read file. Initialize line counter to zero. Loop continuously using readLine() method to read each line. Increment counter for each non-null line read. When readLine() returns null, end of file reached, stop loop. Display total line count. Each line terminated by newline character is counted as one line.*/


import java.io.*;
class Qs5
{
  public static void main(String[]args) throws IOException
  {
	  FileWriter fr= new FileWriter("D:/File making/proram.txt");
	  int count=0;
	  String s1="Java";
	   String s2="python";
	    String s3="c++";
	  fr.write(s1+"\n");
	   fr.write(s2 + "\n");
	    fr.write(s3);
		fr.close();
		FileReader ft=new FileReader("D:/File making/proram.txt");
		BufferedReader bf=new BufferedReader(ft);
		 String s;
		while((s=bf.readLine())!=null)
		{
			count++;
		}
		System.out.println("Count : " + count);
		bf.close();
  }
}
	  
	  