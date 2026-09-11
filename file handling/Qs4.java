/*Question 4: Write a Java program to count total words in a file.
Asked In Practice Assignment
Input:
File content:
Java is easy language

Output:
Total words = 4

Explanation:
Read entire file content as string using BufferedReader and StringBuilder. Split string using space delimiter with split method. Count number of elements in resulting string array which represents total words. Handle multiple consecutive spaces correctly using regex pattern. Alternatively use StringTokenizer to count words. Display total word count.*/


import java.io.*;
class Qs4
{
  public static void main(String[]args) throws IOException
  {
	  FileWriter fr= new FileWriter("D:/File making/student.txt");
	 
	  String s="java is easy Language";
	  fr.write(s);
	  fr.close();
	  FileReader fq=new FileReader("D:/File making/student.txt");
	   BufferedReader br=new BufferedReader(fq);
	   String s1 =br.readLine();
	   String words[]=s1.split(" ");
	   System.out.println("Total word "+ words.length);
	  br.close();
	 
  }
}
	  