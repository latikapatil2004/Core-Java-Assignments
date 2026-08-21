/*Using Iterator : I*/

import java.util.*;
class Qs7
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
	 Iterator i=v.iterator();
	  while(i.hasNext())
	  {
		  Object obj=i.next();
		  System.out.println(obj);
	  }
	  
  }
  }