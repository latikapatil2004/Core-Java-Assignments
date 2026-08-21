/*Using Enumeration :*/



import java.util.*;
class Qs6
{
  public static void main(String[]args)
  {
	  Vector v =new Vector();
	  v.add(10);
	  v.add(92);
	  v.add(10);
	  v.add(92);
	  v.add(10);
	  v.add(92);
	 Enumeration e=v.elements();
	  while(e.hasMoreElements())
	  {
		  Object obj=e.nextElement();
		  System.out.println(obj);
	  }
	  
  }
  }