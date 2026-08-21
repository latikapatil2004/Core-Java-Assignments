/*Example using Vector(Collection) parameter 
_____________________________________________
*/

import java.util.*;
class Qs4
{
  public static void main(String[]args)
  {
	  Scanner sc=new Scanner(System.in);
	  ArrayList al=new ArrayList();
	  al.add(10);
	  al.add(93);
	  al.add(10);
	  al.add(93);
	  al.add(10);
	  al.add(93);
	  System.out.println("ArrayList data :  "+ al);
	  Vector v=new Vector(al);
	   System.out.println("Vector Data : "+ v);

	  
  }
}