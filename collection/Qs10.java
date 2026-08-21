import java.util.*;
class Qs10
{
	public static void main(String[]args)
	{
		Vector v=new Vector();
	    v.add(9);
		v.add(78);
		v.add(12);
		v.add(9);
		v.add(78);
		v.add(12);
		for(Object obj :v)
		{
			System.out.print(" " +obj);
		}
		
	}
}