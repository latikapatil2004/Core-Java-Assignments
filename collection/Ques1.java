/*Q1.Write a Java program to store 5 integer elements in a Vector and display all elements.
Description
Create a Vector of Integer type.
Accept 5 numbers from user.
Store them using add() method.
Display elements using loop.
Input
Enter 5 numbers:
10
20
30
40
50
Output
Vector elements are:
10
20
30
40
50*/
import java.util.Scanner;
import java.util.Vector;

public class Ques1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
	      Vector<Integer> v=new Vector<>();
	      Vector<Integer> v1=new Vector<>();
	      System.out.println("Enter number of element :");
	      int n=sc.nextInt();
	      System.out.println("Enter element : ");
	      
	      for(int i=0;i<n;i++)
	      {
	    	  v.add(sc.nextInt());
	    	  
	     }
	      v.addAll(v1);
	      System.out.println(v1);

	}

}