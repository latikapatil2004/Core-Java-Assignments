import java.util.*;
class Qs12
{
	public static void main(String[]args)
	{
		Vector v=new Vector();
	    v.add(9);
		v.add(78);
		v.add(12);
		v.add(9);
		v.add(98);
		v.add(12);
		int sum=0;
		Iterator i=v.iterator();
		int max=0;
	while(i.hasNext())
	{
		Object obj=i.next();
		if((int)obj>max)
		{
			max=(int)obj;
		}
	}
			System.out.print("Sum Of All element "  + max);
		}
		
	}