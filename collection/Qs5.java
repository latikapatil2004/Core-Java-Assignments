/*
How to Fetch data from collection /cursor in collection 
______________________________________________________________________
Using loop 
*/

import java.util.*;
class Qs5
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
	  for(int i=0;i<v.size();i++)
	  {
		  Object obj=v.get(i);
		  System.out.println(obj);
	  }
	  
  }
  }